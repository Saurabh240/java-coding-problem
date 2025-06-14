package src.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * FIFO -> First in First Out
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new ArrayDeque<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.offer(9);
        System.out.println(integerQueue);

    }
}