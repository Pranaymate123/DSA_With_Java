package Array_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void getNextPermuation(int arr[])
    {

        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            lst.add(arr[i]);
        }

        //find the deep point by traversing from back if y get arr[i] < arr[i+1] then idx=i
        int n=arr.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            //iif its is the last permute
            Collections.reverse(lst);
            System.out.println(lst);
        }

        //now try to find the number which is greater than arr[idx] but smallest one
        for(int i=n-1;i>=idx;i--)
        {
            if(lst.get(idx) <lst.get(i))
            {
                //swap
                Collections.swap(lst,idx,i);
                break;
            }
        }

        //  reverse the remainig rray
        List<Integer> subList=lst.subList(idx+1,n);
        Collections.reverse(subList);
        System.out.println(lst);
        for(int i=0;i<n;i++)
        {
            arr[i]=lst.get(i);
        }
    }


    public static void main(String[] args) {
//        int arr[]={2,1,5,4,3,0,0};
        int arr[]={1,2,3};
        getNextPermuation(arr);
    }

}
