package tree;
class Node {
   public  char val;
   public  Node left = null;
   public  Node right = null;
    public Node(char val) {
        this.val = val;
    }
}
public class binary {
   public static  Node root = null;
   public static Node build(){
       Node A = new Node ('A');
       Node B = new Node ('B');
       Node C = new Node ('C');
       Node D = new Node ('D');
       Node E = new Node ('E');
       Node F = new Node ('F');
       Node G = new Node ('G');
       Node H = new Node ('H');
       Node I = new Node ('I');
       Node J = new Node ('J');
       A.left = B;
       A.right = C;
       B.left = D;
       B.right = E;
       C.left = F;
       C.right = G;
       D.left = H;
       F.left = I;
       G.right = J;
       return A;
   }
   //先序遍历
    public static void prevOrder(Node root){
       if(root == null){
           return ;
        }
        System.out.print(root.val);
        prevOrder(root.left);
        prevOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root == null){
            return ;
        } inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null){
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val);
    }
    public static void main(String [] args){
    root = build();
        prevOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
   }
}
