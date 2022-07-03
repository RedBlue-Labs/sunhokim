package Algorithm.Sort;

public class InsertionSort {
    public void insertionSort(int arr[], int size) {
        for(int i = 0; i < size; i++) {
            int temp = arr[i];
            int j = i - 1;

            for(; j >= 0; j--) {
                if (arr[j] < temp) break;

                arr[j + 1] = arr[j];
            }

            arr[j + 1] = temp;
        }

        for (int data : arr) {
            System.out.println(data + " ");
        }
    }
}
