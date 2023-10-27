package D1027;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 1. 처리할 이벤트 종류 결정
// 2. 이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스작성 - ActionListener
class JRadioButton1 extends JFrame implements ActionListener {
	JLabel jl;
	JCheckBox[] jc = new JCheckBox[5];
	String[] hobby = {"걷기","등산","골프","스킨스쿠버","페러글라이딩"};
	
	JRadioButton[] jr = new JRadioButton[5];
	String[] age = {"20대","30대","40대","50대","60대"};
	public JRadioButton1() {
		
		jl = new JLabel();
		
		JLabel jl1 = new JLabel("당신의 취미는?");
		JLabel jl2 = new JLabel("당신의 나이는?");
		
		JPanel hobbyPanel = new JPanel();
		JPanel agePanel = new JPanel();
		
		// 나이를 나타내느 체크박스 버튼을 그루븡로 설정.
		ButtonGroup gb = new ButtonGroup();
		
		for (int i=0; i < 5; i++) {
			// 취미를 나타내는 체크박스 객체를 배열로 생성.
			jc[i] = new JCheckBox(hobby[i]);
			// 나이를 나타내는 라디오 버튼 객체를 배열로 생성.
			jr[i] = new JRadioButton(age[i]);
			
			hobbyPanel.add(jc[i]); // 취미 판넬에 객체 추가
			agePanel.add(jr[i]); // 나이 판넬에 객체 추가
			
			// 3. 이벤트를 받아들일 각 컴포넌트에 리스너를 등록
			jr[i].addActionListener(this); // 라디오 버튼 배열 객체에 리스너 등록
			gb.add(jr[i]); // 버튼 그룹에 객체 추가
		}
		
		// 컨테이너 생성
		Container ct = getContentPane();
		// 배치 관리자 설정
		ct.setLayout(new GridLayout(3,1));

		JPanel jp1 = new JPanel();
		jp1.add(jl1);
		jp1.add(hobbyPanel);
		
		JPanel jp2 = new JPanel();
		jp2.add(jl2);
		jp2.add(agePanel);
		
		JPanel jp3 = new JPanel();
		jp3.add(jl);
		
		// 컨테이너에 추가
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		// 화면에 보이도록
		setTitle("JRadioButton Test1");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성.
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "당신의 취미 : ";
		for(int i=0; i < 5; i++) {
			if(jc[i].isSelected()==true)
				s=s+hobby[i]+" ";
		}
		s=s+"당신의 나이 : ";
		jl.setText(s+e.getActionCommand());
	}
}

public class JRadioButtonTest1 {

	public static void main(String[] args) {
		new JRadioButton1();
	}
}
