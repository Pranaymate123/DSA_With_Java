package Backtracking_CodeStoryWithMik;

import java.util.ArrayList;
import java.util.List;

public class Fair_Distribution_Of_Cookies {

    int result=Integer.MAX_VALUE;
    int[] children;
    public int distributeCookies(int[] cookies, int k) {
        children=new int[k];
        solve(0,children,cookies,k);
        return result;
    }
    public void solve(int idx,int[] children,int [] cookies,int k)
    {
        if(idx>=cookies.length)
        {
            //find max
            int unfairNess=getMaxElement(children);
            result=Math.min(result,unfairNess);
            return;
        }
        int cookie=cookies[idx];
        for(int i=0;i<k;i++)
        {
            children[i]+=cookie;

            solve(idx+1,children,cookies,k);

            children[i]-=cookie;
        }
    }
    public int getMaxElement(int[] arr) {
        int max=-1;
        for (int i : arr)
        {
            max=Math.max(i,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] cookies={8,15,10};
        Fair_Distribution_Of_Cookies obj=new Fair_Distribution_Of_Cookies();
        System.out.println(obj.distributeCookies(cookies,2));
    }
}
