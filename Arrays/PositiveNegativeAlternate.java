import java.util.Arrays;

public class PositiveNegativeAlternate{
  public static void main(String[] args) {
    
    int nums[] = {-1,4,2,1,-1,3,-5,-6};
    int n = nums.length;
    myAppraoch(nums, n);
    optimalAppraoch(nums, n);

    }
    static void optimalAppraoch(int[] nums, int n){
      int[] res = new int[n];
      
      int posIndex = 0, negIndex = 1;
      for (int i = 0; i < n; i++) {
        if (nums[i] > 0) {
          res[posIndex] = nums[i];
          posIndex+=2;
        } else {
          res[negIndex] = nums[i];
          negIndex+=2;
        }
      }
      System.out.println(Arrays.toString(res));

    }
    static void myAppraoch(int[] nums,int n){

      int[] pos = new int[(n/2)];
      int[] neg = new int[(n / 2)];
      int posIndex = 0, negIndex = 0;

      for(int i = 0; i < n; i++){
        if(nums[i] > 0){
          pos[posIndex++] = nums[i];
        } else{
          neg[negIndex++] = nums[i]; 
        }
      }
      
      posIndex = 0; negIndex = 0;

      for(int i = 0; i < n; i++){
        if (i%2==0) {
          nums[i] = pos[posIndex++];
        } else {
          nums[i] = neg[negIndex++];
        }
      }
      System.out.println(Arrays.toString(nums));
    }
}