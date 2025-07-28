package Java_Interview_Topics.Java8_Features.Stream_Apis;

import java.util.*;

public class Stream_Telusko {


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 1, 2, 9);

        Integer ans = nums.stream()
                .filter(d -> d % 2 == 1)
                .map(d -> d * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(ans);



        List<Integer> data = Arrays.asList(4, 5, 1, 2, 9);

        List<Integer> evenData=data.stream().filter(d->d%2==0).toList();

        System.out.println(evenData);



    }
}
