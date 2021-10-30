package Lesson11_2;

public class TextFormater {
    public static int words(String string) {
        int count = 0;
        String[] arrayw = string.split(" ");
        for (String word : arrayw) {
            count++;
        }
        return count;
    }

    public static boolean check(String s) {
        String[] arrayc = s.split(" ");
        for (int i = 0; i < arrayc.length; i++) {
            StringBuilder builder = new StringBuilder(arrayc[i]);
            if (builder.reverse().toString().equals(arrayc[i])) {
                return true;
            }
        }
        return false;
    }
}
