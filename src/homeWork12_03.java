import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class homeWork12_03 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        boolean answer = true;
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');


        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (map.containsValue(symbol)) {
                stack.push(symbol);
            }

            if (map.containsKey(symbol)) {
                if ((stack.empty()) || (stack.pop() != map.get(symbol))) {
                    answer = false;
                }
            }
        }

        if (!stack.empty()) {
            answer = false;
        }

        System.out.println(answer);
    }
}
