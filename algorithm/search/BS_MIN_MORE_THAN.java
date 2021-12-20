import java.util.*;

public class BS_MIN_MORE_THAN{
    public static void main(String[] args){
        int[] arr = {1,2,3,6,8,12,15,20,30,40};
        int num = Integer.valueOf(args[0]);
        System.out.println("input >> " + num);
        System.out.println("result >> " + helper(arr, num));
    }

    public static int helper(int[] arr, int num) {
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if(arr[mid] >= num) hi = mid - 1;
            else lo = mid + 1;
        }

        return lo == arr.length ? -1 : lo;
    }
}
