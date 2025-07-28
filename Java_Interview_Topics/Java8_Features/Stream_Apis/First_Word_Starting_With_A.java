package Java_Interview_Topics.Java8_Features.Stream_Apis;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class First_Word_Starting_With_A {

    public static void main(String[] args) {
            String[] strs={"hello", "Apple", "world", "Ant"};

           Stream<String> stream = Arrays.stream(strs).filter(s->s.startsWith("A"));

          Optional<String> ans= stream.findFirst();

        System.out.println(ans);



        }
}
