import java.util.Arrays;

public class RecursiveBubbleSort {
  public static void main(String[] args) {
    int[] arr = {3, 4, 1, 6, 2, 4};

    bubbleSort(arr, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
  static void bubbleSort(int[] arr, int high){
    if(high == 0){
      return;
    }

    int j = 0;
    while(j<high){
      if(arr[j] > arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
      j++;
    }
    
    bubbleSort(arr, high-1);
  }
}
