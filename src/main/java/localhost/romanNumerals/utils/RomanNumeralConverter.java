package localhost.romanNumerals.utils;

import localhost.romanNumerals.maps.RomanNumeralsData;

import java.util.List;

/**
 * Created by sasha on 20/02/16.
 */
public class RomanNumeralConverter {

    public static int fromRomans(String inputString) {

        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Incorrect input data");

        if (inputString != null && !inputString.isEmpty()) {
            int index = 0;
            int number = 0;

            for (int i = 0; i < inputString.length(); i++) {

                if (RomanNumeralsData.getRomanNumeralBiMap().inverse().get(inputString.substring(index, i + 1)) != null) {
                    if (i + 1 < inputString.length()) {
                        continue;
                    }
                    else {
                        number += RomanNumeralsData.getRomanNumeralBiMap().inverse().get(inputString.substring(index, i + 1));
                    }
                }
                else if (RomanNumeralsData.getRomanNumeralBiMap().inverse().get(inputString.substring(index, i + 1)) == null &&
                        index != i){
                    number += RomanNumeralsData.getRomanNumeralBiMap().inverse().get(inputString.substring(index, i));
                    index = i;
                    i--;

                }
                else {
                    throw illegalArgumentException;
                }
            }

            return number;
        }
        else {
            throw illegalArgumentException;
        }



    }

    public static String toRomans(int number) {

        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Input data should be from 1 to 1999");

        if (number != 0) {
            List<Integer> digits = NumbersJuggler.splitNumberToDigits(number);
            StringBuilder result = new StringBuilder();
            String romanNumber = null;
            int index = 0;

            for (int digit : digits) {
                if (digit != 0) {
                    romanNumber = RomanNumeralsData.getRomanNumeralBiMap().get((int) Math.pow(10, index) * digit);
                    if (romanNumber == null) {
                        throw illegalArgumentException;
                    }
                    result.insert(0, romanNumber);
                    index++;
                }
            }

            return result.toString();
        }
        else {
            throw illegalArgumentException;
        }
    }

}
