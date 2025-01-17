package Backtracking_CodeStoryWithMik;

import Recursion.PermuationOptimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_The_Minimum_Cost_Array_Permutation {
    private int n;
    private int minSum = Integer.MAX_VALUE;
    private int[] result;

    private void solve(int[] nums, boolean[] visited, List<Integer> temp, int sum) {
        if (minSum <= sum) { // Prune branches where the sum is already higher than minSum
            return;
        }

        if (temp.size() == n) {
            sum += Math.abs(nums[temp.get(temp.size() - 1)] - nums[temp.get(0)]);
            if (sum < minSum) {
                minSum = sum;
                result = temp.stream().mapToInt(Integer::intValue).toArray();
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(i);

                int lastIndex = temp.size() - 1;
                int prevIndex = lastIndex > 0 ? temp.get(lastIndex - 1) : -1;
                int newSum = sum + (prevIndex >= 0 ? Math.abs(nums[prevIndex] - nums[i]) : 0);

                solve(nums, visited, temp, newSum);

                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }

    public int[] findPermutation(int[] nums) {
        n = nums.length;
        boolean[] visited = new boolean[n];
        List<Integer> temp = new ArrayList<>();
        temp.add(0); // Start with the lexicographically smallest index
        visited[0] = true;

        solve(nums, visited, temp, 0);
        return result;
    }

    public static void main(String[] args) {
        Find_The_Minimum_Cost_Array_Permutation obj=new Find_The_Minimum_Cost_Array_Permutation();
        int[] nums={1,0,2};
        System.out.println(Arrays.toString(obj.findPermutation(nums)));
    }
}
