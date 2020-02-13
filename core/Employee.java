package sth.core;

public class Employee extends Person{

  public Employee(int id, int phoneNumber, String name){
    super(id, phoneNumber, name);
    this.setPersonType("EMPLOYEE");
  }
}
