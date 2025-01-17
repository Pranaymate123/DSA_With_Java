package SlidingWindow;

public class Max_Points_From_Cards {
    public static int maxScore(int[] cardPoints, int k) {
        int i=0;
        int j=cardPoints.length-1;
        int points=0;
        int lSum=0;
        int rSum=0;
        while (i<k)
        {
            lSum=lSum+cardPoints[i];
            i++;
        }
        points=lSum;
        System.out.println("Left Sum " + lSum);
        i--;
        while (i>=0 && j>cardPoints.length-1-k)
        {
            lSum=lSum-cardPoints[i];
            i--;
            rSum=rSum+cardPoints[j];
            j--;

            points=Math.max(points,lSum+rSum);
        }


        return points;
    }

    public static void main(String[] args) {
        int [] arr={11,49,100,20,86,29,72};
        System.out.println(maxScore(arr,4));
    }
}
