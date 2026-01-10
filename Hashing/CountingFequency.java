import java.util.HashMap;
import java.util.Scanner;

public class CountingFequency{
  public static void main(String[] args) {
    
    int arr[] = {1,2,3,4,3,3,2,1};

    HashMap<Integer, Integer> mp = new HashMap<>();

    for(int i : arr){
      int freq = 0;
      if(mp.containsKey(i)){
        freq = mp.get(i);
      }
      freq++;
      mp.put(i, freq);
    }
    
    Scanner sc = new Scanner(System.in);
    int num;
    do{
      System.out.print("Enter the number to find frequency (-1 to exit): ");
      num = sc.nextInt();
      System.out.println(mp.get(num));
    }while(num != -1);
    
  }
}