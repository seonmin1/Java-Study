package exam01;

import java.util.Vector;

/**
 * 배열 공간 갯수 확인 실습
 */
public class Ex03 {
    public static void main(String[] args) {
        Vector<String> items = new Vector<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        System.out.println(items.capacity());

        items.add("항목6");
        items.add("항목7");
        items.add("항목8");
        items.add("항목9");
        items.add("항목10");
        items.add("항목11");

        System.out.println(items.capacity());
    }
}
