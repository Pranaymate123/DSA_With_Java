package Dynamic_Programming;


public class Delete_And_Earn {

    public static int deleteAndEarn(int[] arr)
    {

        int max=getMaxElement(arr);
        int[] val=new int[max+1];
        for(int i:arr)
        {
            val[i]+=i;
        }
//        System.out.println(Arrays.toString(val));
        int pick=val[1];
        int notPick=0;
        for(int i=2;i<val.length;i++)
        {
            int newPick=notPick+val[i];
            int newNotPick=Math.max(pick,notPick);

            pick=newPick;
            notPick=newNotPick;
        }
        return Math.max(pick,notPick);
    }

    public static int getMaxElement(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }


        return max;
    }

    public static void main(String[] args) {
        int[] arr={2,3,3,3,4};
        System.out.println(deleteAndEarn(arr));
    }
}
