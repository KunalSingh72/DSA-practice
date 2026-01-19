import java.util.Arrays;

public class MaximumSubarray {
  public static void main(String[] args) {
    
    int[] arr = { -2, 1, 23,1,2,3,4,5,2,4,1};

    System.out.println(looping(arr));
    // System.out.println(counter(arr));

  }
  static int looping(int[] nums){
    
    long max = Long.MIN_VALUE;
    long sum = 0;
    int ansStart = -1, ansEnd = -1;
    int start = 0;
    for (int i = 0; i < nums.length; i++) {
      if(sum == 0){
        start = i;
      }
      sum += nums[i];
      if (sum > max) {
        max = sum;
        ansStart = start;
        ansEnd = i;
      }
      if (sum < 0) {
        sum = 0;
      }
    }
    System.out.println(ansStart + " " + ansEnd);
    return (int) max;
  }
}
