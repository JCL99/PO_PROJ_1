package sth.core;

import java.util.*;
import sth.core.exception.BadEntryException;

public class Student extends Person{

  private boolean _isRepresentative;
  private Course _course;
  private ArrayList<Subject> _subjectList;

  public Student(int id, int phoneNumber, String name, boolean isRepresentative){
    super(id, phoneNumber, name);
    _isRepresentative = isRepresentative;
    this.setPersonType("STUDENT");
  }

  @Override
  void parseContext(String lineContext, School school) throws BadEntryException {
    String components[] =  lineContext.split("\\|");

    if (components.length != 2)
      throw new BadEntryException("Invalid line context " + lineContext);

    if (_course == null) {
      _course = school.parseCourse(components[0]);
      _course.addStudent(this);
    }

    Subject subject = _course.parseSubject(components[1]);

    subject.enrollStudent(this);
  }

  Course getCourse(){
    return _course;
  }

  void addSubject(Subject subject){
    _subjectList.add(subject);
  }

  @Override
  boolean isRepresentative(){
    return(_isRepresentative);
  }

  void setRepresentative(boolean tf){
    _isRepresentative = tf;

    if(tf){

    }
  }

  @Override
  public String toString(){
    return "";
  }

  void submitAnswerToSurvey(Submission submission, Survey survey){
    survey.addAnswer(submission);
  }

  void submitProject(Project project){

  }
}
