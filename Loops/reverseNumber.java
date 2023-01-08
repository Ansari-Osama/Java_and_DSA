// WAP to Reverse a Given Number.

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int originalN = n, reverse = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println("The Reverse of " + originalN + " is " + reverse);
        sc.close();
    }
}
