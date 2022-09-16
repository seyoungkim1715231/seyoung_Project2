import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

public class TabbedPane1 extends JPanel{
	JLabel level, rule, lt1, lt2, rt1,rt2,rt22, rt3,rt4;
	Color b=new Color(255,250,237);									
	
	public TabbedPane1() {
		setLayout(null);
		setBackground(b);									
		
		level=new JLabel("�� ���̵�");
		lt1=new JLabel("��, ��, �Ϸ� ������, ���̵��� ���������� �پ��� ��ᰡ ���յ� �����");
		lt2=new JLabel("����� �ܹ��Ű� �����մϴ�.");
		rule=new JLabel("�� ��Ģ");		
		rt1=new JLabel("1. �־��� ���� �ð� ���� �ܹ��Ÿ� ���� ���� ��ǥ ������� �޼����ּ���.");

		rt2=new JLabel("2. �ܹ��� �ֹ��� ������ ��ܿ� ǥ�õ� ������ ����,");
		rt22=new JLabel("   �ش� �ܹ��� �ӿ� �� ��Ḧ ���콺 Ŭ�� ������ ���� �׾��ݴϴ�.");
		rt3=new JLabel("3. �ܹ��� ���� ���� ��Ƽ�� ���� �ϴ��� �Ķ����ҿ��� 2-3�� ���� �����ּ���.");

		
		level.setFont(new Font("���� ���", Font.BOLD, 18));
		lt1.setFont(new Font("���� ���", Font.BOLD, 13));
		lt2.setFont(new Font("���� ���", Font.BOLD, 13));
		rule.setFont(new Font("���� ���", Font.BOLD, 18));
		rt1.setFont(new Font("���� ���", Font.BOLD, 13));
		rt2.setFont(new Font("���� ���", Font.BOLD, 13));
		rt22.setFont(new Font("���� ���", Font.BOLD, 13));
		rt3.setFont(new Font("���� ���", Font.BOLD, 13));

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