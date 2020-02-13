package sth.core;

import java.util.*;

public class Subject{

  private String _name;
  private int _capacity;
  private Course _course;
  private ArrayList<Project> _projectList;
  private ArrayList<Teacher> _teacherList;
  private ArrayList<Student> _studentList;

  public Subject(String name, int capacity){
    _name = name;
    _capacity = capacity;
    _teacherList = new ArrayList<Teacher>();
    _studentList = new ArrayList<Student>();
  }

  public String getName(){
    return _name;
  }

  Course getCourse(){
    return _course;
  }

  void addTeacher(Teacher teacher){
    _teacherList.add(teacher);
  }

  void enrollStudent(Student student){
    student.addSubject(this);
    _studentList.add(student);
  }

  ArrayList<Student> getSudents(){
    return _studentList;
  }

  void createProject(String name, String description){
    Project p = new Project(name, description);
    _projectList.add(p);
  }

  Project getProject(String name){
    Iterator<Project> i = _projectList.iterator();

    while(i.hasNext()){
      Project tmp = i.next();
      if(tmp.getName().equals(name)){
        return tmp;
      }
    }
    return null;
  }
}
