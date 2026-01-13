import java.util.Arrays;

public class checkSorting {
  public static void main(String[] args) {
    
    int[] arr = {1, 2, 3};
    int[] arr2 = {1, 50, 2, 3, 4};
    int[] arr3 = {2, 3, 1, 4, 5};
    int[] arr4 = {1, 4, 2, 3};
    int[] arr5 = {4,5,1,2,3};
    sort(arr);
    sort(arr2);
    sort(arr3);
    sort(arr4);
    sort(arr5);
    optimalApproach(arr);
  }
  static void optimalApproach(int[] arr){
    int count = 0;
    int n = arr.length;

    for(int i = 1; i < n; i++){
      if(arr[i-1] > arr[i]) count++;
      
    }
    System.out.println(count==0);
  } 
  static void sort(int[] arr){
    int i = 0;
    int j = arr.length-1;
    boolean result = true;
    while(i<j){
      if(!(arr[i]<=arr[j] && arr[j]>=arr[j-1] && arr[i]<=arr[i+1])){
        result = false;
        break;
      } 
      i++;
      j--;
    }
    System.out.println();
    System.out.println("Result for" + Arrays.toString(arr) + " is: " + result);
    System.out.println();

  }
}
