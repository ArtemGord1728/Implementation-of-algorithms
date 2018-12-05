package enclave.gord.stackjava;

import java.util.ArrayList;
import java.util.List;

public class Stack<T>
{
    private List<Object> elementsList = new ArrayList<>();
    private int topOfStack;

    public Stack(List<Object> elementsList)
    {
        this.elementsList = elementsList;
    }

    public Stack() {
    }

    public void add(Object element){
        topOfStack++;
        elementsList.add(element);
    }

    public boolean empty()
    {
        return elementsList.isEmpty();
    }
}
