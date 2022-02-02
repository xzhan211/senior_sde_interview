import java.util.*;
public class BetterBoundary{
    public static void main(String[] args){
        int[] arr = {1,2,3,7,8,8,8,8,9,9,9,10,12,15,17,20};
        int in = Integer.valueOf(args[0]);
        System.out.println("bs >> " + bs(arr,in));
        System.out.println("upper bound >> " + upperBound(arr, in));
        System.out.println("lower bound >> " + lowerBound(arr, in));
    }

    public static int bs(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + ((hi - lo) >> 1);
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }

    public static int upperBound(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] >= target) hi = mid - 1;
            else lo = mid + 1;
        }
        return lo == arr.length ? -1 : lo;
    }

    public static int lowerBound(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] <= target) lo = mid + 1;
            else hi = mid - 1;
        }
        // return hi == -1 ? -1 : hi;
        return hi;
    }
}
