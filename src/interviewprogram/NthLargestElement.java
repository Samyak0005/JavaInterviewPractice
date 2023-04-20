package interviewprogram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NthLargestElement {

    public static void main(String[] args) {


        int[] Marks = {40, 50, 20, 70, 10, 80};
        Arrays.sort(Marks);
        System.out.println("Nth largest Element : "+Marks[Marks.length-1]);

    }
}
