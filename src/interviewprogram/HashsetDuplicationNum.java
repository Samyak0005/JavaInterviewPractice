package interviewprogram;

import java.util.HashSet;

public class HashsetDuplicationNum {
    public static void main(String[] args) {

        int marks[] = new int[]{23,45,70,60,70,50,45,23};

        boolean temp = false;
        HashSet<Integer> Marks = new HashSet<>();

        for (Integer arr: marks){
           if (Marks.add(arr)==false){
               System.out.println("Duplication value are Found  "+arr);
               temp = true;
           }
        }
        if (temp== false){
            System.out.println("Duplication value are not Found");
        }
    }
}
