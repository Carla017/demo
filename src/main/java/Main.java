import com.example.demo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Dluga", 22, 1, "Warszawa");
        Address address2 = new Address("Krotka",4, 5, "Poznan" );
        Address address3 = new Address("Piekna", 3, 25, "Gdansk");

        Employee employee1 = new Officeworker(1, "Jan", "Kowalski", 30, 6, 101, 90, address1);
        Employee employee2 = new Manualworker(1, "Ala", "Makowska", 46, 19, 45, address2 );
        Employee employee3 = new Rep(3, "Jan", "Michalski", 38, 11, 5.0, Efficiency.MEDIUM, address3);


        ManagerInterface manager = new Manager();
        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        manager.addEmployee(employee3);


        List<Employee> employees1 = new ArrayList<>();

        employees1.add(employee1);
        employees1.add(employee2);

        manager.addEmployees(employees1);


//        boolean isRemoved = manager.removeEmployee(1);
//        System.out.println(isRemoved);

        List<Employee> employeesExperience = manager.getEmployeeSortedbyExperienceDesc();

        for(Employee e : employeesExperience){
            System.out.println(e.toString());
        }

        System.out.println("//////////////");

        List<Employee> employeesAge= manager.getEmployeeSortedbyAgeAsc();

        for(Employee e : employeesAge){
            System.out.println(e.toString());
        }

        System.out.println("///////////////");

        List<Employee> employeesLastName = manager.getEmployeeSortedbyLastnameAsc();

        for(Employee e : employeesLastName){
            System.out.println(e.toString());
        }

        System.out.println("///////////////");

        List<Employee> employeesCity= manager.getEmployeesbyCity("Poznan");

        for(Employee e : employeesCity){
            System.out.println(e.toString());
        }
//        System.out.println("*************************************");
//        employee1.getCorporationValue();
//        employee2.getCorporationValue();
//        employee3.getCorporationValue();
    }
}
