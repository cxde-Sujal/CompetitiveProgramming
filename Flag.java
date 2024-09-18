/*According to a new ISO standard, a flag of every country should have a chequered field n × m, each square should be of one of 10 colours, and the flag should be «striped»: each horizontal row of the flag should contain squares of the same colour, and the colours of adjacent horizontal rows should be different. Berland's government asked you to find out whether their flag meets the new ISO standard.

Input
The first line of the input contains numbers n and m (1 ≤ n, m ≤ 100), n — the amount of rows, m — the amount of columns on the flag of Berland. Then there follows the description of the flag: each of the following n lines contain m characters. Each character is a digit between 0 and 9, and stands for the colour of the corresponding square.

Output
Output YES, if the flag meets the new ISO standard, and NO otherwise.*/


import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] a = new char[n][m];

        
        for (int i = 0; i < n; i++) {
            String row = in.next();  // Reading entire row as string
            a[i] = row.toCharArray();  // Converting the string into char array
        }

        // Check the flag's validity
        for (int i = 0; i < n; i++) {
            char firstColor = a[i][0];
            
            // Check if all elements in the row are the same
            for (int j = 1; j < m; j++) {
                if (a[i][j] != firstColor) {
                    System.out.println("NO");
                    return;
                }
            }
            
            // Check if adjacent rows have different colors
            if (i < n - 1 && a[i][0] == a[i + 1][0]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        in.close();
    }
}
