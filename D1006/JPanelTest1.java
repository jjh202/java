package D1006;

import java.awt.*;
import javax.swing.*;

class JPanel1 extends JFrame {
	public JPanel1() {
		// 프레임으로부터 컨테이너 생성.
		Container ct = getContentPane();
		
		// 배치 관리자 설정. FlowLayout
		ct.setLayout(new FlowLayout());
		
		// 컨테이너에 컴포넌트 추가 (쟁반)
		ct.add(new JRadioButton("자바"));
		ct.add(new JRadioButton("C언어"));
		ct.add(new JRadioButton("JAVA Script"));
		ct.add(new JRadioButton("JSP"));
		ct.add(new JRadioButton("C#"));
		
		ct.add(new JButton("자바"));
		ct.add(new JButton("C언어"));
		ct.add(new JButton("JAVA Script"));
		ct.add(new JButton("JSP"));
		ct.add(new JButton("C#"));
		
		setTitle("JPanelTest1");
		setSize(300,200);
		
		// 윈도우 창 종료시 프로세시 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
		//화면에 출력
		setVisible(true);
	}
}

public class JPanelTest1 {
	public static void main(String[] args) {
		new JPanel1();
	}
}
