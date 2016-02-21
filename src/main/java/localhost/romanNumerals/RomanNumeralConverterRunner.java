package localhost.romanNumerals;

import localhost.romanNumerals.configuration.Config;
import localhost.romanNumerals.utils.DataGetter;
import localhost.romanNumerals.utils.RomanNumeralConverter;

/**
 * Created by sasha on 21/02/16.
 */
public class RomanNumeralConverterRunner {
    public static void run() {
        String romans = RomanNumeralConverter.toRomans(DataGetter.getInput("number", Config.getDefaultInputNumber()));
        int number = RomanNumeralConverter.fromRomans(DataGetter.getInput("string", Config.getDefaultInputString()));
        System.out.println("The result of method toRomans is: " + romans);
        System.out.println("The result of method fromRomans is: " + number);
    }
}
