import java.util.Random;
public class Prb4_Generate_Random_Numbers_Min_Max_Numbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.print("Generated 10 Random Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
    }
}
