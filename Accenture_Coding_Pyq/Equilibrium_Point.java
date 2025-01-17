package Accenture_Coding_Pyq;

public class Equilibrium_Point {

    public static int getEquilibriumPoint(int[] arr)
    {
        int rSum=0;
        int[] leftSum=new int[arr.length];
        int[] rightSum=new int[arr.length];
        leftSum[0]=arr[0];
        rightSum[0]=arr[arr.length-1];
        int j=arr.length-2;
        for(int i=1;i<arr.length;i++)
        {
            leftSum[i]=leftSum[i-1]+arr[i];
            rightSum[j]=rightSum[j+1]+arr[j];
            j--;
        }
        for(int i=0;i< arr.length;i++)
        {
            if(leftSum[i]==rightSum[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={-7,1,5,2,-4,3,0};
        System.out.println(getEquilibriumPoint(arr));
    }
}
