import java.util.Scanner;

public class Prb9_Binary_String_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is binary: ");
        String input = scanner.nextLine();

        if (isBinary(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scanner.close();
    }
    public static boolean isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }
}
