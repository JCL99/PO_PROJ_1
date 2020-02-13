package sth.core;

import java.util.*;

public class Course{

  private String _name;
  private ArrayList<Subject> _subjectList;
  private ArrayList<Student> _studentList;
  private ArrayList<Student> _representativeList;

  public Course(String name){
    _name = name;
    _subjectList = new ArrayList<Subject>();
    _studentList = new ArrayList<Student>();
    _representativeList = new ArrayList<Student>();
  }

  String getName(){
    return _name;
  }

  void addSubject(Subject subject){
    _subjectList.add(subject);
  }

  void addStudent(Student student){
    _studentList.add(student);
  }

  void addRepresentative(Student student){
    _representativeList.add(student);
  }

  Subject parseSubject(String subjectName){
    Iterator<Subject> i = _subjectList.iterator();

    while(i.hasNext()){
      Subject tmp = i.next();
      if (tmp.getName().equals(subjectName)){
        return tmp;
      }
    }
    return null;
  }
}
