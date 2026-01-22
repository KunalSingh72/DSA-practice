import java.util.*;

public class NextPermutation{
  public static void main(String[] args){
    
    int[] nums = {1,4,3,2};
    // System.out.println(myApproach(nums));
    optimalApproach(nums);
    System.out.println(Arrays.toString(nums));

  }

  static void optimalApproach(int[] nums){

    int index = -1;

    for(int i = nums.length-2; i>=0; i--){
      if(nums[i] < nums[i+1]){
        index = i;
        break;
      }
    }

    if(index == -1){
      reverse(nums, 0 ,nums.length - 1);
      return;
    }

    for(int i = nums.length - 1; i > index; i--){
      if(nums[i] > nums[index]){
        swap(nums, i, index);
        break;
      }
    }
    reverse(nums, index+1, nums.length-1);

  }
  static void reverse(int[] nums, int i, int j){
    while(i<j){
      swap(nums, i, j);
      i++;
      j--;
    }
  }

  static List<Integer> myApproach(int[] nums){

    List<List<Integer>> all = new ArrayList<>();
    
    Arrays.sort(nums);

    permute(nums, 0, all);

    System.out.println(all);

    List<Integer> current = new ArrayList<>();
    for(int i: nums) 
      current.add(i);

    for(int i=0; i<all.size(); i++){
      if(all.get(i).equals(current)){
        if(i == all.size() - 1){
          return all.get(0);
        }
        return all.get(i+1);
      }
    }
    return current;
  }
  static void permute(int[] nums, int start, List<List<Integer>> all){
    if(start == nums.length){
      List<Integer> temp = new ArrayList<>();
      for(int i : nums) temp.add(i);
      all.add(temp);
      return;
    }
    for(int i = start; i <nums.length; i++){
      swap(nums, i, start);
      permute(nums, start + 1, all);
      swap(nums, i, start);
    }

  }
  static void swap(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}