import java.util.*;
public class SortAPI{
    public static void main(String[] args){
        Integer[] arr = {4,3,2,6,5,8,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return b - a;
            }
        });
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
}
