package interviewprogram.streamsApi;

public class Employee {

    private String name;
    private long salary;
    private String dept;

    public Employee(String name, long salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
