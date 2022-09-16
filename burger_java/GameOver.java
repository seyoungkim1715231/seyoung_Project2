import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  


public class GameOver extends JDialog implements ActionListener{
	ImageIcon gameover=new ImageIcon("gameover.png");
	Color btn = new Color(234, 234, 234);
	JButton restart=new JButton("RESTART");
	JButton exit=new JButton("EXIT");
	Color b=new Color(255,250,237);						
	
	public GameOver() {
		
		setTitle("GAME OVER");	
		setSize(600, 400);
		setLocation(500,250);						
		
		JPanel b_panel=new JPanel();
		b_panel.setLayout(null);
		b_panel.setBackground(b);									
		
		JLabel j1=new JLabel();
		j1.setIcon(gameover);
		j1.setBounds(150, 50, 300, 200);
	
		
		restart.setBackground(btn);
		exit.setBackground(btn);

		restart.setFont(new Font("SanSerif", Font.BOLD, 13));
		exit.setFont(new Font("SanSerif", Font.BOLD, 13));
		
		
		restart.setBounds(160,300,120,30);
		exit.setBounds(310,300,120,30);
        
		restart.addActionListener(this);
		exit.addActionListener(this);
		
		b_panel.add(j1);
		b_panel.add(restart);
		b_panel.add(exit);
		add(b_panel);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==restart) {
			this.dispose();
			SecondPage.score=0;
			SecondPage.j=4;
			SecondPage.k=0;
			Main sm=new Main();
		}
		if(e.getSource()==exit) {
			System.exit(0);
		}
		
	}
	
	
}
