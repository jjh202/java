package D1107;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lotto extends JFrame implements ActionListener {
	private JLabel lotto_num = new JLabel();
	public Lotto() {
		JButton lotto = new JButton("로또 번호 자동생성");
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		ct.add(lotto);
		ct.add(lotto_num);
		
		// 버튼에 리스너 추가
		lotto.addActionListener(this);
		
		setTitle("Lotto Number Generate");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Random r = new Random();
		int[] num = new int[6];
		
		// 같은 번호가 있는지 확인
		int temp;
		
		int i=0;
		a : while(i<6) {
			// 랜덤 번호 생성.
			temp = r.nextInt(45)+1;
			// 배열에 저장된 값과 temp에 저장된 값을 비교하여 같으면 다시 랜덤수 발생.
			for (int j=0; j<=i; j++) {
				if (temp == num[j])
					continue a;
			}
			num[i]=temp;
			i++;
		}
		lotto_num.setText("이번주 로또 당첨 번호 : " + Arrays.toString(num));
	}
	
}

public class LottoNum {
	public static void main(String[] args) {
		new Lotto();
	}
}
