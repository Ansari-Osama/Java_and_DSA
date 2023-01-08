// WAP to Count Number of Digits in a Given Number.

import java.util.Scanner;

public class numberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Count the Digits in it: ");
        int n = sc.nextInt();
        int counter = 0;
        while (n != 0) {
            n = n / 10;
            counter++;
        }
        System.out.println("There are " + counter + " Digits in a Number.");
        sc.close();
    }
}