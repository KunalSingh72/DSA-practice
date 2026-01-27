import java.util.*;

public class XoringSubarray {
  public static void main(String[] args) {
    int nums[] = {4, 2, 2, 6, 4};
    System.out.println(solution(nums, 6));
  }
  static int solution(int[] A, int k) {

    Map<Integer, Integer> freq = new HashMap<>();

    freq.put(0, 1);

    int prefixXor = 0;
    int count = 0;

    for (int num : A) {
      prefixXor ^= num;
      int target = prefixXor ^ k;
      if (freq.containsKey(target)) {
        count += freq.get(target);
      }
      freq.put(prefixXor, freq.getOrDefault(prefixXor, 0) + 1);
    }
    return count;
  }
}
