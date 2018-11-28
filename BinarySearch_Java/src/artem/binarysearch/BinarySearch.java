package artem.binarysearch;

public class BinarySearch {
    public void searchItem(int[] listItems, int item) {
        int lowElem = 0;
        int highElem = (listItems.length) - 1;

        while (lowElem <= highElem) {

            int middle = (lowElem + highElem) / 2;
            int guessItem = listItems[middle];

            if (guessItem == item) {
                System.out.println("Index of value " + item + " equals " + middle);
                return;
            }

            if (guessItem < item)
                lowElem = middle - 1;
            else
                highElem = middle + 1;
        }
    }
}
