import java.util.*;
public class RotateMatrix {
  public static void main(String[] args) {
    
    int[][] matrix = {{5,1,9,11},
                      {2,4,8,10},
                      {13,3,6,7},
                      {15,14,12,16}};
    rotate(matrix);
    
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix.length; col++) {
        System.out.print(matrix[row][col] + " ");
      }
      System.out.println();
    }

  }
  static void rotate(int[][] matrix){

    int m = matrix.length;
    
    for(int row = 0; row<m; row++){
      for (int col = row+1; col<m; col++) {
          int temp = matrix[row][col];
          matrix[row][col] = matrix[col][row];
          matrix[col][row] = temp;
      }      
    }

    for (int row = 0; row < m; row++) {
      for (int col = 0; col < m/2; col++) {
          int temp = matrix[row][col];
          matrix[row][col] = matrix[row][m-col-1];
          matrix[row][m-col-1] = temp;
        }
    }
    
  }
}
