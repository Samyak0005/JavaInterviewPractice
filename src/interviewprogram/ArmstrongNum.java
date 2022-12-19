package interviewprogram;

public class ArmstrongNum {
    public static void main(String[] args) {

        /* so Armstrong no is a no that integer value is equal itself when Sequaring of each Digits then Sum of digit
        is equal itself
        153 = (1*1*1)+(5*5*5)+(3*3*3)
        1+125+27 = 153
         */

        int n = 153;
        int temp = n;
        int r, rem = 0 ;

        while (n>0){
            r = n % 10;
            n = n/10;
            rem = rem + r*r*r;
        }
        if (temp==rem){
            System.out.println("This is Armstrong no  "+ rem);
        }else{
            System.out.println("This is not a Armstrong no  " + rem);
        }
    }
}
