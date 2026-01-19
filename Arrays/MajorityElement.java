import java.util.Arrays;

public class MajorityElement {
  public static void main(String[] args) {
    int[] arr = {1,2,4,4,4,2,4,2,12,4,2,4,21,4,4};

    System.out.println(looping(arr));
    System.out.println(counter(arr));
  }
  static int looping(int[] nums){
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }
  
  static int counter(int[] nums) {
    
    int cnt = 0;
    int ele = nums[0];
    int i = 0;
    while(i<nums.length){
      if(cnt == 0){
        ele = nums[i];
        cnt++;
      } else if(ele == nums[i]){
        cnt++;
      } else{
        cnt--;
      }
      i++;
    }
    return ele;
  }
}
