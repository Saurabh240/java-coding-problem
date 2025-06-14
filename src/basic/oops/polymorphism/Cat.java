package src.basic.oops.polymorphism;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}