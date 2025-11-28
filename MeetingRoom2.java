import java.util.Arrays;

public class MeetingRoom2 {

    public static int minMeetingRooms(int[][] meetings) {
        int n = meetings.length;

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = meetings[i][0];
            end[i] = meetings[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0, maxRooms = 0;
        int i = 0, j = 0;

        // two-pointer approach
        while (i < n) {
            if (start[i] < end[j]) {
                rooms++;      // need a room
                maxRooms = Math.max(maxRooms, rooms);
                i++;
            } else {
                rooms--;      // room freed
                j++;
            }
        }

        return maxRooms;
    }

    public static void main(String[] args) {
        int[][] meetings = {
                {1, 3},
                {3, 5},
                {2, 4}
        };
        
        System.out.println(minMeetingRooms(meetings));
    }
}
