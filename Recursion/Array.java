package Recursion;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
//        int arr[]={1,2,23,45,4,4,97,87,4,98};
//        System.out.println(checkSorted(arr,0));
//        System.out.println(findNumber(arr,0,97));
//        ArrayList<Integer> lst=findAllIndexes2(arr,4,0);
//        System.out.println(lst);
        int arr[]={5,6,7,8,9,1,2,3,4};
        System.out.println(searchInRotatedSortedArray(arr,0,arr.length-1,3));
    }

    public static boolean checkSorted(int arr[],int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && checkSorted(arr,index+1);
    }

    public static boolean findNumber(int arr[],int index,int target)
    {

        if(index== arr.length)
        {
            return false;
        }
        return arr[index]==target || findNumber(arr,index+1,target);
    }
    public static ArrayList<Integer> findAllIndexes(int arr[],int target,int index,ArrayList<Integer> list)
    {
        if(arr.length==index)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }

            return findAllIndexes(arr,target,index+1,list);

    }

    public static ArrayList<Integer> findAllIndexes2(int arr[],int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==index)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }

        ArrayList<Integer> ansfromBelow= findAllIndexes2(arr,target,index+1);
        ansfromBelow.addAll(list);

        return ansfromBelow;

    }
    public static  int searchInRotatedSortedArray(int arr[],int s,int e,int target)
    {
        int m=s+(e-s)/2;
        if(s>=e)
        {
            return -1;
        }
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[s]<=arr[m])
        {
            if(target>=arr[s] && target<=arr[m])
            {
               return  searchInRotatedSortedArray(arr,s,m-1,target);
            }
            else
            {
                return  searchInRotatedSortedArray(arr,m+1,e,target);

            }
        }
        else if(target>=arr[m] && target<=arr[e])
        {
            return  searchInRotatedSortedArray(arr,m+1,e,target);
        }

        return  searchInRotatedSortedArray(arr,s,m-1,target);

    }
}
