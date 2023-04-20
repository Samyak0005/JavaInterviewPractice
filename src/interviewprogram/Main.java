package interviewprogram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();

        name = name+" ";
        String Lg = "",word = "";
        for (int i = 0; i<name.length(); i++){
            char ch = name.charAt(i);

            if (ch!=' '){
                word = word + ch;
            } else{
                               if (word.length()<=3)
                    System.out.println("Smallest Word "+word);

                if (word.length()>Lg.length())
                    Lg = word;

                    word = "";

            }
        }
        System.out.println("Longest word "+Lg);


    }


}
