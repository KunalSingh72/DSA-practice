import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
  public static void main(String[] args) {
    int arr[] = {1,3,1,2,5,5,2,4,4,3,7};
    System.out.println(hashset(arr));
    System.out.println(xoring(arr));
  }
  static int hashset(int[] nums){
    
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i: nums){
      map.put(i, map.getOrDefault(i, 0)+1);
    }
    for(Map.Entry<Integer, Integer> entry: map.entrySet()){
      int element = entry.getKey();
      int count = entry.getValue();

      if(count == 1){
        return element;
      }
    }
    return 0;
  }
  
  static int xoring(int[] nums) {

    int ans = 0;
    for(int i: nums){
      ans^=i;
    }
    return ans;
  }
}
