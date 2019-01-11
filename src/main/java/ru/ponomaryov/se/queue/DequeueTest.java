package ru.ponomaryov.se.queue;

public class DequeueTest {

    public static void main(String[] args) {
        DequeueImpl dequeue = new DequeueImpl(10);

        dequeue.insertRight(35);    // 35
        dequeue.insertRight(25);    // 35 25
        dequeue.insertRight(15);    // 35 25 15
        dequeue.insertLeft(5);      // 5 35 25 15
        dequeue.insertLeft(1);      // 1 5 35 25 15

        while (!dequeue.isEmpty()) {
            System.out.println(removeLeft(dequeue)); // 1 5 35 25 15
        }
        System.out.println();
        insertLeft(dequeue,1);      // 1
        insertRight(dequeue, 2);    // 1 2
        insertLeft(dequeue,3);      // 3 1 2
        insertRight(dequeue,4);     // 3 1 2 4
        insertLeft(dequeue,5);      // 5 3 1 2 4
        insertRight(dequeue,6);     // 5 3 1 2 4 6
        insertLeft(dequeue,7);      // 7 5 3 1 2 4 6
        insertRight(dequeue,8);     // 7 5 3 1 2 4 6 8

        while (!dequeue.isEmpty()) {
            System.out.println(removeRight(dequeue)); // 8 6 4 2 1 3 5 7
        }
    }

    private static void insertRight(DequeueImpl deq, int value) {
        if(!deq.isFull()) {
            deq.insertRight(value);
        }
    }

    private static void insertLeft(DequeueImpl deq, int value) {
        if(!deq.isFull()) {
            deq.insertLeft(value);
        }
    }

    private static int removeRight(DequeueImpl deq) {
        if(!deq.isEmpty()) {
            return deq.removeRight();
        }
        return -1;
    }

    private static int removeLeft(DequeueImpl deq) {
        if(!deq.isEmpty()) {
            return deq.removeLeft();
        }
        return -1;
    }
}
