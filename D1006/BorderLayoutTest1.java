package D1006;

import java.awt.*;
import javax.swing.*;

class BorderLayout1 extends JFrame {
	public BorderLayout1() {
		// 프레임으로부터 컨테이너 생성.
		Container ct = getContentPane();
		
		// BorderLayout 배체 관리자 객체 생성
		BorderLayout bl = new BorderLayout(10, 10);
		
		// 컨테이너에 레이아웃 설정
		ct.setLayout(bl);
		
		// 5개의 버튼을 배치
		ct.add(new JButton("오른쪽버튼"), BorderLayout.EAST);
		ct.add(new JButton("왼쪽버튼"), BorderLayout.WEST);
		ct.add(new JButton("위쪽버튼"), BorderLayout.NORTH);
		ct.add(new JButton("아래쪽버튼"), BorderLayout.SOUTH);
		ct.add(new JButton("중앙버튼"), BorderLayout.CENTER);
		
		setTitle("BorderLayoutTest1");
		setSize(400,300);
		
		// 윈도우 창 종료시 프로세시 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//화면에 출력
		setVisible(true);
	}
}

public class BorderLayoutTest1 {
	public static void main(String[] args) {
		new BorderLayout1();
	}
}
