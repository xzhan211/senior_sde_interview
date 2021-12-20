import java.util.*;
public class InsertionSort{
    public static void main(String[] args){
        int[] arr = {2,3,7,6,5,4,9,8,7,1,2};
        int key;
        for(int i=1; i<arr.length; i++){
            key = arr[i];
            int j = i - 1;
            while((j>=0) && (arr[j]>key)) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(">> " + Arrays.toString(arr));

    }
}
