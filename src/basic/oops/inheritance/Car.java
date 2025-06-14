package src.basic.oops.inheritance;

/**
 * Inheritance -> Child class inherits the property of parent class
 * It is achieved by using extends keyword
 * Parent class  name , age
 * Child class name , age and salary
 * You can not extend more than one clas (Multiple inheritance not supported)
 */
public class Car {

    String engine;
    String color;
    String speed;

    public void print() {
        System.out.println("In Car class");
    }

}