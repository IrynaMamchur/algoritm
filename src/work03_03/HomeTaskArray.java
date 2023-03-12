package work03_03;

public class HomeTaskArray {
    private int[] array;
    private int count;
    private int size;

    //   //b. Рассмотрите задачу динамического увеличения массива.
    //        // Реализуйте функцию, которая принимает на вход массив и число элементов,
    //        // и возвращает новый массив, который содержит все элементы исходного массива
    //        // и заданное число новых элементов.
    public HomeTaskArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    public void add(int data) {

        if (count == size) {
            growSize();
        }
        array[count] = data;
        count++;
    }

    public void add1(int data, int amountNewNumbers) {

        for (int i = 0; i <= amountNewNumbers; i++) {
            array[count] = data;
            count++;
            if (count == size) {
                growSize();
            }
        }
    }


    public void growSize() {
        int[] temp = new int[0];
        if (count == size) {
            temp = new int[size * 2];
            {
                for (int i = 0; i < size; i++) {
                    temp[i] = array[i];
                }
            }
        }
        array = temp;
        size = size * 2;
    }


    public static void main(String[] args) {

        HomeTaskArray da = new HomeTaskArray();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);

        da.add1(10, 21);


        System.out.println("Elements of array:");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }
    }
}

