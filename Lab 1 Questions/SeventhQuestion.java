/*
Write a Java program to show the use of super keyword in inheritance.
*/

class A {
    void display(){
        System.out.println("Class A is called");
    }
}

class B extends A{
    void display(){
        super.display();
        System.out.println("Class B is called");
    }
}

class C extends B{
    void display(){
        super.display();
        System.out.println("Class C is called");
    }
}


public class SeventhQuestion {
    public static void main(String[] args){
        C temp = new C();
        temp.display();
    }
}
