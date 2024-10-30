package CompletePhone;

import java.util.Scanner;

public abstract class PhoneMenu extends PhoneGame{

    @Override
    public void menu() {
        System.out.println("핸드폰 메뉴를 선택하세요.");
        System.out.println("1.Game 2.Calculator");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer == 1) {
            game();
        } else if(answer == 2) {
            calculator();
        } else {
            System.out.println("숫자 1과 2 중 선택해주세요.");
        }
    }


}
