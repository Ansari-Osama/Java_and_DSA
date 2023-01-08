// WAP to print First N Factorial Number.

import java.util.Scanner;

public class firstNFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N : ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.println("Factorial of " + i + " : " + fact);
        }
        sc.close();
    }
}
