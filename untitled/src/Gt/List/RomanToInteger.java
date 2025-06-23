package Gt.List;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt (String s)
    {
        Map<Character,Integer>roman= new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int result=0;
        // duyet qua tung ket qua cua chuoi
        for (int i=0;i<s.length();i++)
        {
            int currentValue= roman.get(s.charAt(i));
            if(i<s.length()-1 && currentValue<roman.get(s.charAt(i+1)))
            {
                result-=currentValue;
            }
            else {
                result+=currentValue;
            }
        }
        // rea ve ket qua
        return result;
    }

    public static void main(String[] args) {

        RomanToInteger s= new RomanToInteger();
        String[] testCases = { "III", "IV", "IX", "LVIII", "MCMXCIV", "XL", "XC", "CD", "CM" };

        for (String roman : testCases) {
            int result = s.romanToInt(roman);
            System.out.println("Roman numeral: " + roman + " -> Integer: " + result);
        }
    }
}
