package chap13;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int)Math.sqrt(c*c - a*a);

        System.out.println(b_square);
    }
}

