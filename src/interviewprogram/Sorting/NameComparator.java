package interviewprogram.Sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Student_Model> {


    @Override
    public int compare(Student_Model o1, Student_Model o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
