import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

public class Help extends JDialog{
	JTabbedPane tabpane;
	
	public Help() {
		setTitle("청파버거 규칙");
		tabpane=new JTabbedPane();
		TabbedPane1 tp1=new TabbedPane1();
		TabbedPane2 tp2=new TabbedPane2();

		tabpane.addTab("게임 규칙", tp1);
		tabpane.addTab("게임 종료 조건", tp2);
		tabpane.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(tabpane);
        setSize(550,380);
	
		setLocation(525,250);
        setVisible(true);
	}
	
}