package artem.bubblesort;

public class BubbleSort_Class
{
    private void swap(int[] array, int left, int right) {
        if (left > right) {
            int item = array[left];
            array[left] = array[right];
            array[right] = item;
        }
    }

    public void PrintArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }


    public void Sort(int[] main_array)
    {
        boolean isSwapped = false;
        do {
            for (int x = 0; x < main_array.length - 1; x++) {

                if(main_array[x] > main_array[x + 1]) {
                    isSwapped = true;
                    swap(main_array, x + 1, x);
                }
            }
        }while (!isSwapped);
    }

    public void ReadyArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
