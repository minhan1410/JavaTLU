package B4;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<T>();
    }

    public boolean push(T v) {
        stack.add(0, v);
        if (stack.contains(v)) {
            return true;
        }
        return false;
    }

    public T pop() {
        T a = stack.get(0);
        stack.remove(0);
        return a;
    }

    public T peek() {
        return stack.get(0);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public LinkedList<T> getStack() {
        return stack;
    }
}
