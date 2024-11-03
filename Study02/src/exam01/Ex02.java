package exam01;

import java.util.ArrayList;

/**
 * ArrayList 실습 - 역방향 제거
 */
public class Ex02 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        for (int i = items.size() -1; i >= 0 ; i--) { // 4~0까지 삭제 (역방향)
            items.remove(i);
        }

        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i);
            System.out.println(item);
        }
    }
}
