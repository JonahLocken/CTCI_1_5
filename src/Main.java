import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str1 = "string";
        String str2 = "stringy";

        System.out.println(checkIsOneAway(str1, str2));
    }

    public static boolean checkIsOneAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        int m = str1.length();
        int n = str2.length();
        int i = 0, j = 0;
        boolean foundDifference = false;

        while (i < m && j < n) {
            if (str1.charAt(i) != str2.charAt(j)) {
                if (foundDifference) {
                    return false;
                }

                foundDifference = true;

                if (m == n) {
                    i++;
                }
            } else {
                i++;
            }

            j++;
        }

        return true;
    }
}