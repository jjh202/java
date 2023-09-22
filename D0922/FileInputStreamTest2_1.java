/*
 * 작성일 : 2023년 09월 22일
 * 작성자 : 컴공과 202095081 장준환
 * 설명 : 바이트 단위로 된 파일에 저장된 내용 가져오기.(출력)
 */
package D0922;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2_1 {
	public static void main(String[] args) throws IOException {
		try {
			// 파일명으로 객체 생성.
			File file = new File("c.txt");
			
			// FIleReader 객체 생성
			FileInputStream fr = new FileInputStream(file);
			// 한 문자씩 읽기
			int i;
			while((i = fr.read()) != -1) { // 데이터를 모두 읽으면 -1 반환
				System.out.print((char)i);
			}
			fr.close();
			System.out.println("파일로부터 바이트를 읽어 화면에 출력");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
	}
}
