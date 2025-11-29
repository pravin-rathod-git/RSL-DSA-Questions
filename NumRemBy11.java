public class NumRemBy11 {
    public static int Divisibility(int num) {

        int sumOdd = 0;
        int sumEven = 0;
        boolean isOdd = true;

        while (num > 0) {
            int digit = num % 10;

            if (isOdd)
                sumOdd += digit;
            else
                sumEven += digit;

            isOdd = !isOdd;
            num /= 10;
        }

        return Math.abs(sumOdd - sumEven);
    }

    public static void main(String[] args) {
        int num = 12345;
        int rem = Divisibility(num);

        System.out.println("Remainder when " + num + " is divided by 11 = " + rem);

        if (rem == 0)
            System.out.println("Divisible by 11");
        else
            System.out.println("Not divisible by 11");
    }
}
