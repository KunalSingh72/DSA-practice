import java.util.*;
public class PrintAllDivisor {
  public static void main(String[] args) {
    int num = 64;
    List<Integer> result = new ArrayList<>();

    for(int i = 1; i*i <= num; i++){
      if(num%i==0){
        result.add(i);
        if(i != num/i){
          result.add(num/i);
        }
      }
    }
    Collections.sort(result);
    System.out.println(result.toString());
  }
}
