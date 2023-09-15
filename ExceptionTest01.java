package ch13;

//2개의 정수를 입력 받아 나눗셈하는 프로그램
import java.util.Scanner;

public class ExceptionTest01 {
	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);

		System.out.print("첫 번쨰 수 입력 : ");
		int num1 = stdln.nextInt();
		System.out.print("두 번쨰 수 입력 : ");
		int num2 = stdln.nextInt();
		
		System.out.print(num1/num2);
		
	}

}
