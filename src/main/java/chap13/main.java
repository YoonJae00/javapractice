package chap13;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("===========================");
            System.out.println("도서관 관리 페이지 입니다.");
            System.out.println("1. 조회하기");
            System.out.println("2. 추가하기");
            System.out.println("3. 책 찾기");
            System.out.println("4. 전체 책 가격 합계 및 평균 조회");
            System.out.println("5. 프로그램 종료하기");
            System.out.println("===========================");
            System.out.print("메뉴번호를 입력해주세요 : ");
            int bookNum = sc.nextInt();
            switch (bookNum) {
                case 1:
                    System.out.println("조회합니다..");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
            }

        }
    }
}
