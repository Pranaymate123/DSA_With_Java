package Generics_In_Java;

import java.util.HashSet;
import java.util.Scanner;

public class LoveyElement {



        public static int lovelyElements(int N, int[] A, int K, int P) {

            int result = 0;

            // Convert the array to a HashSet for O(1) lookup
            HashSet<Integer> elementsSet = new HashSet<>();
            for (int num : A) {
                elementsSet.add(num);
            }

            // Check each element to see if it satisfies either condition
            for (int i = 0; i < N; i++) {
                int val1 = K - A[i];
                int val2 = P + A[i];

                if (elementsSet.contains(val1) || elementsSet.contains(val2)) {
                    result++;
                }
            }

            return result;

//            int result = 0;
//            HashSet<Integer> elementsSet = new HashSet<>();
//            HashSet<Integer> countedLovelyElements = new HashSet<>();
//
//            for (int num : A) {
//                elementsSet.add(num);
//            }
//
//            for (int i = 0; i < N; i++) {
//                int val1 = K - A[i];
//                int val2 = P + A[i];
//
//                if (!countedLovelyElements.contains(A[i]) &&
//                        ((elementsSet.contains(val1) && val1 != A[i]) ||
//                                (elementsSet.contains(val2) && val2 != A[i]))) {
//                    result++;
//                    countedLovelyElements.add(A[i]);
//                }
//            }
//
//            return result;
        }

        public static void main(String[] args) {
            int N = 5;
            int[] A = {1,2,3,4,5};
            int K = 10;
            int P = 20;
            System.out.println(lovelyElements(N, A, K, P));

        }

}
