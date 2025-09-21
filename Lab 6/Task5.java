// Complete the subtractSummation method
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){
        return recr(root.left)-recr(root.right); 
    }
    public static Integer recr(BTNode root){
        if(root == null){
            return 0;
        }
        return (Integer)root.elem + recr(root.left) + recr(root.right);

    }
    //============================================================================

}