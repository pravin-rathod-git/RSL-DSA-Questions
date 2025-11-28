public class EquilibriumIndex {

    public static int Equilibrium(int arr[]) {
        int n = arr.length;
        int totalSum = 0;
        int prefix = 0;

        // Step 1: Calculate total sum
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Step 2: Find equilibrium index
        for (int i = 0; i < n; i++) {
            int suffixSum = totalSum - prefix - arr[i];

            if (suffixSum == prefix) {
                return i;  // equilibrium index found
            }

            prefix += arr[i];
        }

        return -1; // no equilibrium index
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 2, 2};

        int equilibriumIndex = Equilibrium(arr);

        if (equilibriumIndex != -1)
            System.out.println("Equilibrium Index: " + equilibriumIndex);
        else
            System.out.println("No Equilibrium Index found!");
    }
}
