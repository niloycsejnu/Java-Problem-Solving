import java.util.Scanner;

public class Prb7_Lowest_Heights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i < 10; i++) {
            int height = scanner.nextInt();
            if (height < lowest) {
                secondLowest = lowest;
                lowest = height;
            } else if (height < secondLowest && height != lowest) {
                secondLowest = height;
            }
        }
        System.out.println("The two lowest heights are: ");
        System.out.println("Lowest: " + lowest + " cm");
        System.out.println("Second Lowest: " + secondLowest + " cm");
        scanner.close();
    }
}
