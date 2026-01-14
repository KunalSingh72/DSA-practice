import java.util.*;

public class RemoveDuplicates{
  public static void main(String[] args){

    int[] arr = {1,1,2,2,3,3,3,4,4,4,4,41,41};
    // Set<Integer> s = new HashSet<Integer>();
    
    int index = 0;
    
    for(int i = 1; i < arr.length; i++){
      if(arr[index] != arr[i]){
        // s.add(i);
        index++;
        arr[index] = arr[i];
      }
    }
    System.out.println(Arrays.toString(arr));

  }
}