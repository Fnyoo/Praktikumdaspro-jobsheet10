import java.util.Scanner;
public class star13 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n = ");
    
    int n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
        System.out.print(i);
    }
        System.out.println();
        sc.close();
    }
}
