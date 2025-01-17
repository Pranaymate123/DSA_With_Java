package Greedy;

import java.util.Arrays;

public class JobSequencing {

    class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }
    int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        int maxDeadLine=0;
        for(int i=0;i<arr.length;i++)
        {
            maxDeadLine=Math.max(maxDeadLine,arr[i].deadline);
        }

        int result[]=new int[maxDeadLine+1];

        for(int i=0;i<result.length;i++)
        {
            result[i]=-1;
        }

        int countJobs=0,totalProfit=0;

        for(int i=0;i<n;i++)
        {
            for(int j=arr[i].deadline;j>=0;j--)
            {
                if(result[j]==-1)
                {
                    result[j]=i;
                    countJobs++;
                    totalProfit+=arr[i].profit;
                    break;
                }
            }
        }
        int ans[]=new int[2];


            ans[0]=countJobs;
            ans[1]=totalProfit;
        return ans;
    }
    public static void main(String[] args) {

    }
}
