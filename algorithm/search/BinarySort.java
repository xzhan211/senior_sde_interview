import java.util.*;

public class BinarySort {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,6,7,8,9,11,14,16};
        int num = Integer.valueOf(args[0]);
        System.out.println(">> input : " + num);
        System.out.println(">> input exist : " + bs(arr, num));
    }

    public static boolean bs(int[] arr, int n) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(arr[mid] == n) return true;
            else if(arr[mid] > n) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}
