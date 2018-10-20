package artem.bubblesort;

public class BubbleSort_Class
{
    public void swap(int array[], int right, int left)
    {
        if(right < left)
        {
            int item = array[left];
            array[left] = array[right];
            array[right] = item;
        }
    }

    public void Sort(int main_array[])
    {
        for(int x = 0; x < main_array.length - 1; x++)
        {
            swap(main_array, x - 1, x + 1);
        }
    }
}
