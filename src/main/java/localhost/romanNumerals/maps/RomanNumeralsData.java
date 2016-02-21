package localhost.romanNumerals.maps;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by sasha on 20/02/16.
 */
public class RomanNumeralsData {

    private static final BiMap<Integer, String> romanNumeralBiMap;
    static {
        romanNumeralBiMap = HashBiMap.create();
        romanNumeralBiMap.put(1, "I");
        romanNumeralBiMap.put(2, "II");
        romanNumeralBiMap.put(3, "III");
        romanNumeralBiMap.put(4, "IV");
        romanNumeralBiMap.put(5, "V");
        romanNumeralBiMap.put(6, "VI");
        romanNumeralBiMap.put(7, "VII");
        romanNumeralBiMap.put(8, "VIII");
        romanNumeralBiMap.put(9, "IX");
        romanNumeralBiMap.put(10, "X");
        romanNumeralBiMap.put(20, "XX");
        romanNumeralBiMap.put(30, "XXX");
        romanNumeralBiMap.put(40, "XL");
        romanNumeralBiMap.put(50, "L");
        romanNumeralBiMap.put(60, "LX");
        romanNumeralBiMap.put(70, "LXX");
        romanNumeralBiMap.put(80, "LXXX");
        romanNumeralBiMap.put(90, "XC");
        romanNumeralBiMap.put(100, "C");
        romanNumeralBiMap.put(200, "CC");
        romanNumeralBiMap.put(300, "CCC");
        romanNumeralBiMap.put(400, "CD");
        romanNumeralBiMap.put(500, "D");
        romanNumeralBiMap.put(600, "DC");
        romanNumeralBiMap.put(700, "DCC");
        romanNumeralBiMap.put(800, "DCCC");
        romanNumeralBiMap.put(900, "CM");
        romanNumeralBiMap.put(1000, "M");
    }

    public static BiMap<Integer, String> getRomanNumeralBiMap() {
        return romanNumeralBiMap;
    }

}
