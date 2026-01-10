import java.util.*;

public class HighestLowestFreq {
  public static void main(String[] args) {

    int arr[] = {1,2,3,4,4,4,4,4,4,3,3,1};
    Map<Integer, Integer> mp = new HashMap<>();

    for(int i : arr){
      mp.put(i, mp.getOrDefault(i, 0) + 1);
    }
    
    int maxx = 0, maxFreqNum = 0;
    int minn = arr.length, minFreqNum = 0;

    for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
        int element = entry.getKey();
        int count = entry.getValue();

        if(count > maxx){
          maxx = count;
          maxFreqNum = element;
        }
        if(count < minn){
          minn = count;
          minFreqNum = element;
        }
      }
    System.out.println(maxFreqNum + " " + minFreqNum);

    
  }
}