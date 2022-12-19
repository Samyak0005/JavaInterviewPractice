package interviewprogram.collection;

import java.util.ArrayList;

public class StudentArrayList {
    public ArrayList<Student> CreateStudentList() {

        ArrayList<Student> List = new ArrayList<>();
        Student student = new Student("Samyak", 21, "Computer Science");
        Student student1 = new Student("Anuraj", 22, "Scientist");
        Student student2 = new Student("Ritik", 20, "InformationTech");

        List.add(student);
        List.add(student1);
        List.add(student2);

        return List;
    }

    public static void main(String[] args) {

        StudentArrayList obj = new StudentArrayList();
         ArrayList<Student> result = obj.CreateStudentList();

         for (Student var: result){
             if (var.getName().equals("Samyak")){
                 var.setName("Rohit");
             }
             System.out.println(var.getAge()+var.getName()+var.getSection());
         }



    }

}