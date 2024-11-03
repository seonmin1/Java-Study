package exam01;

import java.util.Stack;

/**
 * Stack 구조 실습
 */
public class Ex05 {
    public static void main(String[] args) {
        Stack<String> items = new Stack<>();
        items.push("항목1");
        items.push("항목2");
        items.push("항목3");
        items.push("항목4");
        items.push("항목5");

        while(items.size() > 0) {
            String item = items.pop();
            System.out.println(item);
        }
    }
}
