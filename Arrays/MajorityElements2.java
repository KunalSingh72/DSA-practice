import java.util.*;

public class MajorityElements2 {
  public static void main(String[] args) {
   int[] nums = {2,2};
  
   System.out.println(majority(nums));
  } 
  static List<Integer> majority(int[] nums) {
    int n = nums.length/3;
    HashMap<Integer, Integer> freq = new HashMap<>();

    for(int i: nums) {
      freq.put(i, freq.getOrDefault(i, 0)+1);
    }
    List<Integer> majorityEle = new ArrayList<>();

    for(Map.Entry<Integer, Integer> e: freq.entrySet()) {
      int key = e.getKey();
      int value = e.getValue();

      if(value > n) {
        majorityEle.add(key);
      }
    }
    return majorityEle;
    
  }
  static List<Integer> majority2(int[] nums) {
    int n = nums.length / 3;

    HashMap<Integer, Integer> mp = new HashMap<>();
    List<Integer> majorityEle = new ArrayList<>();

    for (int i : nums) {
      int freq = 0;
      if (mp.containsKey(i)) {
        freq = mp.get(i);
      }
      freq++;
      mp.put(i, freq);
      if (freq > n && !majorityEle.contains(i))
        majorityEle.add(i);
    }

    return majorityEle;
  }
}
