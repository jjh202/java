package D1017;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

// 1. 처리할 이벤트 종류 결정 - 버튼
// 2. 이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스작성
class GUI2 extends JFrame implements ActionListener {
	// 텍스트 에어리어 객체 선언
	private JTextArea contents;
	// 텍스트 필드 객체 선언
	private JTextField f_name;
	
	public GUI2() {
		// 여러줄 텍스트 객체 생성 - 글 내용 입력
		contents = new JTextArea(10, 20);
		// 한줄 텍스트 객체 생성 - 파일 저장명 입력
		f_name = new JTextField("파일이름을 입력하세요", 20);
		// 버튼 객체 생성 - 저장 버튼
		JButton jb = new JButton("파일 불러오기");
		// 텍스트 에어리어 수정 불가.
		contents.setEditable(false);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		// FlowLayout 설정.
		ct.setLayout(new FlowLayout());
		// 패널 생성.
		JPanel pl = new JPanel();
		
		// 판넬에 텍스트 필드 추가
		pl.add(f_name);
		// 판넬에 버튼 추가
		pl.add(jb);
		// 컨테이너에 판넬추가
		ct.add(pl);
		// 컨테이너에 텍스트 에어리어 추가
		ct.add(contents);
		
		// 3. 이벤트 받아들일 버튼에 리스너 등록
		jb.addActionListener(this);
		
		// 화면에 보이도록... 사이즈:500,300
		setTitle("파일 불러오기");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성.
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			String s = f_name.getText();
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fis);
			contents.setText(dis.readUTF());
			fis.close();
			System.out.print(s + "파일을 읽었습니다.");
		}
		catch (Exception e){
			System.out.print("파일이 존재하지 않습니다.");
		}
	}
	
}

public class GUITest2 {

	public static void main(String[] args) {
		new GUI2();
	}

}
