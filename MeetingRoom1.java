import java.util.Arrays;

public class MeetingRoom1 {

    public static boolean canAttendMeetings(int[][] meetings) {
        // sort by start time
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < meetings.length; i++) {
            // if current meeting starts before previous one ends -> overlap
            if (meetings[i][0] < meetings[i - 1][1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] meetings = {
                {1, 3},
                {3, 5},
                {2, 4}
        };

        System.out.println(canAttendMeetings(meetings));
    }
}
