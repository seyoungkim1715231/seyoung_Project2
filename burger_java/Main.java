import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
	Container content;
	Start start;
	
	public Main() {
		start=new Start();
		content=getContentPane();
		content.add(start,BorderLayout.CENTER);
		setSize(600, 400);
		setTitle("û�Ĺ���");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(500,250);	
		setVisible(true);
		
	}
		
	public static void main(String[] args) {
		Main s=new Main();
	}
}
