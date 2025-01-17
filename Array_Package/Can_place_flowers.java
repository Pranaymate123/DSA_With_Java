package Array_Package;

public class Can_place_flowers {

    public static boolean canPlaceFlowers(int[] arr, int n) {
       int total = 0;
       for(int i=0;i<arr.length && total <n ;i++)
       {
           if(arr[i]==0)
           {
               int next = (i==arr.length-1)? 0 : arr[i+1];
               int prev=(i==0)? 0 : arr[i-1];

               if(next==0 && prev ==0)
               {
                   arr[i]=1;
                   total++;
               }
           }
       }
       return total==n;
    }

    public static void main(String[] args) {
        int[] fb={0};
        System.out.println(canPlaceFlowers(fb,1));
    }
}
