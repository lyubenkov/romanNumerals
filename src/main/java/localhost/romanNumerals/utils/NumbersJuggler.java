package localhost.romanNumerals.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasha on 20/02/16.
 */
public class NumbersJuggler {
    public static List<Integer> splitNumberToDigits(Integer number) {
        ArrayList<Integer> digits = new ArrayList<Integer>();

        while (number != 0) {
            digits.add(number % 10);
            number = number / 10;
        }

        return digits;
    }

}
