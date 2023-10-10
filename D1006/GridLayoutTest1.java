package D1006;

import java.awt.*;
import javax.swing.*;

class GridLayout1 extends JFrame{
	public GridLayout1() {
		// 프레임으로부터 컨테이너 생성.
		Container ct = getContentPane();
		
		GridLayout gl = new GridLayout(4, 5, 10, 10); //4행 5열 
		
		// 컨테이너에 레이아웃 설정
		ct.setLayout(gl);
		
		for(int i=1; i<=20; i++) {
			ct.add(new JButton("버튼"+ i));
		}
		
		setTitle("GridLayoutTest1");
		setSize(500,500);
		// 윈도우 창 종료시 프로세시 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
		//화면에 출력
		setVisible(true);
	}
}
public class GridLayoutTest1 {
	public static void main(String[] args) {
		new GridLayout1();
	}

}
