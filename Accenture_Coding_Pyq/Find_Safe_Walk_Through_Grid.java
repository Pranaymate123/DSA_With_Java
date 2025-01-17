package Accenture_Coding_Pyq;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find_Safe_Walk_Through_Grid {

    public static boolean solve(List<List<Integer>> grid,int i,int j,int health,int m,int n,int[][] visited)
    {
        visited[i][j]=1;
        if(i>=m-1 && j>=n-1 && health==0 ) return false;
       if(health==0) return false;
       if(i>=m-1 && j>=n-1 ) return true;



       boolean left=false;
       boolean right=false;
       boolean top=false;
       boolean bottom=false;

        //right
        if(j<n-1  && visited[i][j+1] ==0)
        {
            System.out.println("goes right");
            if(grid.get(i).get(j+1)==1) health-=1;
            left= solve(grid,i,j+1,health,m,n,visited);
            if(grid.get(i).get(j+1)==1) health+=1;
            visited[i][j+1]=0;
        }
        //bottom
        if(i<m-1 && visited[i+1][j] ==0)
        {
            System.out.println("goes bottom");
            if(grid.get(i+1).get(j)==1) health-=1;
            bottom=solve(grid,i+1,j,health,m,n,visited);
            if(grid.get(i+1).get(j)==1) health+=1;
            visited[i+1][j]=0;
        }

        //left
        if(j>0 && visited[i][j-1] ==0)
        {
            System.out.println("goes left");
            if(grid.get(i).get(j-1)==1) health-=1;

            right=solve(grid,i,j-1,health,m,n,visited);
            if(grid.get(i).get(j-1)==1) health+=1;
            visited[i][j-1]=0;
        }
        // Top
        if(i>0 && visited[i-1][j] ==0)
        {
            System.out.println("goes top");
            if(grid.get(i-1).get(j)==1) health-=1;
            top=solve(grid,i-1,j,health,m,n,visited);
            if(grid.get(i-1).get(j)==1) health+=1;
            visited[i-1][j]=0;
        }
        return (left || right || top || bottom);
    }
    public static boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m=grid.size();
        int n=grid.get(0).size();
        if(grid.get(0).get(0)==1) health-=1;
        int[][] visited=new int[m+1][n+1];
        visited[0][0]=1;

        int [][] dp=new int[m+1][n+1];
        return solve(grid,0,0,health,m,n,visited);
    }

    public static void main(String[] args) {
        List<List<Integer>> grid=new ArrayList<>();


        List<Integer> ds1=new ArrayList<>();
        ds1.add(1);
        ds1.add(1);
        ds1.add(1);
//        ds1.add(0);
//        ds1.add(0);
        List<Integer> ds2=new ArrayList<>();
        ds2.add(1);
        ds2.add(0);
        ds2.add(1);
//        ds2.add(1);
//        ds2.add(0);

        List<Integer> ds3=new ArrayList<>();
        ds3.add(1);
        ds3.add(1);
        ds3.add(1);
//        ds3.add(1);
//        ds3.add(0);

        grid.add(ds1);
        grid.add(ds2);
        grid.add(ds3);

//        int m=3;
//        int n=5;
//        int health=1;
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<m;i++)
//        {
//            List<Integer> ds=new ArrayList<>();
//            for(int j=0;j<n;j++)
//            {
//                System.out.println("Enter the number");
//                ds.add(sc.nextInt());
//            }
//            grid.add(ds);
//        }
        for(List<Integer> lst:grid)
        {
            System.out.println(lst);
        }
        int health=5;
//        int[][] visited=new int[grid.size()][ds1.size()];
        System.out.println( findSafeWalk(grid,health));

    }
}
