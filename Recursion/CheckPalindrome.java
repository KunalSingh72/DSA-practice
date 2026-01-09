public class CheckPalindrome {
  public static void main(String[] args) {
    
    String name = "Drar-=3;e[;3-=43wesdeD";
    name = name.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(name);
    System.out.println(palindrome(name, 0, name.length()-1));

  }
  static boolean palindrome(String name, int start, int end){

    if(start >= end){
      return true;
    }

    if(name.charAt(start) == name.charAt(end)){
      return palindrome(name, start+1, end-1);
    }

    return false;
  }
}
