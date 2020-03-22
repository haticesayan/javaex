package javaapplication13;

/**
 *
 * @author Hatice
 */
public class JavaApplication13 {

   int[] queue; 
    int front;
    int rear; 
    int currentSize;
    int size;

    public JavaApplication13(int size) { 
        this.queue = new int[size];
        this.front = 0;
        this.rear = 0;
        this.size = size;
        this.currentSize = 0;
    }

    public synchronized boolean add(int x) {

        if (currentSize == size) {
            throw new IllegalStateException("The queue is full: front size: " + rear);
        }

        queue[rear++] = x;
        rear = (rear + 1) % size;
        currentSize++;

        return true;
    }

    public synchronized int peek() {
        if (front == rear) {
            throw new IllegalStateException("The queue is empty");
        }
        return queue[front];
    }

    public synchronized int poll() {
        if (front > rear) {
            throw new IllegalStateException("The queue is empty");
        }
        currentSize--;
        return queue[front++];
    }
}
