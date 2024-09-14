/*Input
The first line contains the only integer n (0 ≤ n ≤ 10100000).
 It is guaranteed that n doesn't contain any leading zeroes.
single digit banao
Output
Print the number of times a number can be replaced by the sum of its digits until it only contains one digit.*/
//input - 991
//output - 3 (991->19->10->1)

import java.util.Scanner;

public class CountSOD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int count = 0;

        
        while (n.length() > 1) {
            int sum = 0;
            
            for (char digit : n.toCharArray()) {
                sum += digit - '0';  // Convert char to int and add to sum
            }
            
            n = String.valueOf(sum);
            count++;  
        }

        // Print the number of transformations
        System.out.println(count);
        in.close();
    }
}
//normal sod gives run time error for long digits