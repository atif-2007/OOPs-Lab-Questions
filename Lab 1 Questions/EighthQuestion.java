/*
Write a Java program to create a class Animal with method sound().
Create subclasses Dog, Cat, and Cow.- Done
Override the method to print the sound made by each animal
*/

class Animal{
    void sound(){
        System.out.println("Animal is sounding");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat is meowing");
    }
}

class Cow extends Animal{
    void sound(){
        System.out.println("Cow is mooing");
    }
}
public class EighthQuestion {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();

        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();

        Cow c2 = new Cow();
        c2.sound();

        Animal a2 = new Dog();
        a2.sound();
    }
}
