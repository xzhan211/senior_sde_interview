import java.util.*;
public class TraverseGraph{
    public static void main(String[] args){
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};
        List<List<Integer>> ans = allPathsSourceTarget(graph);
        for(List<Integer> list : ans){
            System.out.println(list.toString());
        }
        
    }

    private static List<List<Integer>> allPathsSourceTarget(int[][] graph){
        List<List<Integer>> result = new ArrayList<>();
        traverse(graph, 0, result, new ArrayList<>());
        return result;
    }

    private static void traverse(int[][] graph, int i, List<List<Integer>> result, List<Integer> temp){
        temp.add(i);
        if(i == graph.length - 1){
            result.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return;
        }

        for(int n : graph[i]){
            traverse(graph, n, result, temp);
        }

        temp.remove(temp.size() - 1);
    }
}
