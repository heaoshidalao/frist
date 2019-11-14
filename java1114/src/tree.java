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
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p == null && q ==null){
//            return true;
//        }
//        if((p == null&&q != null) ||(q == null&&p!= null) ){
//            return false;
//        }
//        if(q.val != p.val){
//            return false;
//        }
//        return isSameTree(p.left,  q.left)&&isSameTree(p.right,  q.right);
//    }
//}
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
//    public boolean isSubtree(TreeNode s, TreeNode t) {
//
//        if(s == null&& t == null){
//            return true;
//        }
//        if(s == null || t == null){
//            return false;
//        }
//        boolean ret = false;
//        if(s.val == t.val){
//            ret =  isSame(s,t);
//        }
//        if(!ret){
//            ret = isSubtree (s.left,t);
//        }
//        if(!ret){
//            ret = isSubtree (s.right,t);
//        }
//        return ret;
//
//
//    }
//    public boolean isSame(TreeNode p, TreeNode q){
//        if(p == null&& q == null){
//            return true;
//        }
//        if(p == null || q == null){
//            return false;
//        }
//        if(q.val != p.val){
//            return false;
//        }
//        return isSame(q.left, p.left)&&isSame(q.right , p.right);
//
//    }
//
//}
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
//        if(root.left == null &&root.right == null){
//            return 1;
//        }
//        int maxleft = maxDepth(root.left);
//        int maxright = maxDepth(root.right);
//        return 1+(maxleft > maxright ? maxleft :maxright);
//    }
//}
public class tree {

}
