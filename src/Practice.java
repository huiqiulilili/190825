import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Practice {

    public static int treeHight(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = treeHight(root.left);
        int right = treeHight(root.right);

        return Math.max(left,right) + 1;
    }
    public static boolean isBalanced(TreeNode root){

        if(root == null){
            return true;
        }

        if(isBalanced(root.left)
                && Math.abs(treeHight(root.left) - treeHight(root.right )) <= 1
        && isBalanced(root.right)){
            return true;
        }
        return false;
    }

    public boolean search(TreeNode root,TreeNode n){
        if(root == null){
            return false;
        }

        if(root == n){
            return true;
        }

        if(search(root.left,n)){
            return true;
        }
        if(search(root.right,n)){
            return true;
        }
        return false;
    }
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//
//    }

    public static void levelOrder(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size() != 0){
            TreeNode n = queue.remove();
            System.out.println(n.ch);
            if(n.left != null) {
                queue.add(n.left);
            }
            if(n.right != null) {
                queue.add(n.right);
            }
        }
    }
}
