import java.util.Arrays;

public class MoveZerosToj {
  public static void main(String[] args) {
    
    int[] nums = {1,2,0,4,5,0,3,0,32,4,24};
    int[] sortedNums = {1,2,3,4,5,6,44};
    // myApproach(nums, sortedNums);
    optimalAnswer(nums);

    System.out.println(Arrays.toString(nums));

    
  } 
  static void myApproach(int[] nums, int[] sortedNums){
    int i = 0, j = 1;
    while(j < nums.length){
      if(nums[i] == 0 && nums[j] != 0){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++; j++;
      } else if(nums[i] == 0 && nums[j] == 0){
        j++;
      } else{
        i++; j++;
      }
    }
  }
  static void optimalAnswer(int[] nums){
        int j = 0;
        for(int i =0 ; i<nums.length ;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j] = 0;
            j++;
        }
  }
}
