import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
    // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Value: ");//Prompts user to enter a number
        int num = sc.nextInt();
        sc.close();

        boolean isPrime = true; 

        for (int i = 2; i < num; i++) {
        if (num % i == 0) {
        isPrime = false;
            } //if statement
        } //for statement

        if (isPrime) {
        System.out.println(num + " is a Prime Number");
        } else
        System.out.println(num + " is not a Prime Number");

    }//main

}//class
