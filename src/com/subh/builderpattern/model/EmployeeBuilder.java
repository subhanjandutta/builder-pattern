package com.subh.builderpattern.model;

public class EmployeeBuilder {
  private String name;
  private int id;
  private double salary;

  public EmployeeBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public EmployeeBuilder setId(int id) {
    this.id = id;
    return this;
  }

  public EmployeeBuilder setSalary(double salary) {
    this.salary = salary;
    return this;
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

  public Employee build() {
    return new Employee(this);
  }
}
