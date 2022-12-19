package interviewprogram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findLargestElement {
    public static void main(String[] args) {
        int a[] = {40,50,70,67,89,29};

        int max = a[0];
        for (int i=0; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Largest Element  "+max);
    }
}
