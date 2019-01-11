package ru.ponomaryov.se.queue;

public interface Dequeue extends Queue{

    void insertLeft(int value);

    void insertRight(int value);

    int removeLeft();

    int removeRight();
}
