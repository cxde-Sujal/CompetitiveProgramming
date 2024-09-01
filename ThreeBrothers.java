//Three brothers agreed to meet. Let's number the brothers as follows: 
//the oldest brother is number 1, the middle brother is number 2, and the youngest brother is number 3.

//When it was time for the meeting, one of the brothers was late. 
//Given the numbers of the two brothers who arrived on time, you need to determine the number of the brother who was late.
import java.util.*;
public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int ans=6 -a- b;
        System.out.println(ans);
    }
}
