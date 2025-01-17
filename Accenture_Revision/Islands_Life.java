package Accenture_Revision;

import java.util.Arrays;

public class Islands_Life {

    public static int getMinimumNumberOfBoxesToPurchase(int N,int E,int D)
    {
        //Edge Cases
        if(N==0) return -1;
        if(E==0 || D==0) return 0;
        if(6*N < 7*E) return -1;
        if(D<7) return (D*E)/N==0?(D*E)/N:((D*E)/N)+1;

        int countBoxes=0;

        int completeWeeks=D/7;

        int weekReq=7*completeWeeks*E;

        countBoxes=countBoxes+weekReq%N==0?weekReq/N:(weekReq/N)+1;
        System.out.println(countBoxes +" Boxes for weeks");
        int leftSweets =(countBoxes*N)-(weekReq);
        System.out.println("Left Sweets "+leftSweets);
        int noOfDays=D%7;
        System.out.println("No of extra days "+noOfDays);
        int reqDays=noOfDays*E-leftSweets;
        System.out.println("Requirement of days "+reqDays);
        if(reqDays>0)
        {
            System.out.println("Before CountBoxes "+ countBoxes);
            countBoxes=countBoxes+(reqDays%N==0?(reqDays/N):(reqDays/N)+1);
            System.out.println("After CountBoxes "+ countBoxes);

        }
        return countBoxes;
    }

    public static void main(String[] args) {
     System.out.println(getMinimumNumberOfBoxesToPurchase(1,10,2));


    }
}
