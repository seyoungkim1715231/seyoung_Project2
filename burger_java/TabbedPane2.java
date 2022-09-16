import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

public class TabbedPane2 extends JPanel{
	JLabel clear, fail, lt, rt1,rt2, rt3,rt4,rt5,rt6;
	Color b=new Color(255,250,237);								
	
	public TabbedPane2() {
		setLayout(null);
		setBackground(b);									
		
		clear=new JLabel("�� Ŭ���� ����");
		lt=new JLabel("������ ���� �ð� ���� ��� 5 ���� ���� �ʰ� ��ǥ ������� �޼�");
		fail=new JLabel("�� �ߵ� ���� ��Ģ");		
		rt1=new JLabel("�Ʒ� ���õ� ����� ���� ��� 5 ���� ��� �Ҵ� ���");
		rt2=new JLabel("1. �ܹ��� ����� ������ Ʋ�� ��� (-1)");
		rt3=new JLabel("2. �ܹ��� ��ᰡ ������ ä �ϼ��� ��� (-1)");
		rt4=new JLabel("3. ��Ƽ�� �� �����ų� �¿� ��� (-1)");
		rt5=new JLabel("4. �ܹ��� �� ���ᳪ ���̵� �޴��� ������ ��� (-1)");
		rt6=new JLabel("5. �ֹ� �� ���� �ð��� �ʰ��� ��� (-1)");
		
		clear.setFont(new Font("���� ���", Font.BOLD, 18));
		lt.setFont(new Font("���� ���", Font.BOLD, 13));
		fail.setFont(new Font("���� ���", Font.BOLD, 18));
		rt1.setFont(new Font("���� ���", Font.BOLD, 13));
		rt2.setFont(new Font("���� ���", Font.BOLD, 13));
		rt3.setFont(new Font("���� ���", Font.BOLD, 13));
		rt4.setFont(new Font("���� ���", Font.BOLD, 13));
		rt5.setFont(new Font("���� ���", Font.BOLD, 13));
		rt6.setFont(new Font("���� ���", Font.BOLD, 13));

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