import java.util.Scanner;

public class Assigment3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of stores: ");
        int numberOfStores = sc.nextInt();

        int totalItemsAcrossAllStores = 0;
        int storeWithMostItems = 1;
        int maxItemsCount = -1;

        for (int i = 1; i <= numberOfStores; i++) {
            System.out.println("\nStore " + i);

            System.out.print("Enter the number of customers: ");
            int numberOfCustomers = sc.nextInt();

            int totalItemsInStore = 0;

            for (int j = 1; j <= numberOfCustomers; j++) {
                System.out.print("Number of items for customer " + j + ": ");
                int numberOfItems = sc.nextInt();

                totalItemsInStore += numberOfItems;
            }

            System.out.println("Store " + i
                    + " - customers: " + numberOfCustomers
                    + ", total items: " + totalItemsInStore);

            totalItemsAcrossAllStores += totalItemsInStore;

            if (totalItemsInStore > maxItemsCount) {
                maxItemsCount = totalItemsInStore;
                storeWithMostItems = i;
            }
        }

        System.out.println("\nTotal items across all stores: " + totalItemsAcrossAllStores);
        System.out.println("Store with the most items: " + storeWithMostItems);

        sc.close();
    }
}