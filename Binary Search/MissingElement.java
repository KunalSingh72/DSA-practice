import java.util.ArrayList;

public class MissingElement {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4};
    int k = 2;
    myApproach(arr, k);
  }
  static int myApproach(int[] arr, int k) {

    int low = 0, high = arr.length-1;
    while(low <= high) {
      int mid = low + (high - low)/2;

      int Missing = arr[mid] - (mid+1);
      if(Missing < k) {
        low = mid +1;
      } else {
        high = mid - 1;
      }
    }
    

    return high+k+1;
  }
}