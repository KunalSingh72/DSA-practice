import java.util.*;

public class BouquetMaking {
  public static void main(String[] args) {
    int[] bloomDay = { 1, 10, 3, 10, 2 };
    int m = 3;
    int k = 1;

    System.out.println(makeBouquet(bloomDay, m, k));
  }

  static int makeBouquet(int[] bloomDay, int m, int k) {
    long totalFlower = (long) m * k;
    if (bloomDay.length < totalFlower)
      return -1;

    int minDay = Integer.MAX_VALUE;
    int maxDay = Integer.MIN_VALUE;

    for (int bloom : bloomDay) {
      minDay = Math.min(minDay, bloom);
      maxDay = Math.max(maxDay, bloom);
    }

    int low = minDay, high = maxDay, result = -1;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (isPossible(bloomDay, mid, m, k)) {
        result = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return result;

  }

  static boolean isPossible(int[] bloomDay, int day, int m, int k) {

    int count = 0;
    int bouquets = 0;

    for (int i : bloomDay) {
      if (i <= day) {
        count++;
        if (count == k) {
          bouquets++;
          count = 0;
        }
      } else {
        count = 0;
      }
    }

    return bouquets >= m;
  }

}
