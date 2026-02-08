/*
Write a Java program to create a class Shape with a constructor and display shape information.
Create subclasses Circle and Rectangle and initialize values using constructors.
*/

class Shape{
    Shape(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    int radius;
    Circle(int r){
        radius = r;
        System.out.println("Circle radius = " + radius);
    }
}

class Rectangle extends Shape{
    int length, breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
        System.out.println("Rectange length = " + length + " & breadth = " + breadth);
    }
}


public class SixthQuestion {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(8, 9);
    }
}
