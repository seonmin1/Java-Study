package exam02;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet 실습
 */
public class Ex01 {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>();
        items.add("항목5");
        items.add("항목2");
        items.add("항목3");
        items.add("항목1");
        items.add("항목1");
        items.add("항목1");
        items.add("항목4");

        System.out.println(items);
    }
}
