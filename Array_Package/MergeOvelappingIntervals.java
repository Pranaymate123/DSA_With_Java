package Array_Package;

import java.util.*;

public class MergeOvelappingIntervals {

    public static int[][] mergeOverlappingIntervals(int[][] arr) {
        int n=arr.length;

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1) < arr[i][0])
            {
                //add new interval
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            }
            else {
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
            }

        }
        System.out.println(ans.size());

        int result[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
        {
            for(int j=0;j<2;j++)
            {
                result[i][j]=ans.get(i).get(j);
            }
        }
        return result;




//        int n = arr.length; // size of the array
//        //sort the given intervals:
//        Arrays.sort(arr, new Comparator<int[]>() {
//            public int compare(int[] a, int[] b) {
//                return a[0] - b[0];
//            }
//        });
//
//        List<List<Integer>> ans = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            // if the current interval does not
//            // lie in the last interval:
//            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
//                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
//            }
//            // if the current interval
//            // lies in the last interval:
//            else {
//                ans.get(ans.size() - 1).set(1,
//                        Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
//            }
//        }
//        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int [][] ans = mergeOverlappingIntervals(arr);
        System.out.print("The merged intervals are: \n");

       for(int i=0;i<ans.length;i++)
       {
           System.out.println(Arrays.toString(ans[i]));
       }
}
}
