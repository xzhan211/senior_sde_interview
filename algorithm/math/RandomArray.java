import java.util.*;
public class RandomArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        Random rand = new Random();
        int len = arr.length;
        for(int i=0; i<len; i++){
            int r = rand.nextInt(len - i);
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
