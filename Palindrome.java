import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");// Prompts user to enter a number
        String s = sc.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i <= s.length() - 1; i++) {
            char c1 = s.charAt(i);
            int j = s.length() - 1 - i;
            char c2 = s.charAt(j);

            if (c1 != c2){
                isPalindrome = false;
            } // if statement
        } // for

        if (isPalindrome == true){
            System.out.println("Entered string/number is a palindrome.");
        } else
            System.out.println("Entered string/number isn't a palindrome.");

    }// main

}// class