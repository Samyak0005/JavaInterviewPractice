package interviewprogram.streamsApi;

import java.util.ArrayList;
import java.util.List;

public class WithOutStream {

    public static void main(String[] args) {


        List<Integer> list = List.of(22, 34, 66, 70, 60,66, 12, 22, 66,31,23);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(22);
        list1.add(88);
        list1.add(45);
        list1.add(99);

        for (Integer var: list1){
            System.out.println(var);
        }

        // find Even No
        List<Integer> EvenNo = new ArrayList<>();

        for (Integer var: list){
            if (var%2==0){
                EvenNo.add(var);
            }
        }

        System.out.println(list);
        System.out.println(EvenNo);


    }
}
