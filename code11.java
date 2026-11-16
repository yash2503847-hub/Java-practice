
import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (str.length() >= 3) {
            System.out.println("First = " + str.charAt(0));
            System.out.println("Last = " + str.charAt(str.length() - 1));
            System.out.println("Third = " + str.charAt(2));
        } else {
            System.out.println("String must contain at least 3 characters");
        }
    }
}
