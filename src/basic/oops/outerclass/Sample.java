package src.basic.oops.outerclass;

public class Sample {

    /**
     * static > instance > constructor
     */
    static {
        System.out.println("in static block");
    }

    {
        System.out.println("in instance block");
    }
    public Sample() {
        System.out.println("In constructor");
    }
    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println("In main method");
    }
}