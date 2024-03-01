package chap13;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();

        try {
        int result = num1 / num2 ;
        } catch (Exception e){
            System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요");
        }




    }
}
