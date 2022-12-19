package interviewprogram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        /*
        0 , 1 , 1 , 2 ,3,5,8,13,21
         */
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();

        int n1 = 0, n2 = 1, n3;
        System.out.println(n1);
        for (int i=1; i<n; i++){
            n3 = n2+n1;
            n2 = n1;
            n1 = n3;

            System.out.println(n3+"   ");
        }

    }
}
