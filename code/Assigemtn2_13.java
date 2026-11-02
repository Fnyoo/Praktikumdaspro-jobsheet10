import java.util.Scanner;

public class Assigemtn2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;

                System.out.printf("%4d", result);

                total += result;
            }

            System.out.println();
        }

        System.out.println("Total of all numbers : " + total);

    sc.close();
    }
}
