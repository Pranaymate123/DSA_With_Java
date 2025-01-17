package Greedy;

import java.util.Arrays;
import java.util.Comparator;

class Meeting{
    int start,end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class NMeetings {
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        int maxCount=0;
        Meeting [] meetings=new Meeting[n];
        for(int i=0;i<n;i++)
        {
            meetings[i]=new Meeting(start[i],end[i]);
        }
        //sort
        Arrays.sort(meetings, Comparator.comparingInt(m->m.end));
        //
        maxCount=1;
        Meeting currMeeting = meetings[0];
        for(int i = 1;i<n;i++)
        {
            if(currMeeting.end <= meetings[i].start)
            {
                maxCount++;
                currMeeting=meetings[i];
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int [] start={1,3,0,5,8,5};
        int end[] =  {2,4,6,7,9,9};

        System.out.println(maxMeetings(start,end,6));
    }
}
