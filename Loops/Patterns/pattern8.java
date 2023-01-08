
// WAP to Print the Following Pattern.
/*
1 2 1 2 1 2
2 1 2 1 2 1
1 2 1 2 1 2
2 1 2 1 2 1 
*/

package Patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the Number of Columns: ");
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 2 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
