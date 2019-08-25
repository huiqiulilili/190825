import java.util.*;

public class Practice3 {
    public static TreeNode buildTree() {
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        TreeNode h = new TreeNode('H');

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        d.left = null; d.right = null;
        e.left = null; e.right = h;
        f.left = null; f.right = null;
        g.left = null; g.right = null;
        h.left = null; h.right = null;

        return a;
    }

    //前序 + 中序
//    public static TreeNode buildTree1(List<Character> perOrder,List<Character> inOrder){
//        if(inOrder.size() == 0){
//          return null;
//        }
//        char rootValue = perOrder.get(0);
//        int size = perOrder.size();
//        int leftCount = inOrder.get(rootValue);
//
//        TreeNode root = new TreeNode(rootValue);
//        List<Character> leftPerOrder = perOrder.subList(0, leftCount);
//        List<Character> leftInOrder = inOrder.subList(0,leftCount);
//        TreeNode left = buildTree1(leftPerOrder,leftInOrder);
//        List<Character> rightPerOrder = perOrder.subList(leftCount + 1,perOrder.size() - 1);
//        List<Character> rightInOrder = inOrder.subList(leftCount + 1,inOrder.size());
//        TreeNode right = buildTree1(rightPerOrder,rightInOrder);
//        root.left = left;
//        root.right = right;
//        return root;
//    }

//    public static TreeNode buildTree(char[] perOrder,char[] inOrder){
//        if(inOrder.length == 0){
//            return null;
//        }
//        char rootValue = perOrder[perOrder.length - 1];
//        int size = perOrder.length;
//        int leftCount = -1;
//        for(int i = 0;i < inOrder.length;i ++){
//            if(inOrder[i] == rootValue){
//                leftCount = i;
//            }
//        }
//
//        TreeNode root = new TreeNode(rootValue);
//        char[] leftInOrder = Arrays.copyOfRange(inOrder,0,leftCount);
//        char[] leftPerOrder = Arrays.copyOfRange(perOrder,0,leftCount);
//        TreeNode left = buildTree(leftPerOrder,leftInOrder);
//        char[] rightInOrder = Arrays.copyOfRange(inOrder,leftCount + 1,inOrder.length);
//        char[] rightPerOrder = Arrays.copyOfRange(perOrder,leftCount,perOrder.length - 1);
//        TreeNode right = buildTree(rightPerOrder,rightInOrder);
//        root.left = left;
//        root.right = right;
//        return root;
//    }

//    public static class ReturnValue {
//        TreeNode root;
//        int used;
//    }
//    public static ReturnValue buildTreePreorder(List<Character> perOrder) {
//        if(perOrder.size() == 0){
//            ReturnValue rv = new ReturnValue();
//            rv.root = null;
//            rv.used = 0;
//            return rv;
//        }
//        char rootValue = perOrder.get(0);
//        if(perOrder.size() == '#'){
//            ReturnValue rv = new ReturnValue();
//            rv.root = null;
//            rv.used = 1;
//            return rv;
//        }
//       ReturnValue leftP = buildTreePreorder(perOrder.subList(1,perOrder.size()));
//       ReturnValue rightP = buildTreePreorder(perOrder.subList(1 + leftP.used,perOrder.size()));
//
//       TreeNode root = new TreeNode();
//       root.left = leftP.root;
//       root.right = rightP.root;
//
//       ReturnValue rv = new ReturnValue();
//       rv.used = 1 + leftP.used + rightP.used;
//       rv.root = root;
//       return rv;
//    }

    /*
    //平衡二叉树
    public static int hight(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = hight(root.left);
        int right = hight(root.right);
        return Math.max(left,right) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
       if(isBalanced(root.left) && isBalanced(root.right)
               && Math.abs(hight(root.left) - hight(root.right)) <= 1){
           return true;
       }
       return false;
    }

     */

//    public static String tree2str(TreeNode t){
//        if(t == null){
//            return "";
//        }
//        StringBuilder sb = new StringBuilder();
//        perOrder(sb,t);
//        String r = sb.toString();
//        return r.substring(1,r.length() - 1);
//    }
//
//    private static void perOrder(StringBuilder sb, TreeNode root) {
//        if(root == null){
//            return;
//        }
//        if(root.left == null && root.right != null){
//            sb.append("()");
//        }else{
//            perOrder(sb,root.left);
//        }
//        perOrder(sb,root.right);
//
//
//    }

//    public static void levelOrderTraversal(TreeNode root){
//        if(root == null){
//            return;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while(!(queue.isEmpty())){
//            TreeNode n = queue.poll();
//            System.out.println(n.ch);
//            if(n.left != null) {
//                queue.add(n.left);
//            }
//            if(n.right != null) {
//                queue.add(n.right);
//            }
//        }
//    }


    public static void main(String[] args) {
//        List<Character> preorder = Arrays.asList(
//                '1', '2', '3', '#', '#', '#', '4', '#', '5', '#','#'
//        );
//        ReturnValue rv = buildTreePreorder(preorder);

    }
}
