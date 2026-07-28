package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class Longest_SubString_Without_Repeating_Characters {

    public static int lengthOfLongestSubstring(String s) {


        char[] arr = s.toCharArray();
        int i=0,j=0;
        int n = s.length();
        int maxAns=0;
            Set<Character> set = new HashSet<>();
        int ans=0;
        while (j<n)
        {
            if(!set.contains(arr[j]))
            {
                set.add(arr[j]);
                j++;
                ans++;

                maxAns=Math.max(maxAns,ans);

            }
            else{
                //Searching for repeated char by removing chars from left end
                //as ssonn as we remove the repeated one we are eligible to execute the above if block
               set.remove(arr[i]);
                i++;
                ans--;
            }
        }
        return maxAns;
    }

    public static void main(String[] args) {
        String str ="aabaab!bb";

        System.out.println(lengthOfLongestSubstring(str));
    }
}
