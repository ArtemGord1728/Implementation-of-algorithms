package artem.binarysearch;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4};
	    int elem = 3;
        BinarySearch binarySearch = new BinarySearch();
        int res = binarySearch.searchItem(arr, elem);
        System.out.println(res);
    }
}
