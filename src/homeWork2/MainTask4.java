package homeWork2;

public class MainTask4 {

    public static void main(String[] args) {


        String strStr = "фывапаhыф";

        if (palind(strStr, 0, strStr.length() - 1)) {
            System.out.print("Палиндром");
        } else {
            System.out.print("Не палиндром");
        }
    }

    public static boolean palind(String strStr, int first, int end) {

        if (first >= end) {
            return true;
        }
        if (strStr.charAt(first) != strStr.charAt(end)) {
            return false;
        } else {
            return palind(strStr, first + 1, end - 1);
        }

    }
}
