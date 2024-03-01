package chap13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개를 입력하세요 : ");
        int[] iarr = new int[3];
        int num = 0;
        try {
            for(int i = 0; i < 3; i++){
                System.out.print(i + "번째 정수 입력 : ");
                iarr[i] = sc.nextInt();
                num = num + iarr[i];
            }
            System.out.println("합은 : " + num);
        } catch (InputMismatchException e){
            System.out.println("정수가 아닙니다!! 다시 입력하세요!!");
        } catch (Exception e){
            System.out.println("알 수 없는 오류!!");
        }

    }
}
