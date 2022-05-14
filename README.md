# Project_B26

package day00_GroupClass;

public class FindTheUnique {

    public static void main(String[] args) {

        System.out.println(uniqueChar2("AAABBBCCDEFFMTTTTOPPPPPPN"));
        System.out.println(uniqueChar2("PUBLIC STATIC VOID MAIN"));
    }

    public static String uniqueChar2(String word) {

        String uniqueChar2 = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {
                uniqueChar2 += word.charAt(i);
            }
        }
        return uniqueChar2;
    }
}
