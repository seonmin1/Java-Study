package exam01;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue 구조 실습
 */
public class Ex06 {
    public static void main(String[] args) {
        Queue<String> items = new LinkedList<>();
        items.offer("항목1");
        items.offer("항목2");
        items.offer("항목3");
        items.offer("항목4");
        items.offer("항목5");

        while(items.size() > 0) {
            String item = items.poll();
            System.out.println(item);
        }
    }
}
