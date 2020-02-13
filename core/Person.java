package sth.core;

import sth.core.exception.BadEntryException;

public abstract class Person{

  private int _id;
  private String _name;
  private int _phoneNumber;
  private String _personType;

  public Person(int id, int phoneNumber, String name){
    _id = id;
    _name = name;
    _phoneNumber = phoneNumber;
  }

  void parseContext(String context, School school) throws BadEntryException {
    throw new BadEntryException("Should not have extra context: " + context);
  }

  public String getName(){
    return _name;
  }

  public int getId(){
    return _id;
  }

  public int getPhoneNumber(){
    return _phoneNumber;
  }

  @Override
  public String toString(){
    return "";
  }

  String getPersonType(){
    return _personType;
  }

  void setPersonType(String s){
    _personType = s;
  }

  boolean isRepresentative(){
    return false;
  }
}
