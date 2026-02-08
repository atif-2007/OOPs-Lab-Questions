/*
Write a Java program to create a class Student with a default constructor that initializes student name and roll number.
Display the details using a method. 
*/

class College{
    College(){
        System.out.println("College Constructor!");
    }
}

class ClassRoom extends College{
    ClassRoom(){
        System.out.println("ClassRoom Constructor!");
    }
}

class Student extends ClassRoom{
    Student(){
        System.out.println("Student Constructor!");
    }
}

public class FourthQuestion {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
