package Java8_Features.Comparator_package;



import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student_Main {
    public static void main(String[] args) {

        // To sort the objects using comapratpr we need to make the implmentation class of this for each different sorting logic
        //e.g. IdComaparator , AgeComparator
        List<Student> students =new ArrayList<>();
        students.add(new Student(1,"Pranay",20));
        students.add(new Student(10,"Karan",25));
        students.add(new Student(8,"Raj",18));
        students.add(new Student(5,"Erk",45));
        students.add(new Student(3,"Rohit",36));
        System.out.println(students);

        //Here to sort based on the student Id what I have done is I have created the IdComparator Which basically implments the
        //Functional interface Comparator And sort based on the ID
        Collections.sort(students,new IdComparator());
        System.out.println(students);

        // As we know that the Comparator is the functional interface we can write its implementation using the lambda function also

        Comparator<Student> AgeComparator=(o1,o2)->{
            return o1.getAge()-o2.getAge();
        };

        Collections.sort(students,AgeComparator);
        System.out.println(students);


        /// Another shortcut way to do this is
        Collections.sort(students,(a,b)->a.getId()-b.getId());
        System.out.println(students);

        //now based on the names
        students.sort((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(students);
    }

}
