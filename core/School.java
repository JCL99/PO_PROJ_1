package sth.core;

import java.util.List;
import sth.core.Person;

import sth.core.exception.BadEntryException;
import sth.core.exception.NoSuchPersonIdException;


import java.io.IOException;
import java.util.*;

/**
 * School implementation.
 */
public class School implements java.io.Serializable {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201810051538L;

  private String _nome;
  private int _nextPersonId = 10000;
  private ArrayList<Person> _personList;
  private ArrayList<Course> _courseList;

  public School(){
    _nome = "TagusPark";
    _personList = new ArrayList<Person>();
    _courseList = new ArrayList<Course>();
  }

  /**
   * @param filename
   * @throws BadEntryException
   * @throws IOException
   */
  void importFile(String filename) throws IOException, BadEntryException {
    Parser myParser = new Parser(this);
    myParser.parseFile(filename);
  }

  /**
   * @param id
   * @throws NoSuchPersonIdException
   */
  Person getPerson(int id) throws NoSuchPersonIdException{
    Iterator<Person> i = _personList.iterator();

    while(i.hasNext()){
      Person tmp = i.next();
      if (tmp.getId() == id){
        return tmp;
      }
    }
    throw new NoSuchPersonIdException(id);
  }

  /**
   * @param person
   */
  void addPerson(Person person){
    _personList.add(person);
  }

  /**
   * @param courseName
   */
  Course parseCourse(String courseName){
    Iterator<Course> i = _courseList.iterator();

    while(i.hasNext()){
      Course tmp = i.next();
      if (tmp.getName().equals(courseName)){
        return tmp;
      }
    }
    return null;
  }

}
