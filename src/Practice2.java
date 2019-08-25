public class Practice2 {

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

    //计算结点个数
    //第一种
//    static int count = 0;
//    public static void clacCount(TreeNode root){
//        if(root == null){
//            return;
//        }
//        count++;
//        clacCount(root.left);
//        clacCount(root.right);
//    }

    //第二种
//    public static int calcCount2(TreeNode root){
//        if(root == null){
//            return 0;
//        }
//        int left = calcCount2(root.left);
//        int right = calcCount2(root.right);
//        return left + right + 1;
//    }

    //计算叶子结点个数
    //第一种
//    static int leafCount = 0;
//    public static void calcLeafCount(TreeNode root){
//        if(root == null){
//            return;
//        }
//        if(root.left == null && root.right == null){
//            leafCount++;
//        }
//        calcLeafCount(root.left);
//        calcLeafCount(root.right);
//    }

    //第二种
//    public static int calcLeafCount2(TreeNode root){
//        if(root == null){
//            return 0;
//        }
//        if(root.left == null && root.right == null){
//            return 1;
//        }
//        int left = calcLeafCount2(root.left);
//        int right = calcLeafCount2(root.right);
//        return left + right;
//    }

    //计算二叉树的高度
//    public static int calcHight(TreeNode root){
//        if(root == null){
//            return 0;
//        }
//        int left = calcHight(root.left);
//        int right = calcHight(root.right);
//        return Math.max(left,right) + 1;
//    }

    //计算二叉树的K层的节点数
//    public static int calcKLevel(TreeNode root,int k){
//        if(root == null){
//            return 0;
//        }
//        if(k == 1){
//            return 1;
//        }
//        int left = calcKLevel(root.left,k - 1);
//        int right = calcKLevel(root.right,k - 1);
//        return left + right;
//    }

    //查找结点
//    public static TreeNode search(TreeNode root,char val){
//        if(root == null){
//            return null;
//        }
//       if(root.ch == val){
//           return root;
//       }
//       TreeNode n  = search(root.left,val);
//       if(n != null){
//           return n;
//       }
//       TreeNode m = search(root.right,val);
//       if(m != null){
//           return m;
//       }
//       return null;
//    }

    //查找
//    public static boolean search2(TreeNode root,char val){
//        if(root == null){
//            return false;
//        }
//        if(root.ch == val){
//            return true;
//        }
//
//        if(search2(root.left,val)){
//            return true;
//        }
//
//        if(search2(root.right,val)){
//            return true;
//        }
//        return false;
//    }

    //检查两棵树是否相等
//    public static boolean isSameTree(TreeNode p,TreeNode q){
//        if(p == null && q == null){
//            return true;
//        }
//        if(p == null || q == null){
//            return false;
//        }
//        return p.ch == q.ch
//                && isSameTree(p.left,q.left)
//                && isSameTree(p.right,q.right);
//    }

    //  主方法
    public static void main(String[] args) {
//        clacCount(buildTree());
//        System.out.println(count);
//        System.out.println(calcCount2(buildTree()));

//        calcLeafCount(buildTree());
//        System.out.println(leafCount);
//        System.out.println(calcLeafCount2(buildTree()));

//        System.out.println(calcHight(buildTree()));
//        System.out.println(calcKLevel(buildTree(),3));

//        System.out.println(search2(buildTree(),'C'));


    }

}
