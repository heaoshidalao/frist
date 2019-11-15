import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }
}
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int x) { val = x; }
// * }
// */
//class Solution {
//    public boolean isBalanced(TreeNode root) {
//        if(root == null){
//            return true;
//        }
//        if(root.left == null&&root.right == null){
//            return true;
//        }
//        int left = maxDepth(root.left);
//        int right = maxDepth(root.right);
//        if(left - right >1 ||right -left>1 ){
//            return false;
//        }
//        return isBalanced(root.left)&&isBalanced(root.right);
//    }
//    public int maxDepth(TreeNode root) {
//        // 借助递归把问题进行拆分
//        // root 的深度 => 1 + 左子树的深度 和 右子树的深度 的最大值
//        // 1. 如果是空树, 深度就是 0
//        if (root == null) {
//            return 0;
//        }
//        // 2. 如果只有一个根节点, 没有左右子树, 深度就是 1
//        if (root.left == null && root.right == null) {
//            return 1;
//        }
//        // 3. 1 + max(左子树的深度, 右子树的深度)
//        int leftDepth = maxDepth(root.left);
//        int rightDepth = maxDepth(root.right);
//        return 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
//    }
//}
//对称二叉树
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int x) { val = x; }
// * }
// */
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        if(root == null){
//            return true;
//        }
//        return  Mirror(root.left,root.right);
//    }
//    public boolean Mirror(TreeNode q , TreeNode p){
//        if( q == null && p == null){
//            return true;
//        }
//        if(q == null || p == null){
//            return false;
//        }
//        if(q.val != p.val){
//            return false;
//        }
//        return Mirror(q.left ,p.right)&&Mirror(q.right,p.left);
//    }
//}
public class tree {
    public static TreeNode build() {
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(6);
        TreeNode G = new TreeNode(7);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.left = G;
        C.right = F;
        return A;
    }
}
