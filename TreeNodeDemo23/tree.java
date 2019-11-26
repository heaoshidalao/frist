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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 每次构建之前要置为 0, 因为在线 OJ 有多组测试
        index = 0;
        // 在这个递归过程中, 需要处理到某个具体的子树.
        // [0, inorder.length) 当前处理的子树对应的中序遍历结果是什么
        return buildTreeHelper(preorder, inorder, 0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder,
                                     int inorderLeft, int inorderRight) {
        // 先判定非法情况
        if (inorderLeft >= inorderRight) {
            // 这个子树的中序遍历是没有的. 这就是个空子树
            return null;
        }
        if (index >= preorder.length) {
            return null;
        }
        // 取出当前值构造当前子树的根节点
        TreeNode root = new TreeNode(preorder[index]);
        index++;  // 取完这个节点, 就可以取下一个节点了
        // 需要找到这个节点在中序遍历中的位置.
        // pos 只要说 先序遍历 和 中序遍历 序列都是对的.
        // pos 是一定能找到的.
        int pos = find(inorder, inorderLeft, inorderRight, root.val);
        root.left = buildTreeHelper(preorder, inorder, inorderLeft, pos);
        root.right = buildTreeHelper(preorder, inorder, pos + 1 , inorderRight);
        return root;
    }

    private int find(int[] inorder, int inorderLeft, int inorderRight, int val) {
        for (int i = inorderLeft; i < inorderRight; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
