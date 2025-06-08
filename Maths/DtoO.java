package Maths;

import java.util.Scanner;

public class DtoO {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        int rem, ans=0;
        int mul=1;
        while(num>0){
             rem = num % 8;
            num = num / 8;
            ans = rem * mul + ans;
            mul *= 10;
        }
        System.out.println("Ans :" + ans);
        sc.close();
    }
}
