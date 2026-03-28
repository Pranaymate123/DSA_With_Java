package Java_Interview_Topics.Java8_Features.Functional_Interfaces.Consumer_Interfae;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Pranay","Pune"));
        students.add(new Student("Karan","Bhandara"));
        students.add(new Student("Vaibhav","Wardha"));


        //Consumer functional interface takes the input of type <T> and returns nothing that means void hence name is consumer it consumes
        Consumer<Student> printStudent=s-> System.out.println("Name = "+s.getName()+" |  City = "+s.getCity());


        students.forEach(printStudent);


        Student student=new Student("Ekrar","Delhi");
         printStudent.accept(student);
    }
}
