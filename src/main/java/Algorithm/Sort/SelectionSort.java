package Algorithm.Sort;

public class SelectionSort {
    public void selectionSort(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int minidx = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[minidx] > arr[j]) {
                    minidx = j;
                }
            }
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;
        }
    }
}
