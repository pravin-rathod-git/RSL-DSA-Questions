public class MInNum5and2 {
     public static int MinCoins(int amt) {
        // Edge cases where making amount with 5 and 2 is impossible
        if (amt == 1 || amt == 3) return -1;

        int fiveCoins = amt / 5;   // try to use maximum 5 coins first
        int rem = amt % 5;

        // Case 1: remainder is divisible by 2
        if (rem % 2 == 0) {
            return fiveCoins + (rem / 2);
        }

        // Case 2: remainder is odd → reduce one 5-coin and try again
        while (fiveCoins >= 0) {
            int newAmt = amt - (fiveCoins * 5);
            if (newAmt % 2 == 0) {
                return fiveCoins + (newAmt / 2);
            }
            fiveCoins--; // try with fewer 5 coins
        }

        return -1;
    }

    public static void main(String[] args) {
        int amt1 = 7;
        int amt2 = 11;
        int amt3 = 1;

        System.out.println("Min coins for 7 = " + MinCoins(amt1));   // 2 (5+2)
        System.out.println("Min coins for 11 = " + MinCoins(amt2)); // 3 (5+5+1×2)
        System.out.println("Min coins for 1 = " + MinCoins(amt3));  // -1 (not possible)
    }
}
