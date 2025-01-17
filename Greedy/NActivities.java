package Greedy;

import Recursion.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Activity {
    int start, end;

    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class NActivities {

    public static int activitySelection(int start[], int end[], int n)
    {
        Activity[] activities = new Activity[n];
        for (int i = 0; i < n; i++) {
            activities[i] = new Activity(start[i], end[i]);
        }
        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));
        int count = 1;
        Activity currentActivity = activities[0];

        for (int i = 1; i < n; i++) {
            if (activities[i].start > currentActivity.end) {
                count++;
                currentActivity = activities[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
