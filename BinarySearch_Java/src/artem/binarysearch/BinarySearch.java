package artem.binarysearch;

public class BinarySearch
{
    public int searchItem(int[] listItems, int item)
    {
        int lowElem = 0;
        int highElem = listItems.length - 1;

        while (lowElem <= highElem)
        {
            int middle = (lowElem + highElem) / 2;
            int guessItem = listItems[middle];

            if(guessItem == item)
                return item;

            if(guessItem < item)
                lowElem = middle - 1;
            else
                highElem = middle + 1;
        }

        return 0;
    }
}
