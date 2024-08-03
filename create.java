import java.util.*;
public class create{

    public static void compare(int matrix[][]) {
        int min=matrix[0][0];
        int max= matrix[0][0];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
               }
                if(matrix[i][j]>max){
                    max= matrix[i][j];
                }
            }
}
              System.out.println("maximum value is"+ max);
              System.out.println("minimum value is"+ min);
}
    public static boolean search(int matrix[][],int keys) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==keys){
                    System.out.println("found at index"+ "("+ i +" " + j + ")");
                    return true;
                }
        }

    }
        return false;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[3][3];
           int n=matrix.length,m= matrix[0].length;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=sc.nextInt();
                
               System.out.print(matrix[i][j]);
                }
            
            System.out.println();
        }
   
         search(matrix, 4);
         compare(matrix);
        }
}

