package src.basic.oops.polymorphism;

/**
 * super keyword is used to call the parent class method or variable
 * this keyword is used to call the same class method or variable
 * static method cannot be overridden but it can provide method hiding
 * Compile Time Polymorphism (Method Overloading)
 * Runtime Polymorphism (Method Overriding)
 * Dynamic Method Dispatch (Which method will be called at runtime)
 *
 */
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Boww Boww");
    }
    public static void setSpeed(int speed) {
        System.out.println("Set speed in child using integer");
    }
    public static void setSpeed(double speed) {
        System.out.println("Set speed in child using double");
    }

    public static void main(String[] args) {
//       Animal animal = new Animal();
//       Dog dog = new Dog();
//       dog.makeSound();
//        setSpeed(50);
//        setSpeed(50.0);
        Dog dog = new Dog(); // reference of Dog and Object of Dog
        Animal animal = new Animal();
//        Dog dog1 = (Dog) new Animal(); // This will throw class cast exception
//        Animal animal1 = new Dog(); // reference of Animal and Object of Dog

        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        //Upcasting means you are widening or casting to higher data type
        int i =10;
        long l = i;
        //Downcasting means you are narrowing or casting to lower data type
        long l1 = 15;
        if(animal instanceof Dog) {
            System.out.println("dog is instance of Dog");
        }
    }
}