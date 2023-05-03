import java.util.Arrays;

public class Sorting {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int c = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = c;
                }

            }

        }

        System.out.println();
        System.out.println("Sorted using bubble sort  :-   " + Arrays.toString(arr));

    }

    static void advanceBubbleSort(int[] arr) {
        boolean f = false;
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int c = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = c;
                    f = true;
                }

            }
            if (f == false) {
                // means no swap occur hence sorted
                break;
            }

        }

        System.out.println();
        System.out.println("Sorted using advance bubble sort  :-   " + Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min = i;
            for (int j = i + 1; j <= arr.length - 2; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                // swap both numbers
                int c = arr[i];
                arr[i] = arr[min];
                arr[min] = c;
            }
        }
        System.out.println();
        System.out.println("sorted using selection sort :- " + Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int c = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = c;
                } else {
                    break;
                }
            }
        }
        System.out.println();

        System.out.println("sorted using insertion sort :- " + Arrays.toString(arr));

    }

    static void mergeSort(int[] array, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, temp, left, mid);
            mergeSort(array, temp, mid + 1, right);
            merge(array, temp, left, mid, right);
        }
        // System.out.println(Arrays.toString(array));

    }

    static void merge(int[] array, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = array[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            array[k] = temp[i];
            k++;
            i++;
        }

    }

    static void quicksort(int[] arr, int s, int e) {
        if (s < e) {
            int pivot = partionFnc(arr, s, e);
            quicksort(arr, s, pivot - 1);
            quicksort(arr, pivot + 1, e);
            System.out.println();

        }
    }

    static int partionFnc(int[] arr, int s, int e) {
        int i = s;
        int j = e;
        int pivot = arr[s];
        while (i < j) {
            while (pivot >= arr[i]) {
                i++;
            }
            while (pivot < arr[j]) {
                j--;

            }
            if (i < j) {
                int c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
            }
        }
        int c = arr[j];
        arr[j] = arr[s];
        arr[s] = c;
        return j;

    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };

        System.out.println("original array is :-" + Arrays.toString(arr));

        bubbleSort(arr);
        advanceBubbleSort(arr);

        selectionSort(arr);

        insertionSort(arr);

        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
        System.out.println("sorted using merge sort :- " + Arrays.toString(arr));

        quicksort(arr, 0, arr.length-1);
        System.out.println("sorted using quick sort :- " + Arrays.toString(arr));


        
    }

}