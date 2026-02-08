/*
Write a Java program to create a class Employee with methods getSalary() and getDetails().
Create two subclasses Manager and Developer.
Override the methods in each subclass to display salary and details specific to each role.
*/

import java.util.Scanner;

class Employee{
    void getSalary(){
        System.out.println("Salary of Employee");
    }
    void getDetails(){
        System.out.println("Details of Employee");
    }
}

class Manager extends Employee{
    void getSalary(){
        System.out.println("Salary = 50000");
    }
    void getDetails(){
        System.out.println("Name of Employee: Abdullah Atif");
    }
}

class Developer extends Employee{
    void getSalary(){
        System.out.println("Salary = 500000");
    }
    void getDetails(){
        System.out.println("Name of Employee: Abdullah");
    }
}
 
public class NinthQuestion {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getSalary();
        e.getDetails();

        Manager m = new Manager();
        m.getSalary();
        m.getDetails();

        Developer d = new Developer();
        d.getSalary();
        d.getDetails();

        Employee e2 = new Manager();
        e.getDetails();
    }
}
