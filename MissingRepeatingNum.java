public class MissingRepeatingNum {
    public static int[] MPnum(int[] arr){
        int n = arr.length;
        int[] freq = new int[n+1];

        int repeating = -1;
        int missing = -1;

        // Count frequency
        for(int num : arr){
            freq[num]++;
        }

        // Find missing and repeating
        for(int i = 1; i <= n; i++){
            if(freq[i] == 0) missing = i;
            else if(freq[i] == 2) repeating = i;
        }

        return new int[]{missing, repeating};
    }
}
