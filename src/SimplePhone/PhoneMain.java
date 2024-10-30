package SimplePhone;

public class PhoneMain extends PhoneCalculator {
    public static void main(String[] args) {
        PhoneMain main = new PhoneMain();
        System.out.println("핸드폰 메뉴를 실행합니다.");
        main.game();
        main.calculator();
    }
}
