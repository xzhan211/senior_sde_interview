import java.util.*;
public class MonotonicStack{
    public static void main(String[] args){
        int[] arr = {5,6,3,4,7,1,9,8};
        int[] res = new int[arr.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=arr.length-1; i>=0; i--){
            int n = arr[i];
            while(!stack.isEmpty() && stack.peek() <= n){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(n);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }
}
