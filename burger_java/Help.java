import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

public class Help extends JDialog{
	JTabbedPane tabpane;
	
	public Help() {
		setTitle("û�Ĺ��� ��Ģ");
		tabpane=new JTabbedPane();
		TabbedPane1 tp1=new TabbedPane1();
		TabbedPane2 tp2=new TabbedPane2();

		tabpane.addTab("���� ��Ģ", tp1);
		tabpane.addTab("���� ���� ����", tp2);
		tabpane.setFont(new Font("���� ���", Font.BOLD, 15));
		add(tabpane);
        setSize(550,380);
	
		setLocation(525,250);
        setVisible(true);
	}
	
}