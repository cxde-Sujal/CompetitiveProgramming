import java.util.Arrays;
import java.util.Scanner;

public class DifferentString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume newline after integer input
        
        while (t-- > 0) {
            String s = sc.nextLine();
            if (allCharactersSame(s)) {
                System.out.println("NO");
            } else {
                String sortedS = sortString(s);
                if (sortedS.equals(s)) {
                    // If sorted string is same as original, swap first two different characters
                    char[] chars = s.toCharArray();
                    for (int i = 0; i < chars.length - 1; i++) {
                        if (chars[i] != chars[i + 1]) {
                            // Swap characters
                            char temp = chars[i];
                            chars[i] = chars[i + 1];
                            chars[i + 1] = temp;
                            break;
                        }
                    }
                    System.out.println("YES");
                    System.out.println(new String(chars));
                } else {
                    System.out.println("YES");
                    System.out.println(sortedS);
                }
            }
        }
        
        sc.close();
    }

    // Helper method to check if all characters in the string are the same
    private static boolean allCharactersSame(String s) {
        char firstChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != firstChar) {
                return false;
            }
        }
        return true;
    }

    // Helper method to sort the characters in the string
    private static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
