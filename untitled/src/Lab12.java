import org.w3c.dom.ranges.RangeException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab12 {
    public static void main(String[] args) {
        String strTest = "Regex 15-05-2020, Nguyen Minh Duc 16/02/1998. Deadline 18_02_2020";
        Pattern patternDate = Pattern.compile("\\d{2}[-|/]\\d{2}[-|/]\\d{4}");
        Matcher matcher = patternDate.matcher(strTest);
        System.out.println(matcher.matches());
    }
}
