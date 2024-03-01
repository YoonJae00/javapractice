package chap13;

import java.util.ArrayList;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 숫자를 입력하세요 : ");
        int[] num = new int[3];
        try {
            for(int i = 0; i < 5; i++) {
                num[i] = sc.nextInt();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }


    }
}
