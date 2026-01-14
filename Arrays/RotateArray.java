import java.util.Arrays;

public class RotateArray {
  public static void main(String[] args) {
    
    myApproach();
    optimalAnswer();
    
  } 
  static void myApproach(){
    int[] arr = {1,2,3,4,5,6,7};
    int n = arr.length;
    int[] temp = new int[n]; 
    int k = 3;

    for(int i = 0; i<n; i++){
      temp[(i + k) % n] = arr[i];
    }
    System.out.println(Arrays.toString(temp));
  }
  static void optimalAnswer(){

    int[] arr = {1,2,3,4,5,6,7};
    int n = arr.length;
    int k = 3;
    k%=n;
    reverse(arr,0,n-1);
    reverse(arr,0,k-1);
    reverse(arr,k,n-1);

    System.out.println(Arrays.toString(arr));

  }
  static void reverse(int[]nums,int start,int end){
    while(start<end){
      int temp=nums[start];
      nums[start]=nums[end];
      nums[end]=temp;
      start++;
      end--;
  }
  
}
}
