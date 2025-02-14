package Recursion.CodeStoryWithMik;

public class BinarySearch {


    public static int binarySearch(int arr[],int start,int end,int key){
        int mid=(start+end)/2;
        if(start>=end){
            if(arr[mid]==key){
                return mid;
            }
            return -1;
        }
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key) {
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        return binarySearch(arr,start,end,key);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,0,arr.length-1,9));
    }
}
