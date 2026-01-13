public class secondLargestAndSmallest {
 public static void main(String[] args) {    
    int[] arr = {1,2,3,4};

    int maxx = Integer.MIN_VALUE, secondMaxx = Integer.MIN_VALUE;
    int minn = Integer.MAX_VALUE, secondMinn = Integer.MAX_VALUE;

    for(int i = 0; i<arr.length; i++){

      if(arr[i]>maxx){
        secondMaxx = maxx;
        maxx = arr[i];
      } else if(arr[i] > secondMaxx && arr[i] != maxx){
        secondMaxx = arr[i];
      }

      if(arr[i] < minn){
        secondMinn = minn;
        minn = arr[i];
      } else if(arr[i] < secondMinn && arr[i] != minn){
        secondMinn = arr[i];
      }
    }
    System.out.println(secondMinn + " " + secondMaxx);

 } 
}
