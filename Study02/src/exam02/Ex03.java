package exam02;

import java.util.Set;
import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args) {
        Set<Book> items = new TreeSet<>();
        items.add(new Book(1000, "제목1", "저자1", "출판사1"));
        items.add(new Book(1001, "제목2", "저자2", "출판사2"));
        items.add(new Book(1001, "제목2", "저자2", "출판사2"));
        items.add(new Book(1002, "제목3", "저자3", "출판사3"));
        items.add(new Book(1003, "제목4", "저자4", "출판사4"));
        items.add(new Book(1004, "제목5", "저자5", "출판사5"));

        items.forEach(System.out::println);
    }
}
