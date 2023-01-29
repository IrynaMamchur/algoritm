package homeWork1;

public class Task1_1 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 7, 2, 1, 9};
        int num = 6;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                System.out.println("Индекс числа " + num + " составляет " + i);
            }
        }
        if (index == 0) {
            System.out.println(" В заданном массиве отсутствует число " + num);
        }

    }
}
