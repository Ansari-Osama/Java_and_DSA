
// WAP to Print the Following Pattern.
/*
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6 
*/

package Patterns;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Row: ");
        int row = sc.nextInt();
        System.out.println("Enter the Number of Column: ");
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
