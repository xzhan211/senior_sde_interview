import java.util.*;
public class BS_LESS_THAN{
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,8,13,34,45,67};
        int num = Integer.valueOf(args[0]);
        System.out.println("input >> " + num);
        int pos = helper(arr, num);
        System.out.println("the MAX less than num pos is: " + pos);
    }

    public static int helper(int[] arr, int num) {
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if(arr[mid] <= num) lo = mid + 1;
            else hi = mid - 1;
        }
        return hi;
    }
}
