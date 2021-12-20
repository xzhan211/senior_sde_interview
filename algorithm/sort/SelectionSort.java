import java.util.*;
public class SelectionSort{
    public static void main(String[] args){
        int arr[] = {6,5,4,3,8,9,6,5,7};
        int p = 0;
        for(int i=0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            int min_p = i;
            for(int j=i; j<arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    min_p = j;
                }
            }
            int temp = arr[p];
            arr[p] = arr[min_p];
            arr[min_p] = temp;
            p++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
