import java.util.*;
public class TraverseArray{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("----traverse by row------");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }

        System.out.println("----traverse by column------");
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(" " + arr[j][i]);
            }
            System.out.println("");
        }

        System.out.println("----traverse by diagonal 1------");
        int len = arr.length;

        for(int slice=0; slice<len*2-1; slice++){
            // if(slice<len) continue;
            int z = slice<len? 0 : slice-len+1;
            for(int j=z; j<=slice-z; ++j){
                int c1=j;
                int c2=(len-1)-(slice-j);
                System.out.print(" " + arr[c1][c2]);
            }
            System.out.println("");
        }
        

        System.out.println("----traverse by diagonal 2------");
        for(int i=0; i<len*2-1; i++){
            int z = i<len? 0 : i-len+1;
            for(int j=z; j<=i-z; ++j){
                int c1 = j;
                int c2 = i-j;
                System.out.print(" " + arr[c1][c2]);
            }
            System.out.println("");
        }
        System.out.println("----traverse by diagonal 3------");
        /*
         * l's range: how many slices you wanna go through?
         *            let's say it's a 4*4 array. usually it's len - 1 slices.
         * */
        for(int l=2; l<=len; l++){
            for(int i=0; i<=len-l; i++){
                int j=i+l-1;
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("----traverse by diagonal 4------");
        /*
         * l's range: (2 * len - 1) - (len + 1) + 1 = len - 1
         * */
        for(int l=len+1; l<=2*len-1; l++){
            for(int i=l-len; i<=len-1; i++){
                int j=i-l+len;
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
        /*
        System.out.println("----traverse by diagonal 4------");
        for(int l=len; l<2*len-1; l++){
            for(int i=l-len+1; i<=len-1; i++){
                int j=i-l+len-1;
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
        */
    }
}
