package com.subh.builderpattern.model;

//making class final so it can't be extended and setters cannot be created
public final class Employee {

  private final String name;
  private final int id;
  private final double salary;

  public Employee(EmployeeBuilder eb) {
    this.name = eb.getName();
    this.id = eb.getId();
    this.salary = eb.getSalary();
  }

  public static EmployeeBuilder builder() {
    return new EmployeeBuilder();
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public double getSalary() {
    return salary;
  }

}
