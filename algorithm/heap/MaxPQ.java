import java.util.*;
public class MaxPQ{
    private Integer[] pq;
    private int n;

    public MaxPQ(int capacity){
        pq = new Integer[capacity+1]; // index 0 is not used.
        n = 0;
    }

    int parent(int root){
        return root / 2;
    }

    int left(int root){
        return root * 2;
    }

    int right(int root){
        return root * 2 + 1;
    }

    public int max(){
        return pq[1];
    }

    public void insert(int x){
        n++;
        pq[n] = x;
        swim(n);
    }

    public int delMax(){
        int max = pq[1];
        swap(1, n);
        pq[n] = null;
        n--;
        sink(1);
        return max;
    }

    private void swim(int k){
        while(k > 1 && less(parent(k), k)){
            swap(parent(k), k);
            k = parent(k);
        }
    }

    private void sink(int k){
        while(left(k) <= n){
            int older = left(k);
            if(right(k) <= n && less(older, right(k))){
                older = right(k);
            }
            if(less(older, k)) break;
            swap(older, k);
            k = older;
        }
    }

    private void swap(int i, int j){
        int temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    private boolean less(int i, int j){
        return pq[i] < pq[j];
    }
}
