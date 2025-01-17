package Accenture_Coding_Pyq;

public class FootBallGoalCounting {

    public static void getTheWinningTeamName(String str)
    {
        int cntA=0;
        int cntB=0;
        for(int i=4;i<str.length();i=i+5)
        {
            if(str.charAt(i)=='A')
            {
                cntA++;
            }
            else
            {
                cntB++;
            }
        }

        if(cntA>cntB)
        {
            System.out.println("TeamA");
        }
        else if(cntB>cntA)
            System.out.println("TeamB");
        else
            System.out.println("Tie");
    }

    public static void main(String[] args) {
        String str="TeamATeamATeamBTeamBTeamATeamATeamATeamB";
        getTheWinningTeamName(str);
    }
}
