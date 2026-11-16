
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println("Length = " + str.length());
        System.out.println("Uppercase = " + str.toUpperCase());
        System.out.println("Lowercase = " + str.toLowerCase());
    }
}
