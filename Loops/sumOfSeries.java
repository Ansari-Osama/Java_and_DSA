// WAP to Sum the following Series.
// e.g. : 1 - 2 + 3 - 4 + 5 ....... n 

import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N");
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans = ans - i;
            } else {
                ans = ans + i;
            }
        }
        System.out.println("The Sum of Series is " + ans);
        sc.close();
    }
}
