package interviewprogram.streamsApi;

import java.util.*;
import java.util.stream.Collectors;

public class SortedBySalary {
    public static void main(String[] args) {

        List<Employee> EmpData = new ArrayList<>();

        Employee employee = new Employee("Samyak",40000,"CS");
        Employee employee1 = new Employee("Anuraj",500000,"Technical");
        Employee employee2 = new Employee("Nitin",30000,"ME");

        EmpData.add(employee);
        EmpData.add(employee1);
        EmpData.add(employee2);

        Collections.sort(EmpData,(o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        System.out.println(EmpData);

        EmpData.stream().sorted((o1, o2) -> (int)(o1.getSalary()- o2.getSalary())).forEach(System.out::println);

        //Maximum Salary

       Optional<Employee> maximumsalary = EmpData.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Maximum salary this guy"+maximumsalary);

        //Minimum Salary

        Optional<Employee> MinimumSalary = EmpData.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Minimum salary This Guy"+MinimumSalary);

        // Find greater than 10000

        EmpData.stream().filter(employee3 -> employee3.getSalary()>40000).forEach(System.out::println);


    }
}
