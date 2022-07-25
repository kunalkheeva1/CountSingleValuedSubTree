//tree node
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
    //get a recursive call method which is basically working as a postorder traversal
    static boolean rec(Node root){
        if(root == null) return true;

        //store the results of left and right node
        boolean ls = rec(root.left);
        boolean rs = rec(root.right);

        //if either of the result is false, then return false
        if(ls== false || rs== false ){
            return false;
        }
        //if its side element is not null and not having similar data then return false
        if(root.left != null && root.left.data != root.data){
            return false;
        }
        if(root.right != null && root.right.data != root.data){
            return false;
        }
        //otherwise just increment the count and return true
        count ++;
        return true;
    }
    static int countSingleValuedSubTree(Node root){
        //apply the rec method approach to count the number of singlevalued subtreees
        count =0;
        rec(root);
        return count;

    }



    public static void main(String[] args) {

    }
}
