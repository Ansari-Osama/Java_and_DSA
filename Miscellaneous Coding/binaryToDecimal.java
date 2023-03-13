// WAP to Convert Binary Number into Decimal Number.

import java.util.Scanner;
import java.lang.Math;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number: ");
        int binaryNumber = sc.nextInt();
        int ans = 0, i = 0, binaryNumberCopy = binaryNumber;

        while (binaryNumber != 0) {
            int digit = binaryNumber % 10;
            if (digit == 1) {
                ans += (int) Math.pow(2, i);
            }
            binaryNumber /= 10;
            i++;
        }
        System.out.println("The Decimal Represenation of " + binaryNumberCopy + " is " + ans);
    }
}
