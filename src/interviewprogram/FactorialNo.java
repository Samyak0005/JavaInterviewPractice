package interviewprogram;

import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n; i>=1; i--){
            System.out.println(i);
        }
        int j = 1, mul = 1;
        while (j<=n){

            mul = mul * j;
            j++;
        }
        System.out.println(mul);
    }
}
