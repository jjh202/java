package ch13;
/*
 * 나이를 입력받아 출력하시오.
 * 입력받은 나이가 정수가 아닌 경우 예외처리 하시오.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionTest07 {
	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		try {
			System.out.print("나이를 입력하세요 : ");
			int age = stdln.nextInt();
			System.out.println("당신의 나이는 "+ age + "입니다.");
		} catch (InputMismatchException e) {
			System.out.println("나이는 정수로 입력되어야 합니다.");
		}
	}
}
