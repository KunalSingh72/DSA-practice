public class SecondLargest {
 public static void main(String[] args) {    
    int[] arr = {1,1,1,1};
    int maxx = arr[0];
    int secondMaxx = -1;
    for(int i = 1; i<arr.length; i++){
      if(arr[i]>maxx){
        secondMaxx = maxx;
        maxx = arr[i];
      }
    }
    System.out.println(secondMaxx);

 } 
}
