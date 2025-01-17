package Java8_Features.Stream_Apis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Sample_Main {

    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        lst.add(12);
        lst.add(11);
        lst.add(13);
        lst.add(14);
        lst.add(15);
        lst.add(17);
        lst.add(18);

        List<Integer>  evenNums = lst.stream().filter(e -> e % 2 == 0).toList();

        System.out.println(evenNums);
    }
}
