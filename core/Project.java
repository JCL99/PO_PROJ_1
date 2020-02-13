package sth.core;

import java.util.*;

public class Project{

  private String _name;
  private String _description;
  private boolean _closed;
  private Survey _survey;
  private ArrayList<Submission> _submissionList;

  public Project(String name, String description){
    _name = name;
    _description = description;
    _closed = false;
    _submissionList = new ArrayList<Submission>();
  }

  public String getName(){
    return _name;
  }

  void close(){
    _closed = true;
  }

  Survey getSurvey(){
    return _survey;
  }

  void addSubmission(Student student, String message){
    Submission s = new Submission(message, student.getId());
    _submissionList.add(s);
  }

  ArrayList<Submission> getSubmissions(){
    return _submissionList;
  }
}
