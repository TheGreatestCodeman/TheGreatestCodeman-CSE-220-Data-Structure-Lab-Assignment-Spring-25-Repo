// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            return (Integer)root.elem+recurse(root.right, 1)+recurse(root.left, 1);
        }
        public static Integer recurse( BTNode temp, Integer i){
           if(temp == null){
            return 0;
           }
           return (Integer)temp.elem % i + recurse(temp.right, i+1) + recurse(temp.left, i+1);
        }
        //============================================================================

}
