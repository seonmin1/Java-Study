package exam01;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList 실습
 */
public class Ex04 {
    public static void main(String[] args) {
        List<String> items = new LinkedList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");

        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i);
            System.out.println(item);
        }
    }
}
