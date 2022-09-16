import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimeOver extends JDialog implements ActionListener {
	ImageIcon timeover = new ImageIcon("timeover.png");
	Color btn = new Color(234, 234, 234);
	JButton reset = new JButton("RESTART");
	JButton exit = new JButton("EXIT");														
	Color b=new Color(255,250,237);								
	
	public TimeOver() {			
		JPanel b_panel=new JPanel();
		b_panel.setLayout(null);
		b_panel.setBackground(b);									
		
		JLabel score_l = new JLabel("´Þ¼º ¸ÅÃâ¾×: "+ SecondPage.score);	
		score_l.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));				
		score_l.setBounds(230, 220, 200, 100);								
		
		JLabel goalscore=new JLabel("¸ñÇ¥ ¸ÅÃâ¾×: "+SecondPage.goal);		
		goalscore.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		goalscore.setBounds(230, 200, 200, 100);

		setTitle("TIME OVER");
		setSize(600, 400);
		setLocation(500, 250);
		
		
		JLabel j1 = new JLabel();
		j1.setIcon(timeover);
		j1.setBounds(150, 10, 300, 200);

		JLabel pass=new JLabel("°ÔÀÓ Å¬¸®¾î ¼º°ø!");
		JLabel fail=new JLabel("°ÔÀÓ Å¬¸®¾î ½ÇÆÐ!");
		pass.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fail.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		
		if(SecondPage.score>=SecondPage.goal) {
			b_panel.add(pass);
			pass.setBounds(215, 160, 200, 100);
		}
		else {
			b_panel.add(fail);
			fail.setBounds(215, 160, 200, 100);
		}
		
		reset.setBackground(btn);
		exit.setBackground(btn);

		reset.setFont(new Font("SanSerif", Font.BOLD, 13));
		exit.setFont(new Font("SanSerif", Font.BOLD, 13));

		reset.setBounds(160, 300, 120, 30);
		exit.setBounds(310, 300, 120, 30);

		reset.addActionListener(this);
		exit.addActionListener(this);

		b_panel.add(goalscore);								
		b_panel.add(score_l);
		b_panel.add(j1);
		b_panel.add(reset);
		b_panel.add(exit);
		add(b_panel);
		
		this.setAlwaysOnTop(true);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == reset) {
			this.dispose();
			SecondPage.score=0;
			SecondPage.j=4;
			SecondPage.k=0;
			Main sm = new Main();
		}
		if (e.getSource() == exit) {
			System.exit(0);
		}
	}

}