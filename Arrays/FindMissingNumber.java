import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
  static int adding(int[] nums) {
    int res = nums.length;

    for (int i = 0; i < nums.length; i++) {
      res += i - nums[i];
    }

    return res;
  }
  
  static int sorting(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;

    if(nums[0] != 0) return 0;
    if(nums[n-1] != n) return n;

    for (int i = 1; i < nums.length; i++) {
      if(nums[i] !=i) return i;
    }

    return 0;
  }
  static int summing(int[] nums) {
    int n = nums.length;
    int expectedSum = (n*(n+1))/2;
    int actualSum = Arrays.stream(nums).sum();

    return expectedSum-actualSum;
  }
  static int xoring(int[] nums) {
    int n = nums.length;
    int res1 = 0, res2 = 0;
    for (int i = 1; i <= n; i++) {
      res1 ^= i;
      res2 ^= nums[i - 1];
    }
    return res1 ^ res2;

  }

  public static void main(String[] args) {
    int[] arr = {1,3,4,2,6,0};
    System.out.println(xoring(arr));
    System.out.println(adding(arr));
    System.out.println(summing(arr));
    System.out.println(sorting(arr));

  }
}