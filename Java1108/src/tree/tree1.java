package tree;
////二叉树的前序遍历
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
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<Integer>();
//        if(root == null){
//            return res;
//        }
//        res.add(root.val);
//        res.addAll(preorderTraversal(root.left));
//        res.addAll( preorderTraversal(root.right));
//
//        return res;
//    }
//}
////二叉树的中序遍历
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
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List <Integer> res = new ArrayList<>();
//        if(root == null ){
//            return res;
//        }
//        res.addAll(inorderTraversal(root.left));
//        res.add(root.val);
//        res.addAll(inorderTraversal(root.right));
//        return res;
//    }
//}
////二叉树的后序遍历
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
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List <Integer> res = new ArrayList<>();
//        if(root == null){
//            return res;
//        }
//        res.addAll(postorderTraversal(root.left));
//        res.addAll(postorderTraversal(root.right));
//        res.add(root.val);
//        return res;
//    }
//}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
////判断相同的树
//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p == null && q ==null){
//            return true;
//        }
//        if((p == null&&q != null) ||(q == null&&p!= null) ){
//            return false;
//        }
//        if(p.val != q.val){
//            return false;
//        }
//        return isSameTree(p.left, q.left)&& isSameTree(p.right, q.right);
//    }
//}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//判断一个数是不是1另一个数子树
//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p == null && q ==null){
//            return true;
//        }
//        if((p == null&&q != null) ||(q == null&&p!= null) ){
//            return false;
//        }
//        if(p.val != q.val){
//            return false;
//        }
//        return isSameTree(p.left, q.left)&& isSameTree(p.right, q.right);
//    }
//
//
//    public boolean isSubtree(TreeNode s, TreeNode t) {
//        if(s == null && t ==null){
//            return true;
//        }
//        if((s == null&&t != null) ||(t == null&&s!= null) ){
//            return false;
//        }
//        boolean ret = false;
//        if(s.val == t.val){
//            ret = isSameTree(s,t)  ;
//        }
//        if(!ret ){
//            ret =isSubtree(s.left,t);
//        }
//        if(!ret){
//            ret = isSubtree(s.right, t);
//        }
//        return ret;
//    }
//
//}
//二叉树的最大深度
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
//    public int maxDepth(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//        if(root.left == null&& root.right == null){
//            return 1;
//        }
//        int leftDepth = maxDepth(root.left);
//        int rightDepth = maxDepth(root.right);
//        return 1+(leftDepth>rightDepth ? leftDepth : rightDepth);
//
//    }
//}
public class tree1 {
}
