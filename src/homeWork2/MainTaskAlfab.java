package homeWork2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class MainTaskAlfab {
    public static void main(String[] args) {


//Решите задачу: Расставьте в алфавитном порядке буквы. Разрешается использование техники Разделяй и властвуй. Полученные данные напечатайте.
// На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
//На выходе должно быть: ABCDEFGHIJKLMNOPQRSTUVWXYZ (с большой буквы)

        //Надеюсь, что здесь есть "разделяй и властвуй".
//        1. Первая задача - перевести строку в массив из букв
//        2.  - перевести буквы в числа
//        3. создать метод сортировки (надеюсь, можно было без рекурсии)
//        4. отсортировать
//            5. перевести обратно в буквы и распечатать

        String str = "poiuytrewqlkjhgfdsamnbvcxz";

        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(chars));
        int[] arr = new int[26];
        for (int i = 0; i < chars.length; i++) {
            char a = chars[i];
            int j = a;
            arr[i] = j;
        }

        System.out.println(Arrays.toString(sortArray(arr)));

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            char b = (char) a;
            System.out.print(Character.toUpperCase(b));
        }
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0];
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int swapVal = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[maxIndex];
            arr[maxIndex] = swapVal;
        }
        return arr;
    }

}





