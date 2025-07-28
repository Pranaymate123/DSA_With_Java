package Java_Interview_Topics.Java8_Features.Stream_Apis;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sum_Of_Squares {

    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(1,2,3,4);

        Optional<Integer> squaredSum= lst.stream().map(a->a*a).reduce((c, e)->c+e);
        System.out.println(squaredSum);
        System.out.println(squaredSum.get());

    }
}
