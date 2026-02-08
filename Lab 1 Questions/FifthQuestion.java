/*
Write a Java program to show the order of execution of constructors in multilevel inheritance using suitable classes
*/

class A {
    A(){
        System.out.println("A class is called!");
    }
}

class B extends A {
    B(){
        System.out.println("B class is called!");
    }
}

class C extends B{
    C(){
        System.out.println("C class is called!");
    }
}
public class FifthQuestion{
    public static void main(String [] args){
        C temp = new C();
    }
}
