package Maths;
import java.util.*;
public class OtoD {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        int rem, ans=0;
        int mul=1;
        while(num>0){
             rem = num % 10;
            num = num / 10;
            ans = rem * mul + ans;
            mul *= 8;
        }
        System.out.println("Ans :" + ans);
        sc.close();
    }
}
