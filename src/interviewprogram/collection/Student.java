package interviewprogram.collection;

import javax.lang.model.element.Name;
import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private String Section;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }


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
