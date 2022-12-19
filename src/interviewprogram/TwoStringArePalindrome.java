package interviewprogram;

import java.util.Locale;

public class TwoStringArePalindrome {
    public static void main(String[] args) {

        String name = "Madam";
        name = name.toLowerCase();
        String str = "";

        for (int i=name.length()-1; i>=0; i--){
            str = str+name.charAt(i);
        }
        if (str.equals(name)){
            System.out.println("String are Palindrome");
        }else{
            System.out.println("String are not Palindrome");
        }
    }
}
