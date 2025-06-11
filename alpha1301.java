import java.util.*;

public class alpha1301 {    
    /**
     * Bubble Sort: Sorts an array in descending order.
     * 
     * @param arr The array to be sorted.
     */
    public static void bubbleSort(int arr[]) {
        for (int turns = 0; turns < arr.length - 1; turns++) {
            int swap = 0; // Track swaps
            
            for (int j = 0; j < arr.length - 1 - turns; j++) {
                // Swap if current is less than next
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            // Exit if no swaps
            if (swap == 0) {
                break;
            }
        }
    }

    /**
     * Selection Sort: Sorts an array in descending order.
     * 
     * @param arr The array to be sorted.
     */
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i; // Assume current position is minimum
            
            // Find the maximum in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j; // Update minPos
                }
            }

            // Swap with the first unsorted element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Insertion Sort: Sorts an array in descending order.
     * 
     * @param arr The array to be sorted.
     */
    public static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i]; // Current element
            int prev = i - 1; // Previous index

            // Shift elements less than current to the right
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Place current in the correct position
            arr[prev + 1] = curr;
        }
    }

    /**
     * Counting Sort: Sorts an array in descending order.
     * 
     * @param arr The array to be sorted.
     */
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // Find the largest element
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int[] count = new int[largest + 1]; // Count array
        // Count occurrences
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        // Build the output array in descending order
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i; // Place element
                j++;
                count[i]--;
            }
        }
    }

    /**
     * Prints the array elements.
     * 
     * @param arr The array to be printed.
     */
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element
        }
        System.out.println(); // New line after printing
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 5, 2, 7}; // Sample array
        
        // Sort the array using Selection Sort
        selectionSort(arr);
        
        // Print the sorted array
        printArr(arr);
    }
}
