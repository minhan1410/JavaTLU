package Tuan3.Bai4_5_6_7_8;

import java.util.LinkedList;

public class Queue <T>{
    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<T>();
    }

    public boolean add(T v){
        return queue.add(v);
    }

    public T poll(){
        T v=queue.get(0);
        queue.remove(0);
        return v;
    }

    public T peek(){
        return queue.get(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
