package May;

import java.util.Arrays;

public class Boats_To_Save_People {

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int boats=0;
        int j=people.length-1;
        while (i<=j)
        {
            if(i==j)
            {
                boats++;
                return boats;

            }
            else if(people[i]+people[j] <= limit)
            {
                boats++;
                i++;
                j--;
            } else if (people[i]+people[j] > limit) {
                boats++;
                j--;
            }
        }
        return boats;
    }

    public static void main(String[] args) {
        int[] people={3,5,3,4};
        System.out.println(numRescueBoats(people,5));
    }
}
