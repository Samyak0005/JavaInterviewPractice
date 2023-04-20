package interviewprogram.collection;

import java.util.HashSet;

public class StudentHashSet {

    public HashSet<Student> AddStudent(){

        HashSet<Student> List = new HashSet<>();
        Student student = new Student("Samyak",21,"Computer Science");
        Student student1 = new Student("Samyak",22,"ME");

        List.add(student);
        List.add(student1);

        return List;
    }

    public static void main(String[] args) {

        StudentHashSet studentHashSet = new StudentHashSet();
        HashSet<Student> List =  studentHashSet.AddStudent();

        for (Student var: List){
            System.out.println(var.getName()+var.getSection()+var.getAge());
        }
    }
}
