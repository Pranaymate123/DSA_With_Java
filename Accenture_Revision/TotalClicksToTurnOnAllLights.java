package Accenture_Revision;

public class TotalClicksToTurnOnAllLights {

   public static int getTotalNumberOfClicks(int[] arr)
   {
       int clicks=0;
       for(int s:arr)
       {
           int invertedS=clicks%2==0?s:((s==1)?0:1);

           if(invertedS==0)
           {
               clicks++;
           }
       }
       return clicks;
   }

    public static void main(String[] args) {
        int[] arr={0,1,0,0,1,0,0};

        System.out.println(getTotalNumberOfClicks(arr));
    }
}
