/*
 * 작성일 : 2023년 09월 22일
 * 작성자 : 컴공과 202095081 장준환
 * 설명 : 바이트 단위로 된 파일에 저장된 내용 가져오기.(출력)
 */
package D0922;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		// 파일명으로 객체 생성.
		File file = new File("c.txt");
		
		// FIleReader 객체 생성
		FileReader fr = new FileReader(file);

		// 한 문자씩 읽기
		int i;
		while((i = fr.read()) != -1) { // 데이터를 모두 읽으면 -1 반환
			System.out.print((char)i);
		}
		fr.close();
	}
}
