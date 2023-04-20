package interviewprogram.streamsApi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStream {
    public static void main(String[] args) {

        List<Integer> Marks = List.of(30,40,40,70,78,90,80,99,56,78,59);

        //Filter is deal with Predicate value it return true & false value if value are present Then Return True
     Stream<Integer> stream = Marks.stream();
     List<Integer> lst = stream.filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("Even No"+lst);

        //Map Deals with Function and each Elements apply operations

       lst = Marks.stream().map(i->i+1).collect(Collectors.toList());
        System.out.println(lst);

        //Sorted AscendingOrder
         Marks.stream().sorted().forEach(System.out::println);

         //DescendingOrder
         Marks.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

         //Max
       Integer integer = Marks.stream().max((x, y)->x.compareTo(y)).get();
        System.out.println(integer);

        //Min
        Integer integer1 = Marks.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(integer1);

        //Distinct Remove Duplication
        lst = Marks.stream().distinct().collect(Collectors.toList());
        System.out.println(lst);

        //Greater than
        lst = Marks.stream().filter(i->i>50).collect(Collectors.toList());
        System.out.println(lst);

        //Find duplicates
        lst = Marks.stream().filter(i-> Collections.frequency(Marks,i)>1).collect(Collectors.toList());
        System.out.println(lst);

    }
}
