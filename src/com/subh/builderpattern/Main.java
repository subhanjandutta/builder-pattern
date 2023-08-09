package com.subh.builderpattern;

import com.subh.builderpattern.model.Employee;

public class Main {
  public static void main(String[] args) {
    Employee e = Employee.builder()
            .setId(700)
            .setName("James Bond")
            .setSalary(1000.00)
            .build();
    System.out.println("ID: "+e.getId()+" | Name: "+e.getName()+" | Salary: GBP "+e.getSalary());

  }
}