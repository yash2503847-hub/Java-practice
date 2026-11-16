
import java.util.Scanner;

public class TotalBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        double total = price * quantity;

        System.out.printf("Total Bill = %.2f%n", total);
    }
}
