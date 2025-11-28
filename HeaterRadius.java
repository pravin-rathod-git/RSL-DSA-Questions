import java.util.Arrays;

public class HeaterRadius {

    public static int MinRadius(int houses[], int heater[]) {

        Arrays.sort(houses);
        Arrays.sort(heater);

        int radius = 0;
        int h = heater.length;
        int j = 0;

        for (int i = 0; i < houses.length; i++) {

            // move heater pointer to closer heater
            while (j < h - 1 &&
                   Math.abs(houses[i] - heater[j]) >= 
                   Math.abs(houses[i] - heater[j + 1])) {
                j++;
            }

            // distance to closest heater
            int dist = Math.abs(houses[i] - heater[j]);
            radius = Math.max(radius, dist);
        }

        return radius;
    }

    public static void main(String[] args) {
        int houses[] = {1, 5, 7};
        int heaters[] = {2, 7};
        System.out.println(MinRadius(houses, heaters));  // Output: 3
    }
}
