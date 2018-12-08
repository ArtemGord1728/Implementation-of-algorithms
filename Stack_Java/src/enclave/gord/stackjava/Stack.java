package enclave.gord.stackjava;

import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
    private List<T> elementsList;
    private int topOfStack;

    public Stack() {
        elementsList = new LinkedList<>();
    }

    public void add(T element) {
        topOfStack++;
        elementsList.add(element);
    }

    public void push(T element) {
        elementsList.set(0, element);
    }

    public void pop() {
        topOfStack--;
        elementsList.remove(0);
    }


    public T peek() {
        return elementsList.get(0);
    }

    public void remove(int index) {
        topOfStack--;
        T i = elementsList.get(index);
        elementsList.remove(i);
    }

    public void printElements() {
        for (T t : elementsList)
            System.out.println(t);
    }

    public int size() {
        return elementsList.size();
    }


    public boolean empty() {
        return elementsList.isEmpty();
    }
}
