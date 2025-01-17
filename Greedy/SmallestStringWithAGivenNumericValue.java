package Greedy;

import java.util.ArrayList;
import java.util.List;

public class SmallestStringWithAGivenNumericValue {

    public static String getSmallestString(int n, int k) {
        StringBuilder result=new StringBuilder("");
        List<Integer> lst=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            lst.add(1);
        }
        k=k-n;
        int i=lst.size()-1;
        while (k>0)
        {
            if(k>25)
            {
                lst.set(i,26);
                i--;
                k=k-25;
            }
            else
            {
                lst.set(i,k+1);
                k=0;
            }
        }

        //convert int to char
        for(int j=0;j<lst.size();j++)
        {
            result.append( (char)(lst.get(j)+96) );
        }
        return result.toString();

    }


    public static void main(String[] args) {
        System.out.println(getSmallestString(5,73));
    }
}
