class Node {
    int data;
    Node left;
    Node right;
    Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class CountSingleValuedSubTree {

    static int count;
    static boolean rec(Node root){
        if(root == null) return true;

        boolean ls = rec(root.left);
        boolean rs = rec(root.right);

        if(ls== false || rs== false ){
            return false;
        }
        if(root.left != null && root.left.data != root.data){
            return false;
        }
        if(root.right != null && root.right.data != root.data){
            return false;
        }
        count ++;
        return true;
    }



    public static void main(String[] args) {

    }
}
