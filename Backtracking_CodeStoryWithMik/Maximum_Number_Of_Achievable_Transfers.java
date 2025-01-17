package Backtracking_CodeStoryWithMik;

public class Maximum_Number_Of_Achievable_Transfers {

    int result;

    public int maximumRequests(int n, int[][] requests) {

        int[] resultant=new int[n];

        solve(0,0,resultant,requests);
        return result;
    }

    public void solve(int idx,int count,int[] resultant,int [][] requests)
    {
        if(idx>=requests.length)
        {
            if(isResultantZero(resultant))
            {
                result=Math.max(count,result);
            }
            return;
        }

        int from =requests[idx][0];
        int to = requests[idx][1];

        resultant[from]--;
        resultant[to]++;

        solve(idx+1,count+1,resultant,requests);

        resultant[from]++;
        resultant[to]--;

        solve(idx+1,count,resultant,requests);
    }

    public  boolean isResultantZero(int[] arr)
    {
        for(int a:arr)
        {
            if(a!=0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Maximum_Number_Of_Achievable_Transfers obj=new Maximum_Number_Of_Achievable_Transfers();
        int[][] requests={{1,2},{2,1},{0,1}};
        System.out.println( obj.maximumRequests(3,requests));

    }
}
