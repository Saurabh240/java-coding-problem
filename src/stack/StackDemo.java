package src.stack;

import java.util.Stack;

/**
 * LIFO Last in First Out
 *
 */
public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> integers = new Stack<>();
        integers.push(3); //[3,1,7]
        integers.push(1);
        Integer push = integers.push(7);
        boolean add = integers.add(9);
        System.out.println(integers);
    }
}