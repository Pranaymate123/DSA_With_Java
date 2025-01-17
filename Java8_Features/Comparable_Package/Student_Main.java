package Java8_Features.Comparable_Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_Main {

    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        lst.add(45);
        lst.add(25);
        lst.add(35);
        lst.add(15);
        lst.add(5);
        lst.add(95);
        lst.add(65);
        System.out.println(lst);
        //To sort the Integers
        Collections.sort(lst);
        System.out.println(lst);


//        Now to sort the objects yusing comparable interface

        //By comparable we need to implement this interface and we have to write the custom sorting logic in class(Student.java)
        //And we can use only single shorting logic by this and if suppose we have another list in which we want to sort a/c to age then
        //we have to change the sorting logic in the source code of Student.java class
        //To 0vercome this Comparator comes with multiple sorting logics
        List<Student> students =new ArrayList<>();
        students.add(new Student(1,"Pranay",20));
        students.add(new Student(10,"Karan",25));
        students.add(new Student(8,"Raj",18));
        students.add(new Student(5,"Erk",45));
        students.add(new Student(3,"Rohit",36));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }

}
