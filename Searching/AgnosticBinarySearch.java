package Searching;

public class AgnosticBinarySearch {
    public static void main(String[] args) {

//        int arr1[]={10,20,30,40,50,60,70,80,90,100};
        int target=90;
        int arr2[]={100,90,80,70,60,50,40,30,20,10};
//        int index=search(arr1,target);
        int index1=search(arr2,target);
//        System.out.println(index);
        System.out.println(index1);
        

//        int arr3[]={2,3,5,9,14,16,17,18,19};
//        int t=15;
//        int c=floor(arr3,t);
//        System.out.println(c);
//        System.out.println('a' > 'b');
    }
    public static int floor(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid=0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return arr[end];
    }

    public static int celing(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid=0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return arr[start];
    }




    public static int search(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end) {
            mid = start + (end - start) / 2;
            boolean isAsc = arr[start] < arr[end];
            if (arr[mid] == target) {
                return mid;
            } else {
                if (isAsc) {
                    if (target > arr[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                } else {
                    if (target < arr[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }

                }
            }
        }
        return -1;
    }

}
