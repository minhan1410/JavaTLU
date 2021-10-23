package Tuan3.Bai4_5_6_7_8;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<T>();
    }

    public void push(T v) {
        stack.add(0, v);
    }

    public T  pop() {
        T v=stack.get(0);
        stack.remove(0);
        return v;
    }

    public T peek(){
        return stack.get(0);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
