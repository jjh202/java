package D1103;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JMenu1 extends JFrame implements ActionListener{
	JTextField jtf; // 선택한 메뉴 출력 영역
	public JMenu1() {
		// 컨테이너 생성.
		Container ct = getContentPane();
		
		// 레이아웃 - border
		ct.setLayout(new BorderLayout());
		
		// 1. JMenuBar()객체 생성
		JMenuBar jmb = new JMenuBar();
		
		// 2. JMenu 객체 생성
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		
		// 3. 서브 메뉴 JMenuItem 객체로 생성
		JMenuItem jmi = new JMenuItem("새파일");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		jmi = new JMenuItem("저장하기");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		jmi = new JMenuItem("열기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		jmi = new JMenuItem("잘라내기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		jmi = new JMenuItem("복사");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		// 3. 서브 메뉴 JCheckBoxMenuItem 객체로 생성.
		JCheckBoxMenuItem jcmi = new JCheckBoxMenuItem("눈금자");
		jcmi.addActionListener(this);
		menu2.add(jcmi);
		
		// 3. 서브 메뉴 JRadioButtonMenuItem 객체로 생성.
		JRadioButtonMenuItem jrbmi = new JRadioButtonMenuItem("수정가능상태");
		jrbmi.addActionListener(this);
		menu2.add(jrbmi);
		
		// 5. menu1, menu2를 jmb(JMenuBar)에 추가
		jmb.add(menu1);
		jmb.add(menu2);
		
		// 6. setJMenuBar() 메서드를 이용하여 메뉴바를 프레임에 추가.
		setJMenuBar(jmb);
		
		jtf = new JTextField();
		ct.add(jtf, BorderLayout.SOUTH); // textField 위치 설정.
		
		// 화면에 보이도록
		setTitle("JMenu Test1");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
	}
}

public class JMenuTest1 {

	public static void main(String[] args) {
		new JMenu1();
	}

}
