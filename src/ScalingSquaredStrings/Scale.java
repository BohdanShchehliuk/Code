package ScalingSquaredStrings;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Scale {
    public static String scale(String string, int k, int v) {
        if (string == "") {
            return string;
        } else {
            string = string + "\n";
            int number;
            number = (int) string.chars().count();
            //System.out.println(number);
            char[] array = new char[number + 1];
            int numberOfLine = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '\n') {
                    numberOfLine = numberOfLine++;
                }
            }
            array = string.toCharArray();
            //System.out.println(Arrays.toString(array));
            String string1 = "";
            String string2 = "";

            for (int i = 0; i < array.length; i++) {
                String string3 = "";
                    if (array[i] != '\n') {
                    for (int j = 0; j < k; j++) {
                        string3 = string3 + array[i];
                    }
                    string2 =  string2+string3;

                } else {
                    string2 = string2 + array[i];
                    for (int z = 0; z < v; z++) {
                        string1= string1 + string2;
                    }
                    string2 = "";
                }
            }
            int numberNew = (int) string1.chars().count();
           // System.out.println(numberNew);
            char[] arrayNew = new char[numberNew];
            arrayNew = string1.toCharArray();
       //     System.out.println(Arrays.toString(arrayNew));
            char [] arrayAdd = new  char [numberNew-1];
            System.arraycopy(arrayNew, 0, arrayAdd, 0, (numberNew-1));
           // System.out.println(Arrays.toString(arrayAdd));
            String stringfinal = new String(arrayAdd);
            //System.out.println(string3);
            return stringfinal;
        }
    }
    public static void main(String[] args) {
        System.out.println(scale("abc\nefg", 3, 4));
        //System.out.println(scale("", 3, 2));
    }
}
