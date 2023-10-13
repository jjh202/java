package D1013;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// GUI 클래스
// 1. 처리할 이벤트 종류 결정 - ActionEvent
// 2. 이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스작성 - ActionListener
class JButton2 extends JFrame implements ActionListener {
	JTextField input;
	public JButton2() {
		// 텍스트 객체 생성
		input = new JTextField(10);
		
		// 이미지 아이콘 객체 생성.
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon persimmom = new ImageIcon("image/persimmom.jpg");
		ImageIcon pear = new ImageIcon("image/pear.jpg");
		ImageIcon grape = new ImageIcon("image/grape.jpg");
		
		// 버튼 객체 생성
		JButton jb1 = new JButton("사과", apple);
		JButton jb2 = new JButton("바나나", banana);
		JButton jb3 = new JButton("감", persimmom);
		JButton jb4 = new JButton("배", pear);
		JButton jb5 = new JButton("포도", grape);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		ct.setLayout(new GridLayout(3, 2));
		
		// 컨테이너에 추가.
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		ct.add(input);
		
		// 3. 이벤트를 받아드릴 컴포넌트에 리스너 등록.
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		//화면에 보이기 500,400
		setTitle("JButton Test2");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// 4. 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		input.setText(e.getActionCommand());
	}
	
}

public class JButtonTest2 {
	public static void main(String[] args) {
		new JButton2();
	}
}
