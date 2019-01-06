package array_list;

public class ArrayList<E> {

    private static int amountElements;

    public ArrayList() {
    }

    public void add(E element){
        amountElements++;
    }

    public void add(int index, E element) {
        amountElements++;
    }

    public void clear() {
    }

    public int size() {
        return amountElements;
    }

    public boolean isEmpty() {
        return amountElements == 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        else
            return false;
    }
}
