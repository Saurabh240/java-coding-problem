package src.basic.condition;

public class IfElseDemo {

    /*
    if (condition) {
    //do something
    } else {
    // do something
    }
    }

    else {
    }
     */
    public static void main(String[] args) {
        if(3<4) {
            System.out.println("3 less than 4");
        } else if (4<5) {
            System.out.println("4 is less than 5");
        } else {
            System.out.println("Inside else block");
        }
    }
}