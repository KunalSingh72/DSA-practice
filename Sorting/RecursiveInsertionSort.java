import java.util.Arrays;

public class RecursiveInsertionSort {
  public static void main(String[] args) {
    int[] arr = {3, 4, 1, 2, 4};

    insertionSort(arr, 1, arr.length);
    System.out.println(Arrays.toString(arr));
  }
  static void insertionSort(int[] arr, int i, int n){
    if(i >= n){
      return;
    }
    
    int j = i;
    while(j > 0 && arr[j-1] > arr[j]){
      int temp = arr[j-1];
      arr[j-1] = arr[j];
      arr[j] = temp;
      j--;
    }

    insertionSort(arr, i+1, n);
  }
}
