package Java_Interview_Topics.Java8_Features.Functional_Interfaces.Function_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {

        //Creating the studnets list
        List<Student> students=new ArrayList<>();
        students.add(new Student("Pranay","Pune"));
        students.add(new Student("Karan","Bhandara"));
        students.add(new Student("Raj","Pune"));
        students.add(new Student("Ekrar","Delhi"));
        students.add(new Student("Vaibhav","Wardha"));
        students.add(new Student("Yogesh","Solapur"));

        Function<Student,String> cityFromStudent=Student::getCity;

//        System.out.println(cityFromStudent.apply(new Student("pranay","Pune")));

        Function<String, Integer> getLengthOfCity=String::length;

//        System.out.println(getLengthOfCity.apply(new Student("Karan","Bhandara").getCity()));



        //Using it with the streams
//        List<String> listOfCities=students
//                .stream()
//                .map(cityFromStudent)
//                .toList();
//
//        System.out.println(listOfCities);

//
//        List<Integer> lengthOfCity=students
//                .stream()
//                .map(cityFromStudent)
//                .map(getLengthOfCity)
//                .toList();
//
//        System.out.println(lengthOfCity);


        //and then method in Streams
        //It calls the Function Left to right
        List<Integer> lengthOfCityUsingAndThen=students
                .stream()
                .map(cityFromStudent.andThen(getLengthOfCity))
                .toList();
        System.out.println("And then calling left to right ");
        System.out.println(lengthOfCityUsingAndThen);

        //compose in streams right to left
        List<Integer> lengthOfCityUsingCompose=students
                .stream()
                .map(getLengthOfCity.compose(cityFromStudent))
                .toList();

        System.out.println("Compose calling right to left");
        System.out.println(lengthOfCityUsingCompose);
    }
}
