import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 5, 7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {   // outer loop
            for (int j = i + 1; j > 0; j--) {        // inner loop
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);             // swap adjacent
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

