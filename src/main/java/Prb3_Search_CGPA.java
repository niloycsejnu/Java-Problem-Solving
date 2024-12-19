import java.util.Scanner;

public class Prb3_Search_CGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i = 0; i < cgpa.length - 1; i++) {
            for (int j = i + 1; j < cgpa.length; j++) {
                if (cgpa[i] > cgpa[j]) {
                    double temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your CGPA: ");
        double target = scanner.nextDouble();

        int result = binarySearch(cgpa, target);

        if (result != -1) {
            System.out.println("CGPA " + target + " found at index " + result + " in the sorted array.");
        } else {
            System.out.println("CGPA " + target + " is not present in the array.");
        }
    }

    public static int binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
