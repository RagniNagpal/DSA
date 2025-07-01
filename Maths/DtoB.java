package Maths;


import java.util.*;

//This is decimal to binary
public class DtoB {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        int rem, ans=0;
        int mul=1;
        while(num>0){
            rem=num&1;
            num=num>>1;
            ans=rem*mul+ans;
            mul=mul*10;
        }
        System.out.println("Ans :" + ans);
        sc.close();
    }
}





