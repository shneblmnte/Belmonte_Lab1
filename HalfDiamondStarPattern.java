import java.util.Scanner;

public class HalfDiamondStarPattern { // Class name.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: "); // Input the number of rows.
        int n = scanner.nextInt();
        halfDiamondstar(n);
        scanner.close();
    }

    public static void halfDiamondstar(int n) {

        System.out.println("*"); // Print the start of the half diamond star pattern.

        // Upper part of the half diamond star pattern.
        for (int i = 1; i <= n; i++) { // Use for loop.
            System.out.print("*");  // Print the "*" before the number.
            for (int j = 1; j <= i; j++) {
                System.out.print(j); 
            }
            for (int j = i - 1; j >= 1; j--) { // for loop.
                System.out.print(j);
            }
            System.out.print("*"); // Print the "*" after the number.
            System.out.println();
        } 

        // Lower part of the half diamond star pattern.
        for (int i = n - 1; i >= 1; i--) { // for loop.
            System.out.print("*"); // Print the "*" before the number.
            for (int j = 1; j <= i; j++) {
                
                System.out.print(j);
                
            }
            for (int j = i - 1; j >= 1; j--) { // for loop.
                
                System.out.print(j);
                
            }
            System.out.print("*"); // Print the "*" after the number.
            System.out.println();
        }
        System.out.println("*"); // Print the end of the half diamond star pattern.
    }
}