package Array_Package;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static boolean checkDuplicates(int arr[])
    {
        boolean flag=true;
        HashSet<Integer> mySet=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            flag=mySet.add(arr[i]);
            if(!flag)
            {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,-1,12,-1};
        System.out.println(checkDuplicates(arr));
    }
}
