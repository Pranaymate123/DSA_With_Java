package Java8_Features.Stream_Apis;

import java.util.Arrays;
import java.util.List;

public class Stream_Methods {

    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(2,1,4,5,6,88,5,52,11,22,111,235);
        //Stream Api Filter Method  --> Used to filter out the elements based on some condditions
        List<Integer> integers = lst.stream().filter(e -> e > 50).toList();
        System.out.println(integers);

        //Stream Api Map Method ---> Used to perform the opration on the list elements
        List<Integer> integers1 = lst.stream().map(e -> e * e).toList();

        System.out.println(integers1);

        //Max element
        System.out.println(lst);
        Integer maxEle = lst.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max Element is " + maxEle);

        //Min element
        Integer minEle = lst.stream().min((x, y) -> x.compareTo(y)).get();

        System.out.println("Minimum element is "+minEle);

        //ForEach Method of stream to iterate over each element
        lst.stream().forEach(System.out::println);

        //
        long count = lst.stream().count();
        System.out.println("Count of elements in the list "+count);


    }
}
