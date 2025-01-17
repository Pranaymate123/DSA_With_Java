package Cognizant_Coding_Pyq;

public class Maximum_Balloons {

    public static int getMaxBallonsThatHeCanBuyByBuyingToPacktesUnderBudget(int[] balloons,int[] cost,int budeget)
    {
        int max=-1;
        for(int i=0;i<balloons.length;i++)
        {
            for(int j=i+1;j<balloons.length;j++)
            {
                if(cost[i]+cost[j]<=budeget && (balloons[i]+balloons[j])>max)
                {
                    max=balloons[i]+balloons[j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] balloons={4,6,2,7};
        int[] cost={5,3,1,6};
        int budget=8;

        System.out.println(getMaxBallonsThatHeCanBuyByBuyingToPacktesUnderBudget(balloons,cost,budget));
    }
}
