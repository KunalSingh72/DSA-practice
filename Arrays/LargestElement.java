public class LargestElement{
  public static void main(String[] args) {
    
    int[] arr = {1,2,2,3,4,3,2,1,4,5};
    int maxx = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
      if(arr[i]>maxx){
        maxx = arr[i];
      }
    }
    System.out.println(maxx);
  }
}