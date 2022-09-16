import java.awt.*;
import javax.swing.*;

public class SecondPageMain extends JFrame{
	Container content;
	SecondPage imgP;
	
	public SecondPageMain(int level){
		super("청파버거");
		setLocation(200,30);
		imgP = new SecondPage(level);
		content = getContentPane();
		content.add(imgP, BorderLayout.CENTER);
		setSize(1100,800);
		setVisible(true);
	}
}