import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
  public static void main(String[] args) {
    int[] arr = {1,2,3,1,1,1,1,1,1,3,3,5,1};
    System.out.println(looping(arr, 6));
  }
  static int looping(int[] nums, int k){
    int ans = 0;
    for(int i = 0; i < nums.length; i++){
      int sum = 0;
      for(int j = i; j < nums.length; j++){
        sum+=nums[j];
        if(sum == k){
          ans = Math.max(ans, j - i + 1);
        } else if(sum > k){
          break;
        }
      }
    }
    return ans;
  }
}
