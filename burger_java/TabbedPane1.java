import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

public class TabbedPane1 extends JPanel{
	JLabel level, rule, lt1, lt2, rt1,rt2,rt22, rt3,rt4;
	Color b=new Color(255,250,237);									
	
	public TabbedPane1() {
		setLayout(null);
		setBackground(b);									
		
		level=new JLabel("▷ 난이도");
		lt1=new JLabel("상, 중, 하로 나뉘며, 난이도가 높아질수록 다양한 재료가 조합된 만들기");
		lt2=new JLabel("어려운 햄버거가 등장합니다.");
		rule=new JLabel("▷ 규칙");		
		rt1=new JLabel("1. 주어진 영업 시간 내에 햄버거를 많이 만들어서 목표 매출액을 달성해주세요.");

		rt2=new JLabel("2. 햄버거 주문이 들어오면 상단에 표시된 빌지를 보고,");
		rt22=new JLabel("   해당 햄버거 속에 들어간 재료를 마우스 클릭 조작을 통해 쌓아줍니다.");
		rt3=new JLabel("3. 햄버거 내에 들어가는 패티는 왼쪽 하단의 후라이팬에서 2-3초 동안 구워주세요.");

		
		level.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lt1.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		lt2.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rule.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		rt1.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rt2.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rt22.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rt3.setFont(new Font("맑은 고딕", Font.BOLD, 13));

		level.setBounds(30, 0, 300, 50);
		lt1.setBounds(50, 45, 500, 20);
		lt2.setBounds(50, 65, 500, 20);
		rule.setBounds(30, 90, 300, 50);
		rt1.setBounds(50, 135, 500, 20);
		rt2.setBounds(50, 170, 500, 20);
		rt22.setBounds(50, 190, 500, 20);
		rt3.setBounds(50, 225, 500, 20);
		
		add(level);
		add(lt1);
		add(lt2);
		add(rule);
		add(rt1);
		add(rt2);
		add(rt22);
		add(rt3);
		
	}
}