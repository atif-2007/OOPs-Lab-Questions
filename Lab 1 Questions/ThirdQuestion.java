/*
Write a Java program to create a class Employee with a parameterized constructor to initialize employee id, name, and salary.
Display the employee details. 
*/

class Student{
    String name;
    int rollNo;

    Student(){
        name = "Atif";
        rollNo = 44;
    }

    void display(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rollNo);
    }
}

public class ThirdQuestion{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.display();
    }
}
