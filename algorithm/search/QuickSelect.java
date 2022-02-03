import java.util.*;
public class QuickSelect{
    public static void main(String[] args){
        int in = Integer.valueOf(args[0]);
        int[] arr = {4,1,6,2,3,5,5,4,7,9,8,0};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(">>> " + qs(arr, 0, arr.length-1, in));
        System.out.println(">>> " + qs_iteration(arr, in));
    }

    public static void shuffle(int[] arr){
        Random rand = new Random();
        for(int i=0; i<arr.length; i++){
            int r = i + rand.nextInt(arr.length - i);
            swap(arr, i, r);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // T: O(n) S:O(1)
    public static int qs(int[] arr, int lo, int hi, int target){
        if(lo > hi) return -1;
        int p = partition(arr, lo, hi);
        // find the kth largest number
        int rank = arr.length - p;
        if(rank == target) return arr[p];
        else if(rank < target) return qs(arr, lo, p-1, target);
        else return qs(arr, p+1, hi, target);

        // find the kth smallest number
        /*
        int rank = p + 1;
        if(rank == target) return arr[p];
        else if(rank > target) return qs(arr, lo, p-1, target);
        else return qs(arr, p+1, hi, target);
        */
    }

    public static int qs_iteration(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int p = partition(arr, lo, hi);
            int rank = arr.length - p;
            if(rank == target) return arr[p];
            else if(rank < target) hi = p - 1;
            else lo = p + 1;
        }
        return -1;
    }


    public static int partition(int[] arr, int lo, int hi){
        if(lo == hi) return lo;
        int pivot = arr[hi];
        int i = lo - 1;
        int j = hi;
        while(true){
            while(arr[++i] < pivot) {
                if(i >= hi) break;
            }

            while(arr[--j] > pivot) {
                if(j <= lo) break;
            }

            if(i >= j) break;

            swap(arr, i, j);
        }
        swap(arr, i, hi);
        return i;
    }
}
