package Java8_Features.Comparator_package;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId()-o2.getId();
    }
}
