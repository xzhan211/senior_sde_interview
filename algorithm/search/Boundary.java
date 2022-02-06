import java.util.*;
public class Boundary{
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,8,8,8,8,8,10,15,17};
        int in = Integer.valueOf(args[0]);
        
        System.out.println("BS >> " + bs(arr, in));
        System.out.println("BS with left bound >> " + bslb(arr, in));
        System.out.println("BS with right bound >> " + bsrb(arr, in));
        System.out.println("the largest smaller one or equal >> " + lb(arr, in));
        System.out.println("the smallest larger one or equal >> " + rb(arr, in));
    }

    public static int bs(int[] arr, int in){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == in){
                return mid;
            }else if(arr[mid] < in){
                lo = mid + 1;
            }else
                hi = mid - 1;
        }
        return -1;
    }

    public static int bslb(int[] arr, int target){
        int lo = 0;
        int hi  = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] < target) lo = mid + 1;
            else if(arr[mid] > target) hi = mid - 1;
            else hi = mid - 1;
        }
        if(lo >= arr.length || arr[lo] != target) return -1;
        return lo;
    }

    public static int bsrb(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] < target) lo = mid + 1;
            else if(arr[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        if(hi < 0 || arr[hi] != target) return -1;
        return hi;
    }

    public static int lb(int[] arr, int in){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] <= in){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return hi;
    }


    public static int rb(int[] arr, int in){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] < in) {
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return lo == arr.length ? -1 : lo;
    }
}
