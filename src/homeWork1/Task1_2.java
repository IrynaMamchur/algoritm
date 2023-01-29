package homeWork1;

public class Task1_2 {
    public static void main(String[] args) {

        int[] arr = {3, 6, 4, 7, 2, 1, 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] * arr[i] + sum;
        }
        System.out.println("Сумма квадратов всех элементов массива равна " + sum);

    }
}
