import java.util.Arrays;

public class Algor25_03 {
    public static void main(String[] args) {
        //Рассчитайте Big (O) задачи про составление наибольшего числа из чисел в массиве.
        //Придумайте пример из повседневной жизни, где бы был применим жадный алгоритм.

     //   Big(O) = n^2
        int[] arr = {2, 7, 9, 9, 3};

        System.out.println(Arrays.toString(sortArray(arr)));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static int[] sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[0];
            int minIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int swapVal = arr[arr.length-i -1];
            arr[arr.length-i -1] = arr[minIndex];
            arr[minIndex] = swapVal;
        }
        return arr;
    }
}

