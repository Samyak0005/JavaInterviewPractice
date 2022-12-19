package interviewprogram;

import java.util.HashSet;

public class FindDuplicationCharacters {
    public static void main(String[] args) {

        String str = "Java is Good";
        str =str.replace(" ","");
        char ch[] = str.toCharArray();



        Boolean result = false;
        HashSet<Character> Char = new HashSet<>();
         for (Character var: ch){
             if (Char.add(var)==false){
                 System.out.println("Duplication  "+var);
                 result=true;
             }
         }
         if (result==false){
             System.out.println("No Duplication value");
         }



    }
}
