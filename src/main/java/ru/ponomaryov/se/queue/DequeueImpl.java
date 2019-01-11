package ru.ponomaryov.se.queue;

public class DequeueImpl extends QueueImpl implements Dequeue {

    public DequeueImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public void insertLeft(int value) {
        //if(front -1 < 0) {
        //    front = data.length;

//            data[--front] = value;
  //          size++;
    //    }
        if (front > DEFAULT_FRONT) {
            data[front - 1] = value;
            front--;
            size++;
        } else {
            for (int i = rear; i >= front; i--) {
                data[i+1] = data[i];
            }
            rear++;
            data[front] = value;
            size++;
        }
    }

    @Override
    public void insertRight(int value) {
        super.insert(value);
    }

    @Override
    public int removeLeft() {
        return super.remove();
    }

    @Override
    public int removeRight() {
        if (rear < 0) rear = data.length - 1;
        size--;
        return data[rear--];
    }
}
