import java.util.Scanner;

public class Assigment1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

                if (j < i) {
                    System.out.print(" ");
                }

                total++;
            }

            System.out.println();
        }

        System.out.println("Total numbers printed : " + total);

        sc.close();
    }
}