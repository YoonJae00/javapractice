package chap13;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        int i = 0;
        try {

            for (i = 0; i < arr.length; i++) {
                System.out.print("숫자로 변환된 값은 : ");
                arr[i] = sc.nextLine();
                Integer.parseInt(arr[i]);
            }
        } catch (NumberFormatException e){
            System.out.println(arr[i] + "는 정수로 변환할 수 없습니다!");
        }

    }
}
