package D1031;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JCombox extends JFrame implements ItemListener {
	JLabel fruitLabel;
	public JCombox() {	
		// 콤보 박스 객체 생성.
		JComboBox<String> fruitCombo = new JComboBox<String>();
		
		// 이미지 표시 영역 객체 생성
		fruitLabel = new JLabel();
		
		// 과일 배열 생성
		String fruitList[] = {"persimmom","banana","pear","apple","cherry","grape"};
		
		// 컨테이너 만들기, 레이아웃 지정.
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		// 콤보박스에 과일 리스트 추가
		for(int i=0; i < fruitList.length; i++)
		{
			fruitCombo.addItem(fruitList[i]);
		}
		
		// 컨테이너에 콤보박스 추가
		ct.add(fruitCombo);
		
		// 콤보박스에 이벤트 리스너 등록
		fruitCombo.addItemListener(this);
		
		// 화면에 보이도록
		setTitle("JComboBox Test");
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String fruit = (String)e.getItem();
		fruitLabel.setIcon(new ImageIcon("image/" + fruit + ".jpg"));
	}
}

public class JComboxTest {
	public static void main(String[] args) {
		new JCombox();
	}
}
