package homeWork2;

public class Task2 {
    public static void main(String[] args) {

        class Sum1 {
            static int sum1(int n) {
                int result = 0;
                int sum = n % 10;
                if (n == 0) {
                    System.out.println(result);
                    return result;
                } else {
                    result = sum1(n / 10) % 10 + sum;
                    return result;
                }

            }
        }

        Sum1 sum1 = new Sum1();
        System.out.println(sum1.sum1(179));
    }
}



