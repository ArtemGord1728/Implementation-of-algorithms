package artem.binarysearch;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 5};
        Scanner scanner = new Scanner(System.in);
        int elem = scanner.nextInt(arr.length);
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.searchItem(arr, elem);
    }
}
