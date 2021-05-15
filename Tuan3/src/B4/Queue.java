package B4;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<T>();
    }

    public boolean add(T v) {
        queue.add(v);
        if (queue.contains(v)) {
            return true;
        }
        return false;
    }

    public T poll() {
        T a = queue.get(0);
        queue.remove(0);
        return a;
    }

    public T peek() {
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public LinkedList<T> getQueue() {
        return queue;
    }
}
