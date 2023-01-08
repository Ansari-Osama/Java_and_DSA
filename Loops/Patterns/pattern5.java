// WAP to Print the Following Pattern.
/*
      *
    * * *
  * * * * *
* * * * * * * 
*/

package Patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int space = 1; space <= row - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
