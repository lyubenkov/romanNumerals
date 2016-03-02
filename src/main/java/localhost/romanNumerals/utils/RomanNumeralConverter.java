package localhost.romanNumerals.utils;

import localhost.romanNumerals.maps.RomanNumeralsData;

import java.util.List;

/**
 * Created by sasha on 20/02/16.
 */
public class RomanNumeralConverter {

    public static Integer fromRoman(String inputString) {
        int result = 0;
        List<String> romansGroups = NumbersJuggler.splitRomansToGroups(inputString);

        for (String group : romansGroups) {
            result += computeNumberByRoman(group);
        }

        return result;
    }

    public static String toRomans(int number) {

        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Input data should be from 1 to 3333999");

        if (number != 0) {
            List<Integer> digits = NumbersJuggler.splitNumberToDigits(number);
            StringBuilder result = new StringBuilder();
            String romanNumber = null;
            byte rank = 0;

            for (int digit : digits) {
                if (digit != 0) {
                    romanNumber = computeRomanByDigitAndRank(digit, rank);
                    if (romanNumber == null) {
                        throw illegalArgumentException;
                    }
                    result.insert(0, romanNumber);
                }
                rank++;
            }

            return result.toString();
        }
        else {
            throw illegalArgumentException;
        }
    }

    public static String computeRomanByDigitAndRank(int digit, byte rank) {
        if (digit == 1) {
            return RomanNumeralsData.getRomanSymbols().get(rank * 2);
        }
        else if (digit == 2) {
            return new String(new char[2]).replace("\0", RomanNumeralsData.getRomanSymbols().get(rank * 2));
        }
        else if (digit == 3) {
            return new String(new char[3]).replace("\0", RomanNumeralsData.getRomanSymbols().get(rank * 2));
        }
        else if (digit == 4) {
            return RomanNumeralsData.getRomanSymbols().get(rank * 2) + RomanNumeralsData.getRomanSymbols().get(rank * 2 + 1);
        }
        else if (digit == 5) {
            return RomanNumeralsData.getRomanSymbols().get(rank * 2 + 1);
        }
        else if (digit == 6) {
            return RomanNumeralsData.getRomanSymbols().get(rank * 2 + 1) + RomanNumeralsData.getRomanSymbols().get(rank * 2);
        }
        else if (digit == 7) {
            return RomanNumeralsData.getRomanSymbols().get(rank * 2 + 1) + new String(new char[2]).replace("\0", RomanNumeralsData.getRomanSymbols().get(rank * 2));
        }
        else if (digit == 8) {
            return RomanNumeralsData.getRomanSymbols().get(rank * 2 + 1) + new String(new char[3]).replace("\0", RomanNumeralsData.getRomanSymbols().get(rank * 2));
        }
        else if (digit == 9) {
            return RomanNumeralsData.getRomanSymbols().get(rank * 2) + RomanNumeralsData.getRomanSymbols().get(rank * 2 + 2);
        }

        return null;
    }

    public static Integer computeNumberByRoman(String roman) {
        int number = 0;

        if (roman.length() == 1) {
            number = RomanNumeralsData.getRomanNumeralBiMap().inverse().get(String.valueOf(roman.charAt(0)));
        }
        else if (RomanNumeralsData.getRomanNumeralBiMap().inverse().get(String.valueOf(roman.charAt(0))) < RomanNumeralsData.getRomanNumeralBiMap().inverse().get(String.valueOf(roman.charAt(1))) ) {
            number = RomanNumeralsData.getRomanNumeralBiMap().inverse().get(String.valueOf(roman.charAt(1))) - RomanNumeralsData.getRomanNumeralBiMap().inverse().get(String.valueOf(roman.charAt(0)));
        }
        else {
            for (int i = 0; i <roman.length(); i++) {
                Integer test = RomanNumeralsData.getRomanNumeralBiMap().inverse().get(String.valueOf(roman.charAt(i)));
                number += RomanNumeralsData.getRomanNumeralBiMap().inverse().get(String.valueOf(roman.charAt(i)));
            }
        }

        return number;
    }

}
