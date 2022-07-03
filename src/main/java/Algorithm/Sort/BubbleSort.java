package Algorithm.Sort;

public class BubbleSort {
    public void bubbleSort(int arr[], int size) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int data : arr) {
            System.out.println(data + " ");
        }
    }
}
