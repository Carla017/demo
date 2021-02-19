package com.example.demo;

import java.util.List;

public interface ManagerInterface {
    void addEmployee(Employee employee);
    boolean removeEmployee(int id);
    void addEmployees(List<Employee> employees);

    List<Employee> getEmployeeSortedbyExperienceDesc();
    List<Employee> getEmployeeSortedbyAgeAsc();
    List<Employee> getEmployeeSortedbyLastnameAsc();
    List<Employee> getEmployeesbyCity(String city);


}
