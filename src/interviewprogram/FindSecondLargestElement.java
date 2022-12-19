package interviewprogram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] Marks = {45,67,80,60,34,56,70,7};

        Arrays.sort(Marks);
        System.out.println("First Largest Element  "+Marks[Marks.length-1]);
        System.out.println("Second Largest Element  "+Marks[Marks.length-2]);
    }
}
