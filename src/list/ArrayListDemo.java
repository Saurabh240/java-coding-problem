package src.list;

import src.basic.oops.interfaces.MyInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * () if you have no variable or more than one variable
 * -> arrow to define the lambda expression
 * operation
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(4);
        list.add(5);
        list.forEach(num -> System.out.println(num) );

        // 16 -> initial size and load factor is 0.75

        MyInterface myInterface = () -> System.out.println("This is a functional interface");
        myInterface.setSpeed();

    }
}