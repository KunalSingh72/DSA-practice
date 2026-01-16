
public class LongestSubArray {
  public static void main(String[] args) {
    int[] arr = {1,2,-2,-3,5,2,3,5,-1,1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1,1,1,1,1};
    System.out.println(looping(arr, 4));
  }
  static int looping(int[] nums, int k){
    int ans = 0;
    for(int i = 0; i < nums.length; i++){
      int sum = 0;
      for(int j = i; j < nums.length; j++){
        sum+=nums[j];
        // System.out.println(sum);
        if(sum == k){
          ans = Math.max(ans, j - i + 1);
        } 
      }
    }
    return ans;
  }
}
