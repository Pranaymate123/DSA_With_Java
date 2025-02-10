package Array_Package;

import java.util.*;

public class Find_The_Number_Of_Distinct_Colors_Among_The_Balls {


    public static int[] queryResults(int limit, int[][] queries) {

        Map<Integer,Integer> colourFreqMap=new HashMap<>();
        Map<Integer,Integer> ballsColouredMap=new HashMap<>();
        int[] ans=new int[queries.length];

        int i=0;
        for(int[] q:queries) {
            int ball=q[0];
            int color=q[1];
            if(!ballsColouredMap.containsKey(ball))
            {
                ballsColouredMap.put(ball,color);
                colourFreqMap.put(color,colourFreqMap.getOrDefault(color,0)+1);
                ans[i]=colourFreqMap.size();
                i++;
            }
            else
            {
                int prevColor=ballsColouredMap.get(ball);
                //decrease the feq of prev color
                colourFreqMap.put(prevColor,colourFreqMap.get(prevColor)-1);
                if(colourFreqMap.get(prevColor)==0) colourFreqMap.remove(prevColor);  // if color freq get zero please remove it

                ballsColouredMap.put(ball,color);  //color the ball with the new color
                colourFreqMap.put(color,colourFreqMap.getOrDefault(color,0)+1);
                ans[i]=colourFreqMap.size();
                i++;
            }


        }

        return ans;
    }

    public static void main(String[] args) {
        int limit=4;
        int[][] queries={{1,4},{2,5},{1,3},{3,4}};

        System.out.println(Arrays.toString(queryResults(limit,queries)));
    }
}
