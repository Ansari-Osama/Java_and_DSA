// WAP to Convert Decimal Number into Binary Number.

import java.util.Scanner;
import java.lang.Math;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int n = sc.nextInt();
        int nCopy = n;
        int ans = 0, i = 0;

        // 1st Approach
        while (n != 0) {
            int rem = n % 2;
            ans = (rem * (int) Math.pow(10, i)) + ans;
            n = n / 2;
            i++;
        }
        System.out.println("The Binary Representation of " + nCopy + " is " + ans);

        // 2nd Approach
        // while (n != 0) {
        // int bit = n & 1;
        // n = n >> 1;
        // ans = (bit * (int) Math.pow(10, i)) + ans;
        // i++;
        // }
        // System.out.println("The Binary Representation of " + nCopy + " is " + ans);
        sc.close();
    }
}