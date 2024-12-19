import java.util.Scanner;
public class Prb11_Remove_Vowels {
    public static void main(String[] args) {
        String inputString;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        inputString = scanner.nextLine();
        inputString = inputString.toLowerCase();
        String vowelsList = "aeiou";
        StringBuilder resultBuilder = new StringBuilder();
        for (int index = 0; index < inputString.length(); index++) {
            char currentChar = inputString.charAt(index);
            if (vowelsList.indexOf(currentChar) != -1) continue;
            resultBuilder.append(currentChar);
        }

        String resultString = String.valueOf(resultBuilder);
        resultString = resultString.trim();
        resultString = resultString.replaceAll(" +", " ");

        System.out.println("After removing vowels from the sentence: " + resultString);
    }
}
