package Recursion.CodeStoryWithMik;

import Recursion.Array;

import java.util.ArrayList;

public class Rat_In_A_Maze_Problem {

    public static int count=0;
    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> result=new ArrayList<>();
        solve(0,0,mat,new StringBuilder(),result);
        result.sort(String::compareTo);
        return result;
    }

    public static void solve(int i,int j,ArrayList<ArrayList<Integer>> mat,StringBuilder path,ArrayList<String> result)
    {
        if(i<0 || i>=mat.size() || j<0 || j>=mat.size() || mat.get(i).get(j)==0)
        {
            return;
        }

        if(i==mat.size()-1 && j== mat.size()-1)
        {
            result.add(path.toString());
            count++;
            return;
        }

        mat.get(i).set(j,0);

        //left
        path.append('L');
        solve(i,j-1,mat,path,result);
        path.replace(path.length()-1,path.length(),"");

        //Right
        path.append('R');
        solve(i,j+1,mat,path,result);
        path.replace(path.length()-1,path.length(),"");

        //Down
        path.append('D');
        solve(i+1,j,mat,path,result);
        path.replace(path.length()-1,path.length(),"");

        //Up
        path.append('U');
        solve(i-1,j,mat,path,result);
        path.replace(path.length()-1,path.length(),"");



        //backtrack
        mat.get(i).set(j,1);
    }

    public static boolean isSafe(int i,int j,ArrayList<ArrayList<Integer>> mat)
    {
        int n=mat.size();
        return (i>=0 && i< n && j>=0 && j<n && mat.get(i).get(j)==1);
    }



    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mat=new ArrayList<>();

        ArrayList<Integer> row1=new ArrayList<>();
        row1.add(1);
        row1.add(0);
        row1.add(0);
        row1.add(0);

        mat.add(new ArrayList<>(row1));

        ArrayList<Integer> row2=new ArrayList<>();
        row2.add(1);
        row2.add(1);
        row2.add(0);
        row2.add(1);

        mat.add(new ArrayList<>(row2));

        ArrayList<Integer> row3=new ArrayList<>();
        row3.add(1);
        row3.add(1);
        row3.add(0);
        row3.add(0);

        mat.add(new ArrayList<>(row3));

        ArrayList<Integer> row4=new ArrayList<>();
        row4.add(0);
        row4.add(1);
        row4.add(1);
        row4.add(1);

        mat.add(new ArrayList<>(row4));

        for(ArrayList<Integer> e:mat)
        {
            System.out.println(e);
        }
        System.out.println(findPath(mat));
        System.out.println("Count of Paths is "+count);
    }
}
