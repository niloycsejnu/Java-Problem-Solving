
import java.util.Random;

public class Prb10_Random_Password_Generator {

    public static void main(String[] args) {
        System.out.print("The Random Password is: ");
        System.out.println(generatePassword(8));
    }

    public static String generatePassword(int length) {
        if (length < 8) {
            throw new IllegalArgumentException("Password length must be at least 8");
        }

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?/";

        Random random = new Random();

        // Ensure the password contains at least one of each required character type
        char upper = upperCase.charAt(random.nextInt(upperCase.length()));
        char lower = lowerCase.charAt(random.nextInt(lowerCase.length()));
        char digit = digits.charAt(random.nextInt(digits.length()));
        char special = specialChars.charAt(random.nextInt(specialChars.length()));

        // Fill the remaining length with random characters from all categories
        String allChars = upperCase + lowerCase + digits + specialChars;
        StringBuilder password = new StringBuilder();
        password.append(upper).append(lower).append(digit).append(special);

        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }
        return shuffleString(password.toString());
    }

    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        Random random = new Random();
        for (int i = characters.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = characters[i];
            characters[i] = characters[index];
            characters[index] = temp;
        }
        return new String(characters);
    }
}
