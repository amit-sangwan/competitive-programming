package leetcode;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

        @Test
        public void testDriver(){
           System.out.println( romanToInt("LVIII"));
        }
        public int romanToInt(String s) {
                     // Create a map to store the values of Roman numerals
                    Map<Character, Integer> romanValues = new HashMap<>();
                    romanValues.put('I', 1);
                    romanValues.put('V', 5);
                    romanValues.put('X', 10);
                    romanValues.put('L', 50);
                    romanValues.put('C', 100);
                    romanValues.put('D', 500);
                    romanValues.put('M', 1000);

                    int result = 0;

                    // Iterate through the Roman numeral string
                    for (int i = 0; i < s.length(); i++) {
                        int currentValue = romanValues.get(s.charAt(i));

                        // If the current value is less than the next value, subtract it
                        if (i < s.length() - 1 && romanValues.get(s.charAt(i + 1)) > currentValue) {
                            result -= currentValue;
                        } else {
                            result += currentValue;
                        }
                    }

                    return result;
                }

    }
