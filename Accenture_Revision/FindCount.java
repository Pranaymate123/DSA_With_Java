package Accenture_Revision;

public class FindCount {

    public static int getCount(int[] arr,int num,int diff)
    {
        int cnt=0;
        for(int i:arr)
        {
            if(Math.abs(i-num)<=diff)
            {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr={12,3,14,56,77,13};
        System.out.println(getCount(arr,13,2));
    }
}
