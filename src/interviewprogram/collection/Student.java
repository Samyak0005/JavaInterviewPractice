package interviewprogram.collection;

public class Student {

    private String name;
    private int age;
    private String Section;

    public Student(String name, int age, String section) {
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
}
