package June;

import java.util.Arrays;

public class D13_MIN_MOVES_TO_SIT_EVERY_ONE {
    public static int minMovesToSeat(int[] seats, int[] students) {

        Arrays.sort(seats);
        Arrays.sort(students);
        int total=0;
        for(int i=0;i<seats.length;i++)
        {
            total+=Math.abs(seats[i]-students[i]);
        }
        return total;
    }

    public static void main(String[] args) {
        int [] seats={4,1,5,9};
        int [] students={1,3,2,6};

        System.out.println(minMovesToSeat(seats,students));
    }
}
