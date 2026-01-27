import java.util.*;

public class NumberOfSubarrays {
  public static void main(String[] args) {
    
    int[] nums = { 1, 2, 1,2,3,3,3,3};
    int k = 3;
    System.out.println(myAppraoch(nums, k));
    System.out.println(optimalSol(nums, k));

  }
  static int myAppraoch(int[] nums, int k) {
    int n = nums.length;
    if(n == 1) {
      if(nums[0] == k) return 1; 
    }

    int cnt = 0;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      for(int j = i; j < n; j++) {
        sum += nums[j];
        if(sum == k) cnt++;
      }
      sum = 0;
    }
    return cnt;
  }
  static int optimalSol(int[] nums, int k) {
    Map<Integer, Integer> prefixSumCount = new HashMap<>();

    int prefixSum = 0;
    int count = 0;

    prefixSumCount.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
      prefixSum += nums[i];
      if(prefixSumCount.containsKey(prefixSum - k)) 
        count += prefixSumCount.get(prefixSum - k);
      prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0)+1);
    }
    return count;

  }
}
