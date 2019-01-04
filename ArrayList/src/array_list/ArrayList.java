package array_list;

public class ArrayList<E> {

    private static int amountElement;

    static {
        amountElement = 0;
    }

    public void add(E element){
        amountElement++;
    }

    public void add(int index, E element) {
        amountElement++;
    }

    public void clear() {
        amountElement = 0;
    }

    public int size() {
        return amountElement;
    }
    

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        else
            return false;
    }
}
