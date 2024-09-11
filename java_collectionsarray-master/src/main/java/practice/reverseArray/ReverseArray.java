package practice.reverseArray;

import java.util.Arrays;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        String[] reverseArr = new String[strings.length];
        for (int i = 1; i <= strings.length; i++) {
            reverseArr[i - 1] = strings[reverseArr.length - i];
        }
        for (int i = 1; i <= strings.length; i++) {
            strings[i - 1] = reverseArr[i - 1];
        }

        return strings;
    }
}