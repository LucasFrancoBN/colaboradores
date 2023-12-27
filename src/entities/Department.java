package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
  private String name;
  private Integer payDay;
  List<Employee> employees = new ArrayList<>();
  private Address address;

  public Department(String name, Integer payDay, Address address) {
    this.name = name;
    this.payDay = payDay;
    this.address = address;
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public void removeEmployee(Employee employee) {
    employees.remove(employee);
  }

  public double payroll() {
    double sumOfSalary = 0.0;
    for(Employee employee : employees) {
      sumOfSalary += employee.getSalary();
    }
    return sumOfSalary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPayDay() {
    return payDay;
  }

  public void setPayDay(Integer payDay) {
    this.payDay = payDay;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<Employee> getEmployees() {
    return employees;
  }
}
