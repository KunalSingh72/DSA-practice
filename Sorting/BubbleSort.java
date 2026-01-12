import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    
    int[] arr = {32,31,67,332,7,22,5,7,22,13};
    int n = arr.length;
    boolean didSwap = false;
    for(int i = n-1; i > 0; i--){
      
      for(int j = 0; j < i; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            didSwap = true;    
        }
      }
      if(!didSwap){
        break;
      }
    }

    System.out.println(Arrays.toString(arr));
  }
}
