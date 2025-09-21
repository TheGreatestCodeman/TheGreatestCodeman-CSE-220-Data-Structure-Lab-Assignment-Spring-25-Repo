// Complete the swapChild method
public class Task4 {

    //===================================TASK#4===================================
    // This method takes only 3 parameters
    // 1st one is root of the given tree
    // 2nd one is there to help you count the levels
    // 3rd one is the level TILL whic you need to swap childs
    // All the changes will happen in-place
    // This method doesn't return anything
    // You can use extra helper private static methods as per need
    public static void swapChild( BTNode root, int lvl, int M ){
        if(lvl == M){
            return;
            }
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            return;
        }
        else if(root.left == null && root.right != null){
            root.left = root.right;
            root.right = null;    
        }
        else if (root.left != null && root.right == null){
            root.right = root.left;
            root.left = null;
        }
        else{
            BTNode swap = null;
            swap = root.right;
            root.right = root.left;
            root.left = swap;
        }
        swapChild(root.left, lvl+1, M);
        swapChild(root.right, lvl+1, M);
        return;
    }
    //============================================================================
}
