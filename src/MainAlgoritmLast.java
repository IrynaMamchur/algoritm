import java.util.*;

public class MainAlgoritmLast {

    public static void main(String[] args) {
        List<AlgoritmLast> subjects = new ArrayList<>();
        AlgoritmLast subject = new AlgoritmLast(5, 30, "sub");
        AlgoritmLast subject1 = new AlgoritmLast(2, 14, "sub1");
        AlgoritmLast subject2 = new AlgoritmLast(3, 12, "sub2");
        AlgoritmLast subject3 = new AlgoritmLast(3, 15, "sub3");
        AlgoritmLast subject4 = new AlgoritmLast(2, 32, "sub4");
        subjects.add(subject);
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        subjects.add(subject4);
        System.out.println(subjects);


        Comparator<AlgoritmLast> algoritmLastComparator = new Comparator<AlgoritmLast>() {

            public int compare(AlgoritmLast o1, AlgoritmLast o2) {
                return o1.isValue() - o2.isValue();
            }
        };

        Collections.sort(subjects, algoritmLastComparator);

        System.out.println(subjects);

        int max = 10;
        int sum = 0;


        for (int i = subjects.size() - 1; i >= 0; i--) {
            if (sum <= max) {
                sum = sum + subjects.get(i).getWeight();
                if (sum <= max) {
                    System.out.print(subjects.get(i));
                } else if (sum > max) {
                    sum = sum - subjects.get(i).getWeight();
                }

            }
        }
    }
}



