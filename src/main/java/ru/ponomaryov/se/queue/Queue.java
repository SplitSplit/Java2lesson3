package ru.ponomaryov.se.queue;

public interface Queue {

    void insert(int value);

    int remove();

    int peek();

    boolean isEmpty();

    boolean isFull();

    int getSize();
}
