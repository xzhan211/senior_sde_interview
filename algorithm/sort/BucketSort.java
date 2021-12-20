import java.util.*;
public class BucketSort{
    public static void main(String[] args) {
        int[] arr = {1,3,7,4,6,3,2,8,9,7,6,1,3,4};
        int[] buckets = new int[10];

        for(int a : arr) {
            buckets[a]++;
        }

        int i = 0;
        for(int j=0; j<buckets.length; j++){
            int b = buckets[j];
            while(b-->0){
                arr[i++] = j; 
            }
        }
        System.out.println(">>> " + Arrays.toString(arr));
    }
}
