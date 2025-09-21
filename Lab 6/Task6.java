// Complete the levelSum method
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        return (-1)*(Integer)root.elem + recr(root.right, 2) + recr(root.left, 2);
    }
    public static Integer recr(BTNode root, int i){
        if (root == null){
            return 0;
        }
        if(i % 2 == 0){
            return (Integer)root.elem + recr(root.left, i+1) + recr(root.right, i+1);
        }
        else if(i % 2 !=0){
            return (-1)*(Integer)root.elem + recr(root.left, i+1) + recr(root.right, i+1);
        }
        else{
            return 0;
        }
    }
    //============================================================================

}