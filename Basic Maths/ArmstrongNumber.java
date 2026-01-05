import java.lang.String;

public class ArmstrongNumber {
  public static void main(String[] args) {
    
    int num = 8208;

    int digit = String.valueOf(num).length();
    int originalNum = num;
    int result = 0; 

    while(num > 0){
      int rem = num%10;
      result += Math.pow(rem, digit);
      num/=10;
    }

    System.out.println((originalNum == result)?true:false);
  }
}
