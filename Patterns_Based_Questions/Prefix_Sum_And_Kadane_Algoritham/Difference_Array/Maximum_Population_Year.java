package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Difference_Array;

public class Maximum_Population_Year {

    public static int maximumPopulation(int[][] logs) {
        int[] diff = new int[2051];

        for(int[] log:logs)
        {
            int start = log[0];
            int end =  log[1];
            int x = 1;

            diff[start]+=x;
            diff[end]-=x;
        }

        //tale cumulative sum
        int ansYear=-1;
        int maxPopulation=0;

        int cSum=0;
        for(int i=0;i<diff.length;i++)
        {
            cSum+=diff[i];
            diff[i]=cSum;

            if(cSum>maxPopulation)
            {
                maxPopulation=cSum;
                ansYear=i;
            }
        }
        return ansYear;
    }
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};

        System.out.println(maximumPopulation(logs));
    }
}
