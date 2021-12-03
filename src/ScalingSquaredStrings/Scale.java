package ScalingSquaredStrings;

import java.util.Arrays;
import java.util.stream.IntStream;
public class Scale {
    public static String scale(String string, int k, int v) {
        if (string == "") {
            return string;
        } else {
            int number;
            number = (int) string.chars().count();
            //System.out.println(number);
            char[] array = new char[number];
            array = string.toCharArray();
            // System.out.println(Arrays.toString(array));
            char[] arrayNew = new char[array.length * k];
            for (int i = 0; i < array.length; i++) {
                for (int j = i * k; j < (i + 1) * k; j++)
                    arrayNew[j] = array[i];
            }
            //System.out.println(Arrays.toString(arrayNew));
            String string1 = new String(arrayNew);
            //System.out.println(string1);
            String string2 = "";
            for (int i = 0; i < v; i++) {
                string2 = string2 + string1 + "\n";
            }
            return string2;
        }
    }
    public static void main(String[] args) {
        System.out.println(scale("abc", 6, 4));
        System.out.println(scale("", 3, 2));
    }
}
