//Task 01: Merge Sorted Array
class Task1{

    //Complete this method so that it gives the Expected Output
    public static Integer[] mergeSortedArray( Integer[] arr1, Integer[] arr2 ){
        int arraytotallength = arr1.length + arr2.length;
        Integer mergedarray [] = new Integer [arraytotallength];
        int temp = arr1.length;
        for(int i =0; i<arr1.length; i++){
            mergedarray[i] = arr1[i];
        }
        for(int i =0; i<arr2.length; i++){
            mergedarray[temp++] = arr2[i];
        }
        for(int i = 1; i < arraytotallength; ++i){
            int key = mergedarray[i];
            int j = i-1;
            
            while(j >= 0 && mergedarray[j] > key){
                mergedarray[j+1] = mergedarray[j];
                --j;
            }
            mergedarray[j+1] = key;
        }
        return mergedarray;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {2, 5, 6};
        System.out.print("Array 1: ");
        Arr.print(a1);
        System.out.print("Array 2: ");
        Arr.print(a2);
        System.out.println("Expected Output: [ 1 2 2 3 5 6 ]");
        Integer[] returned_val_1 = mergeSortedArray(a1, a2);
        System.out.print("Your Output: ");
        Arr.print(returned_val_1);
        System.out.print("\n======================\n");
        Integer[] a3 = {1, 3, 5, 11};
        Integer[] a4 = {2, 7, 8};
        System.out.print("\nArray 3: ");
        Arr.print(a3);
        System.out.print("Array 4: ");
        Arr.print(a4);
        System.out.println("Expected Output: [ 1 2 3 5 7 8 11 ]");
        Integer[] returned_val_2 = mergeSortedArray( a3, a4);
        System.out.print("Your Output: ");
        Arr.print(returned_val_2);
    }
}
