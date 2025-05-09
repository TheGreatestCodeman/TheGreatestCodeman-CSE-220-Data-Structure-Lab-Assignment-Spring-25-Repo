// Task 03: Row Rotation Policy of BRACU Classroom
class Task3{

    //Complete this method so that it gives the Expected Output
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){

        
        int row = matrix.length;
        int col = matrix[0].length;
        int Aa_old_row = 0;
        int Aa_new_row = 0;
        String []temp = new String[1];
        for(int i =0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j].equals("AA")){
                    Aa_old_row = i;
                }
            }
        }
        Aa_new_row = (Aa_old_row+examWeek) % (row);
        for(int i=0; i <Aa_new_row; i++){
            temp = matrix[row-1];
            for(int j =row-1; j >0; j--){
                  matrix[j] = matrix[j-1];
            }
            matrix[0] = temp;
        }
        Arr.print2D(matrix);
        return Aa_new_row;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}