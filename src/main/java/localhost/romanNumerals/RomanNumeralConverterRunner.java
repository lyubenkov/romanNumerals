package localhost.romanNumerals;

import localhost.romanNumerals.configuration.Config;
import localhost.romanNumerals.utils.DataGetter;
import localhost.romanNumerals.utils.RomanNumeralConverter;

import java.util.List;

/**
 * Created by sasha on 21/02/16.
 */
public class RomanNumeralConverterRunner {
    public static void run() {
        String romans = RomanNumeralConverter.toRomans(DataGetter.getInput("number", Config.getDefaultInputNumber()));
        Integer number = RomanNumeralConverter.fromRoman(DataGetter.getInput("string", Config.getDefaultInputString()));
        System.out.println("The result of method toRomans is: " + romans);
        System.out.println("The result of method fromRoman is: " + number);
    }
}
