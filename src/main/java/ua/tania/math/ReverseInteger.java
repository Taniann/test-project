package ua.tania.math;

import java.util.ArrayList;

public class ReverseInteger {

    public static int reverse(int x) {
        int result = 0;

        int sign = (x < 0) ? -1 : 1;
        x = x * sign;

        while (x > 0) {
            int remains = x % 10;

            int max = (Integer.MAX_VALUE - remains)/10;

            if (result > max)  {
                return 0;
            }

            result = result * 10 + remains;
            x = x / 10;
        }

        return sign * result;
    }

    public static void main(String[] args) {

        System.out.println(reverse(-654321));
    }
}
