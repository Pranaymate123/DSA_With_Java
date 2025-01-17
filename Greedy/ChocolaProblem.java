package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {

    public static int minimumCostOfBreaking(int[] X, int[] Y,int m,int n) {

        Integer[] costHor =new Integer[X.length];
        for(int i=0;i<X.length;i++)
        {
            costHor[i]=X[i];
        }
        Integer[] costVer =new Integer[Y.length];
        for(int i=0;i<Y.length;i++)
        {
            costVer[i]=Y[i];
        }


        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<costHor.length && v<costVer.length )
        {
            if(costVer[v]<= costHor[h])
            {
                //horizontal cut
                cost+=(costHor[h] * vp);
                hp++;
                h++;
            }
            else {
                //vertivcal cut
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
            System.out.println("Pass Cost "+ cost);

        }
        while (h<costHor.length)
        {
            //horizontal cut
            cost+=(costHor[h] * vp);
            hp++;
            h++;
        }
        while (v<costVer.length)
        {
            //vertivcal cut
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }
        return cost;
    }

    public static void main(String[] args) {
        int [] X={2, 1, 3, 1, 4};
        int [] Y={4, 1, 2};
        System.out.println(minimumCostOfBreaking(X,Y,X.length,Y.length));
    }
}
