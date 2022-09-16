import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

public class TabbedPane2 extends JPanel{
	JLabel clear, fail, lt, rt1,rt2, rt3,rt4,rt5,rt6;
	Color b=new Color(255,250,237);								
	
	public TabbedPane2() {
		setLayout(null);
		setBackground(b);									
		
		clear=new JLabel("▷ 클리어 조건");
		lt=new JLabel("정해진 영업 시간 내에 목숨 5 개를 잃지 않고 목표 매출액을 달성");
		fail=new JLabel("▷ 중도 실패 규칙");		
		rt1=new JLabel("아래 제시된 경우들로 인해 목숨 5 개를 모두 잃는 경우");
		rt2=new JLabel("1. 햄버거 재료의 순서가 틀린 경우 (-1)");
		rt3=new JLabel("2. 햄버거 재료가 누락된 채 완성한 경우 (-1)");
		rt4=new JLabel("3. 패티를 덜 익혔거나 태운 경우 (-1)");
		rt5=new JLabel("4. 햄버거 외 음료나 사이드 메뉴가 누락된 경우 (-1)");
		rt6=new JLabel("5. 주문 당 제한 시간을 초과한 경우 (-1)");
		
		clear.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lt.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		fail.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		rt1.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rt2.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rt3.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rt4.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rt5.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rt6.setFont(new Font("맑은 고딕", Font.BOLD, 13));

		clear.setBounds(30, 0, 300, 50);
		lt.setBounds(50, 45, 500, 20);

		fail.setBounds(30, 75, 300, 50);
		rt1.setBounds(50, 120, 500, 20);
		rt2.setBounds(65, 150, 500, 20);
		rt3.setBounds(65, 180, 500, 20);
		rt4.setBounds(65, 210, 500, 20);
		rt5.setBounds(65, 240, 500, 20);
		rt6.setBounds(65, 270, 500, 20);
		
		add(clear);
		add(lt);

		add(fail);
		add(rt1);
		add(rt2);
		add(rt3);
		add(rt4);
		add(rt5);
		add(rt6);
		
	}
}