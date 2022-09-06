import java.util.*;
public class QuickPick{
    // worst O(n^2)
    // average O(n)

    public static void main(String[] args){
        int[] arr = {3,5,1,2,6,8,7,9,0,4};
        int input = Integer.valueOf(args[0]);
        System.out.println(quickPick(arr, input, 0, arr.length-1));
    }

    public static int quickPick(int[] arr, int k, int lo, int hi){
        if(lo > hi) return -1;
        if(lo == hi) return arr[lo];
        int p = partition(arr, lo, hi);
        int temp = p - lo + 1;
        if(temp == k) return arr[p];
        else if(temp > k) return quickPick(arr, k, lo, p-1);
        else return quickPick(arr, k-temp, p+1, hi);
    }

    public static int partition(int[] arr, int lo, int hi){
        if(lo == hi) return lo;
        int pivot = arr[hi];
        int left = lo - 1;
        int right = hi;

        while(true){
            while(arr[++left] < pivot){
                if(left == hi) break;
            }

            while(arr[--right] > pivot){
                if(right == lo) break;
            }

            if(left >= right) break;

            swap(arr, left, right);
        }

        swap(arr, left, hi);
        return left;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
