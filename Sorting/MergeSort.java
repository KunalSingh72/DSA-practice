import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

  static void mergeSort(int[] arr, int low, int high){

    if(low >= high){
      return;
    }
    int mid = low + (high - low)/2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid+1, high);
    merge(arr, low, mid, high);
  }
  static void merge(int[] arr, int low, int mid, int high){

    List<Integer> temp = new ArrayList<>();
    int left = low, right = mid + 1;

    while(left<=mid && right <= high){
      if(arr[left] <= arr[right]){
        temp.add(arr[left++]);
      } else{
        temp.add(arr[right++]);
      }
    }
    while (left<=mid){
      temp.add(arr[left++]);
    }
    while (right<=high){
      temp.add(arr[right++]);
    } 

    for(int i = low; i <= high; i++){
      arr[i] = temp.get(i-low);
    }
  }
  public static void main(String[] args) {
    
    int[] arr = {5, 4, 7, 2, 9, 1, 8, 3};
    
    if(arr.length<=1){
      System.out.println(Arrays.toString(arr));
    } else {
      mergeSort(arr, 0, arr.length-1);
      System.out.println(Arrays.toString(arr));
    }
    
    
  }
}
