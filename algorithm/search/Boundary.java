import java.util.*;
public class Boundary{
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,8,10,15,17,23,25,30};
        int in = Integer.valueOf(args[0]);
        
        System.out.println("BS >> " + bs(arr, in));
        System.out.println("left bound >> " + lb(arr, in));
        System.out.println("right bound >> " + rb(arr, in));
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
