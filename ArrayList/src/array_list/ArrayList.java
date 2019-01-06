package array_list;

public class ArrayList<E> {

    private static int amountElements;
    private E[] arr;

    static {
        amountElements = 0;
    }

    public void add(E element){
        amountElements++;
        arr[amountElements] = element;
    }

    public void add(int index, E element) {
        amountElements++;
    }

    public void clear() {
        amountElements = 0;
    }

    public int size() {
        return amountElements;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        else
            return false;
    }
}
