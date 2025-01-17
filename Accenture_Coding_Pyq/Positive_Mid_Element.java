package Accenture_Coding_Pyq;

public class Positive_Mid_Element {

    public static int getPositiveMidElement(int[] arr)
    {
        int size=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0) size++;
        }
        int mid=(size+1)/2;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                mid--;
                if(mid==0) return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={-12,-3,14,-56,-77,-13};
        System.out.println(getPositiveMidElement(arr));
    }
}
