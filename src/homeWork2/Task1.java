package homeWork2;

public class Task1 {
    public static void main(String[] args) {


        class Number {
            double numb(double i) {
                double result;
                if (i == 1) {
                    System.out.println("Yes");
                    return 1;
                }
                if (i < 1) {
                    System.out.println("No");
                    return 0;
                } else {
                    result = numb(i / 2);
                    return result;
                }
            }
        }


        Number number = new Number();
        System.out.println(number.numb(3));

    }
}

