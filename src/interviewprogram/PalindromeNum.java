package interviewprogram;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        /*
        so Palindrome no is no that always remains same when it reversed
        101
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 101
        int temp = n; // 101
        int r, rem = 0 ;
        while (n>0){ //101>0

            r = n%10;// 1 ,0, 1
            n = n/10;// 10 ,1, 0
            rem = (rem * 10) + r; // rem = 1, rem = 10 , rem = 100 + 1 =101
        }
        if (temp==rem){
            System.out.println("this is palindrome no");
        }
        else {
            System.out.println("this is not palindrome no");
        }
    }
}
