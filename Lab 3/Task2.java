//Task 02: Decryption Process
class Task2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){

        
        Integer [] newarray = new Integer[matrix[0].length-1];
        int temp = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<col; i++){
            int count = 0;
            for(int j=0; j<row; j++){
                count += matrix[j][i];
            }
            if(i>=1){
                newarray[temp] = count - newarray[temp];
                temp++;
                if(i<newarray.length){
                    if (newarray[temp] == null){
                        newarray[temp] = count;
                    }
                 }
            }
            else{
                newarray[temp] = count;
            }
        }
        return newarray;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}