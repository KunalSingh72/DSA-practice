import java.util.HashMap;
import java.util.List;

public class LongestSubarrayLength {
  public static void main(String[] args) {
    int nums[] = { 5, 6, 3, 6, -2, 6, -2, 2, -6, -4, 0 };
    System.out.println(myApproach(nums));
    System.out.println(optimalApproach(nums));
  } 
  
  static int optimalApproach(int[] nums) {
    HashMap<Integer, Integer> mpp = new HashMap<>();

    int maxx = 0;
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      if(sum == 0){
        maxx = i+1;
      } else {
        if(mpp.containsKey(sum)) {
          maxx = Math.max(maxx, i - mpp.get(sum));
        } else {
          mpp.put(sum, i);
        }
      }
    }
    return maxx;


  }
  static int myApproach(int[] nums) {
   
    int maxx = 0;
    int sum = 0;
    int cnt = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        cnt++;
        if (sum == 0 && maxx < cnt) {
          maxx = cnt;
          System.out.println(i);
        } 
      }
      cnt = 0;
      sum=0;
    }
    return maxx;
  }
}
