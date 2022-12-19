package interviewprogram;

import java.util.Scanner;

public class SwapTwoVarWithoutThirdVar {
    public static void main(String[] args) {

        System.out.println("Enter the value a and b for swapping");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a");
        int a = sc.nextInt();
        System.out.println("Enter value b");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a= "+a);
        System.out.println("b= "+b);


    }
}
