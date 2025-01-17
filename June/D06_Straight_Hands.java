package June;

import java.util.Arrays;
import java.util.HashMap;

public class D06_Straight_Hands {

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length < groupSize) return false;

        HashMap<Integer,Integer> map=new HashMap<>();
        int n=hand.length;
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(hand[i]))
            {
                map.put(hand[i],1);
            }
            else
            {
                map.put(hand[i],map.get(hand[i])+1);
            }
        }

        Arrays.sort(hand);
        int count=0;
        System.out.println(Arrays.toString(hand));
        //cheking for groupa
        for(int i=0;i<n;i++)
        {

            count=0;
            if(map.get(hand[i])>0)
            {
                map.put(hand[i],map.get(hand[i])-1);
                int num=hand[i];
               count++;

                for(int j=0;j<groupSize-1;j++)
                {
                    if(map.containsKey(num+1) && map.get(num+1) > 0)
                    {
                        map.put(num+1,map.get(num+1)-1);
                        count++;
                        num=num+1;
                    }
                }
                if(count<groupSize) return false;
            }

        }
        return  true;
    }

    public static void main(String[] args) {
        int[] hand={8,10,12};
        int groupSize=3;

        System.out.println(isNStraightHand(hand,groupSize));
    }
}
