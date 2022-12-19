package interviewprogram.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {

        HashMap<Integer, ArrayList<Student>> Hash = new HashMap<>();

        ArrayList<Student> newList = new ArrayList<>();
        Student student = new Student("Samyak Bhai",23,"InformationTechnology");
        Student student1 = new Student("Chotu bhai",22,"Sql");
        Student student2 = new Student("Anuraj",23,"Testing");

        newList.add(student);
        newList.add(student1);
        newList.add(student2);

        Hash.put(1,newList);

        for (Student var: Hash.get(1)){
            System.out.println(var.getName());
        }

        HashMap<String , Student> lst = new HashMap<>();
        Student student5 = new Student("Samyak Bhai",23,"InformationTechnology");
        Student student3 = new Student("Chotu bhai",22,"Sql");
        Student student4 = new Student("Anuraj",23,"Testing");

        lst.put("Kpgi",student4);
        lst.put("Hindustan",student5);
        lst.put("Anant",student3);

        for (String var: lst.keySet()){
            System.out.println(lst.get(var).getName());
        }


    }
}
