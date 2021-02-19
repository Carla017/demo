package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Manager implements ManagerInterface {

   private List<Employee> employees;


    public Manager(){
        this.employees = new ArrayList<>();
    }


    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean removeEmployee(int id) {
        boolean isExist = false;

        Iterator <Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                isExist = true;
            }

        }

        return isExist;
    }

    @Override
    public void addEmployees(List<Employee> employees) {
        this.employees.addAll(employees);

    }

    @Override
    public List<Employee> getEmployeeSortedbyExperienceDesc() {

        employees.sort((o1, o2) -> o2.getExperience() - o1.getExperience());

        return employees;
    }

    @Override
    public List<Employee> getEmployeeSortedbyAgeAsc() {
        
        employees.sort((o1, o2) -> o1.getAge() - o2.getAge());

        return employees;
    }

    @Override
    public List<Employee> getEmployeeSortedbyLastnameAsc() {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        });

        return employees;

    }

    @Override
    public List<Employee> getEmployeesbyCity (String city) {

        List <Employee> employeesByCity = new ArrayList<>();

        for(Employee e : employees){
            if(e.getAddress().getCity().equals(city)){
                employeesByCity.add(e);
            }
        }

      return employeesByCity;
    }


}
