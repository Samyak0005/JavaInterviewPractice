package interviewprogram.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArraylistSorting {
    public static void main(String[] args) {


        ArrayList<Student_Model> studentData = new ArrayList<>();

        Student_Model student_model = new Student_Model("Samyak", 21, "ComputerScience");
        Student_Model student_model1 = new Student_Model("Anuraj", 20, "Management");
        Student_Model student_model2 = new Student_Model("Nitin", 22, "Database");

        studentData.add(student_model);
        studentData.add(student_model1);
        studentData.add(student_model2);

//        for (Student_Model var: studentData){
//            System.out.println(var.getName()+var.getSection()+var.getAge());
//        }

//        Collections.sort(studentData);
//        System.out.println(studentData);

        ArrayList<Student_Model> studentData1 = new ArrayList<>(studentData);

        Collections.sort(studentData1,new SectionComparator());
        System.out.println(studentData1);

        ArrayList<Student_Model> studentData2 = new ArrayList<>(studentData);

        Collections.sort(studentData2,new NameComparator());
        System.out.println(studentData2);

    }
}
