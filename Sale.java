/*Once Bob got to a sale of old TV sets. There were n TV sets at that sale. TV set with index i costs ai bellars. 
Some TV sets have a negative price — their owners are ready to pay Bob if he buys their useless apparatus.
 Bob can «buy» any TV sets he wants. 
 Though he's very strong, Bob can carry at most m TV sets, and he has no desire to go to the sale for the second time.
  Please, help Bob find out the maximum sum of money that he can earn.*/
/*input
  5 3
-6 0 35 -2 4*/
//output:8

//basic idea sort and only take negative elements that is take money as soon as positive elemnt comes so why to give money we need to maximize it

import java.util.Scanner;
import java.util.Arrays;
public class Sale {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n=in.nextInt();
       int m=in.nextInt();
       int cost[]= new int[n];
       for(int i=0;i<n;i++){
        cost[i]=in.nextInt();
       }
       Arrays.sort(cost);
       int sum=0;
       for(int i=0;i<m;i++){
          if(cost[i]<0){
            sum+=Math.abs(cost[i]);
          }else{
            break;
          }
       }
       System.out.println(sum);
       in.close();
    }
}
