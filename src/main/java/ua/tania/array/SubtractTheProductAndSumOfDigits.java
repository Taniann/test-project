package ua.tania.array;

public class SubtractTheProductAndSumOfDigits {

    private static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int currentDigit = n % 10;
            n = n / 10;
            sum += currentDigit;
            product *= currentDigit;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }

}
