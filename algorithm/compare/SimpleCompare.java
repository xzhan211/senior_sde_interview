import java.util.*;
public class SimpleCompare {
    public static void main(String[] args) {
        int[][] arr = {{5,4}, {4,3}, {10,7}, {10,4}, {10,3}, {4,6}};

        // sort 1
        Arrays.sort(arr, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for(int[] p : arr){
            System.out.print(" [" + p[0] + " : " + p[1] + "]");
        }
        System.out.println("");

        // sort 2
        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                if(a[0] == b[0]) {
                    return b[1] - a[1];
                }else
                    return a[0] - b[0];
            }
        });

        for(int[] p : arr){
            System.out.print(" [" + p[0] + " : " + p[1] + "]");
        }

        System.out.println("");
    }
}
