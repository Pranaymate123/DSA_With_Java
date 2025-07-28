package Java_Interview_Topics.Java8_Features.Stream_Apis;

import java.util.Arrays;
import java.util.List;

public class Strings_Having_Length_Greater_Than_5 {

    public static void main(String[] args) {
        List<String> str= Arrays.asList("hello","world","stream","filtering","java");

        long countOfStringHavingLengthMoreThan5 = str.stream()
                .filter(s->s.length()>5)
                .count();

        System.out.println(countOfStringHavingLengthMoreThan5);


    }
}
