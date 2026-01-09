import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    
    int[] arr = {1, 2, 3, 4, 6};
    System.out.println(Arrays.toString(reverse(arr, 0, arr.length-1)));

  }
  static int[] reverse(int[] arr, int start, int end){
    if(start>=end){
      return arr;
    }

    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    // arr[start] = arr[start] ^ arr[end];
    // arr[end] = arr[start] ^ arr[end];
    // arr[start] = arr[start] ^ arr[end];
    
    // arr[start] = arr[start] + arr[end];
    // arr[end] = arr[start] - arr[end];
    // arr[start] = arr[start] - arr[end];

    return reverse(arr, start+1, end-1);

  }
}
