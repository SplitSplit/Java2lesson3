package ru.ponomaryov.se.stack;

public class StackImpl implements Stack {

    private char[] data;
    private int size;

    public StackImpl(int maxSize) {
        this.data = new char[maxSize];
        this.size = 0;
    }

    @Override
    public void push(char value) {
        if(isFull()) {
            throw new RuntimeException("Stack is full!");
        }
        data[size++] = value;
    }

    @Override
    public char pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return data[--size];
    }

    @Override
    public char peek() {
        return !isEmpty() ? data[size - 1] : ' ';
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }
}
