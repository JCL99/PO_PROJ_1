package sth.core;

import java.util.ArrayList;
import sth.core.exception.BadEntryException;

public class Teacher extends Person{

  private ArrayList<Subject> _subjectList;

  public Teacher(int id, int phoneNumber, String name){
    super(id, phoneNumber, name);
    this.setPersonType("TEACHER");
  }

  @Override
  void parseContext(String lineContext, School school) throws BadEntryException {
    String components[] =  lineContext.split("\\|");

    if (components.length != 2)
      throw new BadEntryException("Invalid line context " + lineContext);

    Course course = school.parseCourse(components[0]);
    Subject subject = course.parseSubject(components[1]);

    subject.addTeacher(this);
  }

  void createProject(Subject subject, String name, String description){
    subject.createProject(name, description);
  }

  @Override
  public String toString(){
    return "";
  }

  ArrayList<Submission> getProjectSubmissions(Subject subject, String name){
    Project project = subject.getProject(name);
    ArrayList<Submission> submissions = project.getSubmissions();
    return submissions;
  }

  ArrayList<Student> getStudentsOfSubject(Subject subject){
    return subject.getSudents();
  }
}
