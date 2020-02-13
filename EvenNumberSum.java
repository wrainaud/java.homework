import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min: ");
        int min = sc.nextInt();
        System.out.println("Enter max: ");
        int max = sc.nextInt();

        int sum = 0;

        /*
         * for(int i = min; i<= max; i++) { if(i % 2 == 0); sum = sum + i; }
         */

        int i = min;
        while (i <= max) {
            if (i % 2 == 0)
                sum = sum + i;
            i++;
        } // while

        System.out.println("The final sum is " + sum);

    }//main

}//class