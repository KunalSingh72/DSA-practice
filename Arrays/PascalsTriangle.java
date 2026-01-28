import java.util.*;

public class PascalsTriangle {
  public static void main(String[] args) {
    System.out.println(pascal(5));
    System.out.println(getNthRow(5));
    System.out.println(findPascalElement(4,4));
  }
  static List<List<Integer>> pascal(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      List<Integer> row = new ArrayList<>(Collections.nCopies(i+1, 1));
      for (int j = 1; j < i; j++) {
        row.set(j, triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
      }
      triangle.add(row);
    }

    return triangle;
  }
  
  static List<Long> getNthRow(int N) {
    // Result list to store the row
    List<Long> row = new ArrayList<>();

    // First value of the row is always 1
    long val = 1;
    row.add(val);

    // Compute remaining values using the relation:
    // C(n, k) = C(n, k-1) * (n-k) / k
    for (int k = 1; k < N; k++) {
      val = val * (N - k) / k;
      row.add(val);
    }

    return row;
  }
  
  static long findPascalElement(int r, int c) {
    // Element is C(r-1, c-1)
    int n = r - 1;
    int k = c - 1;

    long result = 1;

    // Compute C(n, k) using iterative formula
    for (int i = 0; i < k; i++) {
      result *= (n - i);
      result /= (i + 1);
    }

    return result;
  }
}