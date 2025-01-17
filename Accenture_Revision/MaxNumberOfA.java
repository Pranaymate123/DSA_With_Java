package Accenture_Revision;

public class MaxNumberOfA {


    public static int getMaxNumberOfA(String str,int k)
    {
        int maxCount=0;
        int aCount=0;
        int i=0;
        int j=0;
        while (j<k)
        {
            if(str.charAt(j)=='a')
            {
                aCount++;
            }
            j++;
        }
       if(str.charAt(i)=='a') {
          aCount--;
       }
        i++;
        maxCount=aCount;

        while (j<str.length())
        {
            if(str.charAt(i)=='a')
            {
                aCount--;
            }
            if(str.charAt(j)=='a')
            {
                aCount++;
            }
//            System.out.println("-------");
            i++;
            j++;
            maxCount=Math.max(maxCount,aCount);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String str="acdbaaca";
        System.out.println(getMaxNumberOfA(str,3));
    }
}
