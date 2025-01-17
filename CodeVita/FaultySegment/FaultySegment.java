package CodeVita.FaultySegment;

import java.util.*;

public class FaultySegment {
    public static void main(String[] args) {
        Integer p,q,r,s;
        p=1;
        q=2;
        r=0;
        s=(p^q) | (r|1) ;
        System.out.println(s);
    }
}
