package artem.bubblesort;

public class Main {

    public static void main(String[] args)
    {
        int mas[] = {4, 3, 4, 8};
        BubbleSort_Class b_sort = new BubbleSort_Class();
        b_sort.printArray(mas);
        b_sort.sort(mas);
        b_sort.readyArray(mas);
    }
}
