package Accenture_Coding_Pyq;

public class Coin_Toss {

    public static int getScoreOfToss(String str)
    {
        int cnt=0;
        int score=0;
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='H')
            {
                score=score+2;
                cnt++;
                if(cnt==3)
                {
                    return score;
                }
            }
            else
            {
                score=score-1;
                cnt=0;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        String str="HTHHTTHTHHHT";
        System.out.println(getScoreOfToss(str));
    }
}
