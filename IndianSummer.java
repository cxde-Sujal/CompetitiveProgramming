import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class IndianSummer {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Set<String> s= new HashSet<>();
        for(int i=0;i<n;i++){
            String str=in.nextLine();
            s.add(str);
        }
        System.out.println(s.size());
        in.close();
    }
}
