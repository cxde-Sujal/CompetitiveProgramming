import java.util.Scanner;

public class MyFirstSortingPoblem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
           int x=in.nextInt();
           int y=in.nextInt();
           int min=Math.min(x,y);
           int max=Math.max(x,y);
           System.out.println(min+" "+max);
           t--;
        }
        in.close();
    }
}
