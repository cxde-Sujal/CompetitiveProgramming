import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Reading inputs n and x
        int n = in.nextInt();
        int x = in.nextInt();
        
        // Variable to keep count of how many times x occurs in the table
        int count = 0;
        
        // Iterate over all possible rows (i)
        for (int i = 1; i <= n; i++) {
            // Check if x is divisible by i
            if (x % i == 0) {
                int j = x / i;  // Compute j such that i * j = x
                if (j <= n) {   // Check if j is a valid column index
                    count++;    // Increment the count if the pair (i, j) is valid
                }
            }
        }
        
        // Output the final count
        System.out.println(count);
        in.close();
    }
}
