package Java_Interview_Topics.Java8_Features.Stream_Apis;

import java.util.Arrays;
import java.util.List;

public class Sort_And_Remove_Duplicates {

    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(4, 2, 7, 2, 4, 1);

        List<Integer> ans=lst.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(ans);
    }
}
