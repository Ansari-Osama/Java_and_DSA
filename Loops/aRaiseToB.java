// WAP to find A raise to the power B.

import java.util.Scanner;

public class aRaiseToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b: ");
        int b = sc.nextInt();
        int power = 1;
        for (int i = 1; i <= b; i++) {
            power = power * a;
        }
        System.out.println("Power of " + a + "^" + b + " is " + power);
        sc.close();
    }
}
