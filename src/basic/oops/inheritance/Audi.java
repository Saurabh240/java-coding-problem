package src.basic.oops.inheritance;

/**
 * Final variable  , method , class  cannot be overridden
 * A final class cannot be overriden or extended
 * A final variable is mandatory to assign value and once the value assigned cannot be changed
 *
 *
 */
public class Audi extends Car {
    private String feature;

    private static final int speed;

//    public  Audi() {
//        speed = 50;
//    }

    static {
        speed = 50;
    }


    public static void main(String[] args) {
        Car audi = new Audi();
    }
    public void print() {
        System.out.println("In Audi class");
    }
}