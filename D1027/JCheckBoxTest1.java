package D1027;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 1. 처리할 이벤트 종류 결정
// 2. 이벤트에 적합한  ItemListener 인터페이스 사용하여 클래스작성
class JCheckBox1 extends JFrame implements ItemListener {
	JTextField jtf;
	public JCheckBox1() {
		
		// 체크박스 객체 생성
		JCheckBox jc1 = new JCheckBox("JSP");
		JCheckBox jc2 = new JCheckBox("PHP");
		JCheckBox jc3 = new JCheckBox("ASP");
		JCheckBox jc4 = new JCheckBox("Servlet");
		// 텍스트 객체 생성
		jtf = new JTextField(10);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// FlowLayout 설정.
		ct.setLayout(new FlowLayout());
		
		// 컨테이너에 생성
		ct.add(jc1);
		ct.add(jc2);
		ct.add(jc3);
		ct.add(jc4);
		ct.add(jtf);
		
		// // 3. 이벤트 받아들일 리스너 등록
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		
		// 화면에 보이도록... 사이즈:250,100
		setTitle("JCheckBox Test1");
		setSize(250,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성.
	@Override
	public void itemStateChanged(ItemEvent e) {
		// 체크한 객체 텍스트 생성
		jtf.setText(((JCheckBox)e.getItem()).getText());
	}
	
}

public class JCheckBoxTest1 {

	public static void main(String[] args) {
		new JCheckBox1();
	}

}
