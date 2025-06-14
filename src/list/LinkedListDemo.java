package src.list;

import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList -> 1) Random access of elements is fast
 *
 *
 *
 * LinkedList -> Random access of elements is slow
 * head and tail
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(5);
        integerList.add(4);
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);
        integerList.remove(3);
        System.out.println(integerList);

    }
}