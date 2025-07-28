package Java_Interview_Topics.Java8_Features.Stream_Apis;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_Max_And_Min_Value {

    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(12, 45, 7, 89, 32);

        Optional<Integer> maxVal=lst.stream().max((a, b)->a-b);

        Optional<Integer> minVal = lst.stream().min((a,b)->a-b);

        System.out.println(maxVal.get());

        System.out.println(minVal.get());

    }
}
