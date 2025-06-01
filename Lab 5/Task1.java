import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
        // TODO: Implement this using a loop
        for(int i=1; i<=10;i++){
            System.out.println(i);
        }
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {
        // TODO: Implement this recursively
        if(i>10){
            return;
        }
        System.out.println(i);
        task1B_recursive(i+1);
    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
        // TODO: Implement this using a loop
        for(int i =1; i<=n;i++){
            System.out.println(i);
        }
    }

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
        // TODO: Implement this recursively
        if(i>n){
            return;
        }
        System.out.println(i);
        task1D_recursive(i+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Driver code for testing Task 1 methods
        // Write on your own
        task1A();
        task1B_recursive(1);
        task1C(3);
        task1D_recursive(1, 3);

        sc.close();
    }
}
