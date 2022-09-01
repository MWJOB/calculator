package codestates;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true) {

            char operator;
            Double num1 = null, num2 = null, result;
            boolean done = false;
            Scanner scan = new Scanner(System.in);

            System.out.println("연산자를 입력하세요: +, -, *, or / (종료: 0)");
            operator = scan.next().charAt(0);


            if (operator == '0') {
                break;
            }


                try {
                    System.out.println("첫 번째 숫자를 입력하세요:");
                    num1 = scan.nextDouble();
                    done = true;


                } catch (InputMismatchException e) {
                    System.out.println("잘못 입력했습니다. 숫자를 입력하세요!");
                    continue;
                }



                System.out.println("두 번째 숫자를 입력하세요:");
                try {
                    num2 = scan.nextDouble();
                    done = true;

                } catch (InputMismatchException e) {
                    System.out.println("잘못 입력했습니다. 숫자를 입력하세요!");
                    continue;
                }



            switch (operator) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                }
                case '/' -> {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                default -> System.out.println("잘못된 입력입니다");
            }


        }
    }
}
