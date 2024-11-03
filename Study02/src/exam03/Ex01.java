package exam03;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap 실습 - 추가, 삭제, 조회
 */
public class Ex01 {
    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        members.put("user01", "사용자01");
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");
        members.put("user04", "사용자04");
        members.put("user05", "사용자05");

        members.put("user01", "사용자99");

        System.out.println(members);

        members.remove("user01");
        System.out.println(members);

        String userName03 = members.get("user03");
        System.out.println(userName03);
    }
}
