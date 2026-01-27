import java.util.*;
public class FourSum {
  public static void main(String[] args) {
    
    int nums[] = {5,6,3,6,3,6,-2,-5,-6,-4,2};
    System.out.println(myApproach(nums, 12));
    System.out.println(optimalApproach(nums, 12));

  }
  static List<List<Integer>> optimalApproach(int[] nums, int target) {
    int n = nums.length;
    Set<List<Integer>> ans = new HashSet<>();

    Arrays.sort(nums);
    
    for(int i=0; i<n; i++) {
      if(i > 0 && nums[i] == nums[i-1]) continue;

      for(int j=i+1; j<n; j++) {
        if (j > i+1 && nums[j] == nums[j - 1]) continue;

        int left = j+1, right = n-1;
        while(left < right) {
          long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
          if (sum == target){
            ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
            left++;
            right--;

            while(left < right && nums[left] == nums[left-1]) left++;
            while (left < right && nums[right] == nums[right + 1]) right--;
          } 
          else if(sum > target) right--;
          else left++;
        }
      }
    }

    return new ArrayList<>(ans);
  }

  static List<List<Integer>> myApproach(int[] nums, int target) {

    int n = nums.length;
    Set<List<Integer>> ans = new HashSet<>();

    for(int i=0; i<n; i++) {
      for (int j = i+1; j < n; j++) {
        HashSet<Integer> seen = new HashSet<>();

        for(int k=j+1; k<n; k++) {
          long required = (long) target - nums[i] - nums[j] - nums[k];

          if(seen.contains((int) required)) {
            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) required);
            Collections.sort(temp);
            ans.add(temp);
          }
          seen.add(nums[k]);

        }
      }
    }
    return new ArrayList<>(ans);
  }
}