package Array_Package;

public class D04_ArrayPracticeMain {

    //Largest Elements in the array
    public static int getlargest(int arr[])
    {
        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }

        }
        return largest;
    }
    //second largest elements in the array
    public static int secondlargest(int arr[])
    {
        int largest=arr[0];
        int slargest=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                slargest=largest;
                largest=arr[i];
                continue;
            }
            if(arr[i]>slargest && arr[i]!=largest)
            {
                slargest=arr[i];
            }

        }
        return slargest;
    }
    public  static int  secondsmallest(int arr[])
    {

        int sSmall=arr[0];
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                sSmall=smallest;
                smallest=arr[i];
                continue;
            }
            if(arr[i]<sSmall && arr[i]!=smallest)
            {
                sSmall=arr[i];
            }
        }
            return sSmall;
    }
    public  static  void checkSorted(int arr[])
    {
        int flag=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
               flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Array Is Not Sorted ");
        }
        else
        {
            System.out.println("Array Is Sorted ");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
//        int largest=getlargest(arr);
//        System.out.println("Largest Element is "+largest);
//        int slargest=secondlargest(arr);
//        System.out.println("The second largest element is "+slargest);
//        int sSmall=secondsmallest(arr);
//        System.out.println("The second Smallest element is "+sSmall);

        checkSorted(arr);


    }

}
