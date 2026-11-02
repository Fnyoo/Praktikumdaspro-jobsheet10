import java.util.Scanner;

public class triangle13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        i = n;
        while (i >= 2) {
            int j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }

        sc.close();
    }
}
