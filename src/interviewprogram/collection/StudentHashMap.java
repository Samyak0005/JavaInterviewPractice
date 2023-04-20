package interviewprogram.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentHashMap {

    public HashMap<Integer, ArrayList<Student>> StudentList(){

        HashMap<Integer,ArrayList<Student>> NewList = new HashMap<>();

        ArrayList<Student> newList = new ArrayList<>();
        Student student = new Student("Samyak Bhai",23,"InformationTechnology");
        Student student1 = new Student("Chotu bhai",22,"Sql");
        Student student2 = new Student("Anuraj",23,"Testing");

        newList.add(student);
        newList.add(student1);
        newList.add(student2);

        NewList.put(1,newList);

        return NewList;

    }

    public static void main(String[] args) {
        StudentHashMap studentHashMap = new StudentHashMap();
        HashMap<Integer,ArrayList<Student>> NewList = studentHashMap.StudentList();

        for (Student var: NewList.get(1) ){
            System.out.println(var.getName()+var.getSection()+var.getAge());
        }

    }
}
