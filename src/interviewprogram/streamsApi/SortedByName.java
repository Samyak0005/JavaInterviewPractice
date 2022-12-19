package interviewprogram.streamsApi;

import java.util.*;
import java.util.stream.Collectors;

public class SortedByName {
    public static void main(String[] args) {

        List<Employee> EmpData = new ArrayList<>();

        Employee employee = new Employee("Samyak",40000,"CS");
        Employee employee1 = new Employee("Anuraj",500000,"Technical");
        Employee employee2 = new Employee("Nitin",30000,"ME");

        EmpData.add(employee);
        EmpData.add(employee1);
        EmpData.add(employee2);

//        Collections.sort(EmpData, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(EmpData,(o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(EmpData);

        EmpData.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);


    }
}
