//Task 02: Container with Most Water
class Task2{

    //Complete this method so that it gives the Expected Output
    public static void mostWater( Integer[] height ){
        int max = 0;
        int temp = 0;
        for(int i=0; i<height.length; i++){
            for(int j=0; j<height.length; j++){
                if(height[i]>=height[j]){
                    temp = j-i;
                    if(temp <0){
                        temp *=-1;
                    }
                    if(height[i]*temp > max){
                        max = height[i]*(--temp);
                    }
                }
            }
        }
        System.out.print(max);
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
