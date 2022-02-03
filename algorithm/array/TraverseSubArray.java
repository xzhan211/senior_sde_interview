import java.util.*;
public class TraverseSubArray{
    public static void main(String[] args){
        int[][] arr = new int[9][9];
        int n=1;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = n++;
            }
        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
       
        // traverse the middle matrix with 9 numbers
        int x = 3, y = 3;
        for(int i=0; i<9; i++){
            System.out.println(arr[x/3*3 + i/3][y/3*3 + i%3]);
        }

    }
}
