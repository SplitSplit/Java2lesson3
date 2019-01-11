package ru.ponomaryov.se.stack;

public interface Stack {

    void push(char value);

    char pop();

    char peek();

    boolean isEmpty();

    boolean isFull();

    int getSize();
}
