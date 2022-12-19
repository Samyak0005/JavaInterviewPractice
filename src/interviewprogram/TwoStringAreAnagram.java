package interviewprogram;

import java.util.Arrays;

public class TwoStringAreAnagram {
    public static void main(String[] args) {

        //silent , listen
        String s1 = "silent";
        String s2 = "listen";

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        Boolean result = Arrays.equals(ch1,ch2);
        if (result==true){
            System.out.println("Anagram");
        }else {
            System.out.println("this is not Anagram");
        }
    }
}
