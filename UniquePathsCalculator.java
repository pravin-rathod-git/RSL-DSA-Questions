public class UniquePathsCalculator {

    public static int uniquePaths(int m, int n) {
        int totalMoves = m + n - 2;
        int r = Math.min(m - 1, n - 1);  // choose smaller for efficiency
        long res = 1;

        for (int i = 1; i <= r; i++) {
            res = res * (totalMoves - r + i) / i;
        }

        return (int) res;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        int result = uniquePaths(m, n);
        System.out.println("Number of unique paths for grid " + m + "x" + n + " : " + result);
    }
}
