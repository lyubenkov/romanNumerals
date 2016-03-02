package localhost.romanNumerals.maps;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasha on 20/02/16.
 */
public class RomanNumeralsData {

    private static final BiMap<Integer, String> romanNumeralBiMap;
    private static final List<String> romanSymbols;

    static {
        romanSymbols = new ArrayList<String>();
        romanSymbols.add("I");
        romanSymbols.add("V");
        romanSymbols.add("X");
        romanSymbols.add("L");
        romanSymbols.add("C");
        romanSymbols.add("D");
        romanSymbols.add("M");

        romanNumeralBiMap = HashBiMap.create();
        romanNumeralBiMap.put(1, "I");
        romanNumeralBiMap.put(5, "V");
        romanNumeralBiMap.put(10, "X");
        romanNumeralBiMap.put(50, "L");
        romanNumeralBiMap.put(100, "C");
        romanNumeralBiMap.put(500, "D");
        romanNumeralBiMap.put(1000, "M");
    }

    public static List<String> getRomanSymbols() {
        return romanSymbols;
    }
    public static BiMap<Integer, String> getRomanNumeralBiMap() {
        return romanNumeralBiMap;
    }

}

