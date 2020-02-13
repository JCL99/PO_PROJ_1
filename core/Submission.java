package sth.core;

public class Submission{
  private String _message;
  private int _studentId;

  public Submission(String message, int studentId){
    _message = message;
    _studentId = studentId;
  }

  public int getStudentId(){
    return _studentId;
  }
}
