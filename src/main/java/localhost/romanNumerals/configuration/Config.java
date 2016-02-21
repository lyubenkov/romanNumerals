package localhost.romanNumerals.configuration;

/**
 * Created by sasha on 20/02/16.
 */
public class Config {
    private static int defaultInputNumber = 345;
    private static String defaultInputString = "CCCXLV";

    public static int getDefaultInputNumber() {
        return defaultInputNumber;
    }
    public static String getDefaultInputString() {
        return defaultInputString;
    }
}
