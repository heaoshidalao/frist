package TreeNodeDemo;

public class tree {
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode(int x) { val = x; }
//     * }
//     */
//    class Solution {
//        private TreeNode lca = null;
//        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            if(root == null){
//                return null;
//            }
//            findNode(root,p,q);
//            return lca;
//        }
//        private boolean findNode(TreeNode root,TreeNode p, TreeNode q){
//            if(root == null){
//                return false;
//            }
//            int left = findNode(root.left,p,q)?1:0;
//            int right = findNode(root.right,p,q)?1:0;
//            int mid =(root == q|| root == p)?1:0;
//            if((mid+left+right)>=2){
//                lca = root;
//            }
//            return (mid+left+right)>0;
//
//        }
//    }
}
///**
// public class TreeNode {
// int val = 0;
// TreeNode left = null;
// TreeNode right = null;
//
// public TreeNode(int val) {
// this.val = val;
//
// }
//
// }
// */
//public class Solution {
//    public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree == null){
//            return null;
//
//        }
//        if(pRootOfTree.left == null&& pRootOfTree.right == null){
//            return pRootOfTree;
//        }
//        TreeNode left = Convert(pRootOfTree.left);
//        TreeNode leftTail = left;
//        while(leftTail != null&&leftTail.right != null){
//            leftTail = leftTail.right;
//        }
//        if(left != null){
//            leftTail.right  = pRootOfTree;
//            pRootOfTree.left = leftTail;
//
//        }
//        TreeNode right = Convert(pRootOfTree.right);
//        if(right != null){
//            pRootOfTree.right = right;
//            right.left =pRootOfTree;
//        }
//        return (left == null)?pRootOfTree:left;
//    }
//}
