import java.util.ArrayList;
import java.util.List;

public class FindUnion {
  public static void main(String[] args) {
    
    int[] arr1 = {1,2,2,3,3,3,3,4,6};
    int[] arr2 = {1,2,3,3,4,5,6};
    int n = arr1.length, m =arr2.length;
    List<Integer> Union = new ArrayList<>();

    int i = 0, j = 0;

    while (i < n && j < m) {
        if (arr1[i] < arr2[j]) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        else if (arr2[j] < arr1[i]) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        else {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++; j++;
        }
    }

    while (i < n) {
        if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
            Union.add(arr1[i]);
        i++;
    }

    while (j < m) {
        if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
            Union.add(arr2[j]);
        j++;
    }

    System.out.println(Union.toString());
  }
}
