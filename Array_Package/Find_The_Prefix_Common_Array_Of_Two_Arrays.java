package Array_Package;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Find_The_Prefix_Common_Array_Of_Two_Arrays {

    public static int[] findThePrefixCommonArray(int[] A,int[] B) {

        int count=0;
        int[] C=new int[A.length];
        int[] map=new int[A.length+1];
        for(int i=0;i<A.length;i++)
        {
            map[A[i]]=map[A[i]]+1;
            if(map[A[i]]==2)
            {
                count++;
            }
            map[B[i]]=map[B[i]]+1;
            if(map[B[i]]==2)
            {
                count++;
            }
            C[i]=count;
        }
        return C;
    }
    public static void main(String[] args) {

        int[] A={1,3,2,4};
        int[] B={3,1,2,4};

        System.out.println(Arrays.toString(findThePrefixCommonArray(A,B)));
    }
}
