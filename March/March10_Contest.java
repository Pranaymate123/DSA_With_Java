package March;

import Recursion.Array;

import java.util.Arrays;

public class March10_Contest {
    public static int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        //ascending
        //use reverse loop on capacity
        System.out.println(Arrays.toString(capacity));

        int flag=0;
        int j=capacity.length-1;
        int count=0;
        int sum=0;
        for(int i=0;i<apple.length;i++ )
        {
            sum+=apple[i];
        }
        while (sum>0 && j>=0)
        {
            if(sum>capacity[j])
            {
                sum-=capacity[j];
                j--;
                count++;
            } else if (sum<capacity[j]) {
                capacity[j]=capacity[j]-sum;
                sum=0;
                count++;
            }
            else
            {
                sum=0;
                j--;
                count++;
            }
        }
        return count;
    }

    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i=happiness.length-1;
        long maxHappiness=0;
        int minusCount=1;
        while (k>0 && i>=0)
        {
            maxHappiness+=happiness[i];
            i--;
            k--;
            if(i<0)
            {
                break;
            }
            if(  happiness[i]-minusCount >=0)
            {
                happiness[i]=happiness[i]-minusCount;
                minusCount++;
            }
            else {
                happiness[i]=0;
            }

        }
        return maxHappiness;
    }

    public static boolean isSubStringPresent(String [] arr,int i,String str)
    {
        boolean flag=false;
        for(int j=i;j<arr.length;j++)
        {
            if(arr[i].contains(str))
            {
                return true;
            }
        }
        return flag;
    }
    public static String[] shortestSubstrings(String[] arr) {
        int j=0,k=0;
        int flag=0;
        for(int i=0;i< arr.length;i++)
        {
            String substr="";
            while (k<arr[i].length())
            {
                if(isSubStringPresent(arr,i+1,arr[i].substring(j,k)))
                {
                    flag=1;
                    j++;
                }
                else
                {
                    flag=0;
                    substr=arr[i].substring(j,k);
                    arr[i]=substr;
                    break;
                }
            }
            if(flag==0)
            {
                arr[i]="";
            }


        }
        return arr;
    }

    public static void main(String[] args) {
//        int[] apple={5,5,5};
//        int [] capacity={2,4,2,7};
////        System.out.println(minimumBoxes(apple,capacity));
//        int [] happiness={12,1,42};
//        System.out.println(maximumHappinessSum(happiness,3));
        String name="Pranay";
        String [] arr={"cab","ad","bad","c"};
        System.out.println(Arrays.toString(shortestSubstrings(arr)));

    }
}
