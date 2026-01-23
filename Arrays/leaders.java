import java.util.*;
public class leaders{
  public static void main(String[] args) {
    List<Integer> leaders = new ArrayList<>();
    int nums[] = {10, 22, 12, 3, 0, 6};
    
    int i = nums.length - 1, j = nums.length - 1;
    while(i>=0){
      if(nums[i] > nums[j]){
        j = i;
      } 
      if(i == j){
        leaders.add(nums[j]);
      }
      i--;
    }
    Collections.reverse(leaders);
    System.out.println(leaders);
  }
}