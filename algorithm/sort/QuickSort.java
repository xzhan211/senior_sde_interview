import java.util.*;
public class QuickSort{
    public static void main(String[] args){
        int[] arr = {1,7,6,4,3,9,8,2,4,6,8,9,12};
        System.out.println(Arrays.toString(arr));
        qs(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void qs(int[] arr, int lo, int hi){
        if(lo >= hi) return;
        int p = partition(arr, lo, hi);
        qs(arr, lo, p-1);
        qs(arr, p+1, hi);
    }

    public static int partition(int[] arr, int lo, int hi){
        if(lo == hi) return lo;
        int pivot = arr[hi];
        int i = lo - 1;
        int j = hi;
        while(true){
            while(arr[++i] < pivot){
                if(i == hi) break;
            }

            while(arr[--j] > pivot){
                if(j == lo) break;
            }

            if(i >= j) break;
            swap(arr, i, j);
        }
        swap(arr, i, hi);
        return i;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }
}
