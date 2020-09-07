package jianzhi0907;

public class jianzhi22 {
//    import java.util.ArrayList;
//import java.util.*;
//    /**
//     public class TreeNode {
//     int val = 0;
//     TreeNode left = null;
//     TreeNode right = null;
//
//     public TreeNode(int val) {
//     this.val = val;
//
//     }
//
//     }
//     */
//
//    public class Solution {
//        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//            ArrayList<Integer> result = new ArrayList<Integer>();
//            if(root == null)return result;
//
//            Queue<TreeNode> queue = new LinkedList<TreeNode>();
//            queue.offer(root);
//        /*
//        while(!queue.isEmpty()){
//            TreeNode temp = queue.poll();
//            result.add(temp.val);
//            if(root.left!= null)queue.offer(temp.left);
//
//            if(root.right!= null)queue.offer(temp.right);
//
//        }
//        */
//            while(!queue.isEmpty()){
//                TreeNode temp = queue.poll();
//                result.add(temp.val);
//                if(temp.left != null)queue.offer(temp.left);
//                if(temp.right != null)queue.offer(temp.right);
//            }
//            return result;
//        }
//    }
///*
//public class Solution {
//    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        if(root == null)return result;
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            TreeNode temp = queue.poll();
//            result.add(temp.val);
//            if(temp.left != null)queue.offer(temp.left);
//            if(temp.right != null)queue.offer(temp.right);
//        }
//        return result;
//    }
//}
//*/
}
