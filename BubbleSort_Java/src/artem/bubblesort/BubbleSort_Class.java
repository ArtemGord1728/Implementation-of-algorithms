package artem.bubblesort;

public class BubbleSort_Class
{
    public int Swap(int array[], int right, int left)
    {
        int item = 0;
        if(right < left)
        {
            item = array[right];
            array[right] = array[left];
            array[left] = item;
        }
        return item;
    }

    public void Sort(int main_array[])
    {
        for(int x = 0; x < main_array.length; x++)
        {
            Swap(main_array, x , x + 1);
        }
    }
}
