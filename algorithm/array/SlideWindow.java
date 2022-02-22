import java.util.*;
public class SlideWindow{
    public static void main(String[] args){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        int[] ans = new int[nums.length - k + 1];
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            while(!queue.isEmpty() && queue.peekLast() < nums[i]){
                queue.removeLast();
            }
            queue.addLast(nums[i]);
            if(i >= k){
                int out = nums[i-k];
                if(queue.peekFirst() == out){
                    queue.pollFirst();
                    max = queue.peekFirst();
                }
            }
            if(i < k - 1) continue;
            ans[i - k + 1] = max;
        }
        return ans;
    }
}
