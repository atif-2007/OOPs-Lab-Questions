/* 
Write a Java program to demonstrate multilevel inheritance by creating classes
Grandparent → Parent → Child and display methods from all classes.
*/

class Grandparent{
    void grandParent(){
        System.out.println("I am Grand Parent Class");
    }
}

class Parent extends Grandparent{
    void parent(){
        System.out.println("I am Parent Class");
    }
}

class Child extends Parent{
    void child(){
        System.out.println("I am Child Class");
    }
}

public class FirstQuestion {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.child();
        c1.parent();
        c1.grandParent();
    }
}
