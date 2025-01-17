package March;

import java.util.Arrays;

public class D13_FindPivotIntegerElement {


    public static int pivotInteger(int n) {
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int left = 1;
        leftSum[0]=1;
        for (int i = 2; i <= n; i++) {
            leftSum[left] = leftSum[left-1]+i;
            left++;
        }

        int right = rightSum.length - 2;
        rightSum[n-1]=n;
        for (int i = n-1; i >= 1; i--) {
            rightSum[right] = rightSum[right+1]+i;
            right--;
        }

        System.out.println(Arrays.toString(leftSum));
        System.out.println(Arrays.toString(rightSum));

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }
}
