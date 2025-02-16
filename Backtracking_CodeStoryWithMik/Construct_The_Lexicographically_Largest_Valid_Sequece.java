package Backtracking_CodeStoryWithMik;

import java.util.Arrays;

public class Construct_The_Lexicographically_Largest_Valid_Sequece {

    public  int[] constructDistancedSequence(int n) {
        int[] result=new int[2*n-1];
        Arrays.fill(result,-1);
        boolean[] used=new boolean[n + 1];

        solve(result,n,used,0);

        return result;
    }

    public  boolean solve(int[] result,int n,boolean[] used,int i)
    {
        if(i>=result.length) return true;

        if(result[i]!=-1)
         {
             //If already set then no need to check for that index
             return solve(result,n,used,i+1);
         }

        for(int num=n;num>=1;num--)
        {

            if(used[num]) continue;

            result[i]=num;

            used[num]=true;

            if(num==1)
            {
                if(solve(result,n,used,i+1))
                {
                    return true;
                }
            }
            else
            {
                int j=i+num;

                if(j<result.length && result[j]==-1)
                {
                    result[j]=num;
                    if(solve(result,n,used,i+1))
                    {
                        return true;
                    }
                    result[j]=-1;
                }
            }
            result[i]=-1;
            used[num]=false;

        }
        return false;
    }
    public static void main(String[] args) {

        Construct_The_Lexicographically_Largest_Valid_Sequece obj=new Construct_The_Lexicographically_Largest_Valid_Sequece();
        System.out.println(Arrays.toString(obj.constructDistancedSequence(3)));
    }
}
