import java.util.Scanner; //Imports Scanner Class

public class Factorial {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");// Prompts user to enter a number
        int n = sc.nextInt(); // Initialize
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        } // Ends For Loop

        System.out.println("Factorial of  is: " + fact); // Print Statement

    }// main

} // class