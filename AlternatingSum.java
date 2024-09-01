import java.util.Scanner;
public class AlternatingSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            // Read the length of the sequence
            int n = scanner.nextInt();

            // Initialize the alternating sum
            int alternatingSum = 0;

            // Read the sequence of numbers and calculate the alternating sum
            for (int j = 0; j < n; j++) {
                int num = scanner.nextInt();

                // Alternate between addition and subtraction
                if (j % 2 == 0) {
                    alternatingSum += num;  // Add for even index
                } else {
                    alternatingSum -= num;  // Subtract for odd index
                }
            }

            // Output the alternating sum for the current test case
            System.out.println(alternatingSum);
        }

        scanner.close();
    }
}