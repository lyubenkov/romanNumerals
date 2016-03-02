package localhost.romanNumerals.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static List<String> splitRomansToGroups(String input) {
        List<String> romanGroups = new ArrayList<String>();
        byte index = 1;
        Pattern pattern = Pattern.compile("^(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                String group = matcher.group(i);
                if (!group.isEmpty()) {
                    romanGroups.add(matcher.group(i));
                }
            }
        }

        return romanGroups;
    }

}
