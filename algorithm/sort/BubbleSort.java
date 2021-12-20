import java.util.*;

// T:O(n^2) S:O(1)
// stable
public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {1,8,2,6,5,3,9,4,2,4,6,87,4};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } 
        System.out.println(Arrays.toString(arr));
    }
}
