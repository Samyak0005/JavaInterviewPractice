package interviewprogram.Sorting;

public class Student_Model implements Comparable<Student_Model> {

    private String name;
    private int age;
    private String Section;

    public Student_Model(String name, int age, String section) {
        this.name = name;
        this.age = age;
        Section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }



    @Override
    public String toString() {
        return "Student_Model{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Section='" + Section + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student_Model o) {
        return this.age-o.age;
    }
}
