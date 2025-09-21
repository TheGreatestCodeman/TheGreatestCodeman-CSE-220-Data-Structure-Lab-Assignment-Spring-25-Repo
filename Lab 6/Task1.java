// Complete the convertMirror method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll need to create a new Mirrored Tree and return the new root
    public static BTNode convertMirror( BTNode root ){
        // TO DO
        BTNode temp = root;
        recursevie(temp);
        return temp;
    }
    public static BTNode recursevie(BTNode temp){
        if(temp.left == null && temp.right == null){
            return temp;
        }
        else if(temp.left != null && temp.right==null){
            temp.right = temp.left;
            temp.left =null;
        }
        else if(temp.left == null && temp.right!=null){
            temp.left = temp.right;
            temp.right =null;
        }
        else{
            BTNode swap = null;
            swap = temp.left;
            temp.left = temp.right;
            temp.right = swap;
        }
        recursevie(temp.left);
        recursevie(temp.right);
        return temp;
    }
    //==================================================
}
