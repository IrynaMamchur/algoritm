package homeWork2;

public class Task3 {
    public static void main(String[] args) {


        class Fibbonachi {


            int printFib(int n, int i1, int i2) {
                int result;
                if (n == 2) {
                    System.out.print(i2 +", ");
                    return 0;
                }
                else {
                    result = printFib(n-1, i2,i2 + i1 );
                    System.out.print(i2 + ", ");
                    return result;
                }
            }
        }


        Fibbonachi fib = new Fibbonachi();
        System.out.println(fib.printFib(7, 0, 1));

    }
}
