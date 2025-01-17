package Recursion;

import java.util.ArrayList;

public class RecursionEasy {

    public static void main(String[] args) {
//        System.err.println("Factorial Is "+fact(5));
//        System.err.println("Sum Of Digits  Is "+Reverse(1342));
//        System.out.println("Sum of digits "+sumOfDigits(1342));
//        System.out.println("Count Number of zeroes "+countNoOfZeroes(302005,0));
        int[] arr={1,2,3,4,4,8};
        System.out.println("All indexes "+findAllIndexes(arr,4,0));
        
    }

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
//    public static  int sumOfDigits(int n)
//    {
//        if(n<=0)
//        {
//            return 0;
//        }
//        return (n%10)+sumOfDigits(n/10);
//    }
    public static int Reverse(int n)
    {
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n,int digits)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem=n%10;
        return  rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1 );
    }

    private static int sumOfDigits(int n)
    {
        int rem=n%10;

        if(n<=0)
        {
            return 0;
        }

        return n%10+sumOfDigits(n/10);

    }
//
    public  static int countNoOfZeroes(int n,int count)
    {
        //special pattern how to pas value to above calls
        if(n<=0)
        {
            return count;
        }
        if(n%10==0)
        {
            return countNoOfZeroes(n/10,count+1);
        }
        return  countNoOfZeroes(n/10,count);
    }
    public  static ArrayList<Integer> findAllIndexes(int []arr, int target, int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index== arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }

             ArrayList<Integer> testList= findAllIndexes(arr,target,index+1);
                testList.addAll(list);
            return testList;



    }
}
