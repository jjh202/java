/*
 * 작성일 : 2023년 09월 22일
 * 작성자 : 컴공과 202095081 장준환
 * 설명 : 파일에 저장된 내용 가져오기.(출력)
 */
package D0922;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest1 {
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		try {
			System.out.print("읽을 파일명을 입력하세요 : ");
			String sfile = stdIn.next(); // 문자열로 입력된 파일명 저장.
			
			// 읽어들일 파일명으로 객체 생성.
			FileReader fr = new FileReader(sfile);
			// 한 문자씩 읽기
			int i;
			while((i = fr.read()) != -1) { // 데이터를 모두 읽으면 -1 반환.
				System.out.print((char)i);
			}
			
			fr.close(); // 스트림 닫기
			
		} catch (FileNotFoundException e) { //예외처리는 필수.
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("읽어 들일 파일이 없습니다.");
		}

	}
}
