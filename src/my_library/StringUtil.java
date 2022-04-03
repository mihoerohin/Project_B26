package my_library;

import day00_my_school.ShoppingReceipt;

import java.util.Arrays;
import java.util.Locale;

public class StringUtil {

                      //     REVERSE   //


    public static String revers(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }
        return reversed;
    }

                    //    FIX FORMAT  //

        public static String fixFormat(String str) {
            str = str.trim();
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase(Locale.ROOT);


    }                   // count char //

    public static int frequencyOfCharacter(String str, char letter){

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }
        return count;

    }

                 // looking for  alone char //

    public static String  uniqueCharacters(String str) {

        String unique = "";
        String check = "";

        for (int i = 0; i < str.length(); i++) {

            if (check.contains("" + str.charAt(i))) {
                continue;
            }

            int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));

            if (count == 1) {
                unique += str.charAt(i);

            }
        }
        return unique;

    }
}

