import java.util.*;
class Traverse{
    private Deque<TreeNode> stk = new ArrayDeque<>();
    public void iterationTraverse(TreeNode root){
        TreeNode visited = new TreeNode(-1);
        pushLeftBranch(root);
        while(!stk.isEmpty()){
            TreeNode p = stk.peek();
            if((p.left == null || p.left == visited) && p.right != visited){
                // inorder
                pushLeftBranch(p.right);
            }

            if(p.right == null || p.right == visited){
                // postorder
                System.out.println(p.val);
                visited = stk.pop();
            }
        }
    }

    private void pushLeftBranch(TreeNode p){
        while(p != null){
            stk.push(p);
            // preorder
            System.out.println(p.val);
            p = p.left;
        }
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

