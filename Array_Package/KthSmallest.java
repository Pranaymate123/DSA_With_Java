package Array_Package;

import java.util.Arrays;

public class KthSmallest {

    // We can  do this using the Max Heap In optimal way check Heap vala folder for that
    public static int getKthSmallest(int arr[],int k)
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[k-1];
    }
    public static void main(String[] args) {
        int arr[]={ 7,10, 4 ,3, 20, 15};
        System.out.println(getKthSmallest(arr,3));
    }
}
