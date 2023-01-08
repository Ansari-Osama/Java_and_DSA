// WAP to print Sum of Digits of a Number.

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int originalN = n, sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        System.out.println("Sum of Digits of " + originalN + " is " + sum);
        sc.close();
    }
}
