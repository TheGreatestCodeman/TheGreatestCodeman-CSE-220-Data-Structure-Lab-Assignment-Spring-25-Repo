// Task 04: Matrix Compression
class Task4{

    //Complete this method so that it gives the Expected Output
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        
        Integer [][] newArray = {{0,0},{0,0}};
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row-1;i+=2){
            for(int j=0; j<col-1;j+=2){
                newArray[i/2][j/2]+= matrix[i][j]+matrix[i+1][j]+matrix[i][j+1]+matrix[i+1][j+1];
            }
        }
        return newArray;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}