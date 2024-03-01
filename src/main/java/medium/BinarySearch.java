package medium;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 1, 9, 10, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //  0  1  2  3  4  5  6
        // [0, 1, 2, 5, 6, 9, 10]
        System.out.println("index of 9: " + bSearch(arr, 9)); // index of 9: 5
        System.out.println("index of 1: " + bSearch(arr, 1)); // index of 1: 1
        System.out.println("index of 7: " + bSearch(arr, 13)); // index of 7: -1
    }

    public static int bSearch(int[] arr, int target) {

        return -1 ;
    }
    }