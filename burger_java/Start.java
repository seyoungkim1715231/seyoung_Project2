import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Start extends JPanel implements ActionListener {
	JLabel logo, select_level;
	JButton[] levels;
	JButton level3, level2, level1, play, help;
	
	Help dialog;
	Color btn = new Color(234, 234, 234);
	Color btn_click = new Color(189, 189, 189);
	Image back;
	
	int level;
	
	public Start() {
		
		setLayout(null);
		back=new ImageIcon("배경.png").getImage();
		logo = new JLabel(new ImageIcon("logo.png"));

		select_level = new JLabel("난이도를 선택하세요");
		select_level.setFont(new Font("맑은 고딕", Font.BOLD, 15));

		level3 = new JButton("Level 3");
		level2 = new JButton("Level 2");
		level1 = new JButton("Level 1");

		levels=new JButton[3];
		levels[0]=level1;
		levels[1]=level2;
		levels[2]=level3;

		play = new JButton("PLAY");
		help = new JButton("HELP");
		
		level3.addActionListener(this);
		level2.addActionListener(this);
		level1.addActionListener(this);
		play.addActionListener(this);
		help.addActionListener(this);

		level3.setBackground(btn);
		level2.setBackground(btn);
		level1.setBackground(btn);
		play.setBackground(btn);
		help.setBackground(btn);

		level3.setFont(new Font("SanSerif", Font.BOLD, 18));
		level2.setFont(new Font("SanSerif", Font.BOLD, 18));
		level1.setFont(new Font("SanSerif", Font.BOLD, 18));
		play.setFont(new Font("SanSerif", Font.BOLD, 18));
		help.setFont(new Font("SanSerif", Font.BOLD, 18));

		logo.setBounds(130, 40, 300, 100);
		select_level.setBounds(210, 150, 150, 20);
		level3.setBounds(220, 180, 120, 30);
		level2.setBounds(220, 215, 120, 30);
		level1.setBounds(220, 250, 120, 30);
		play.setBounds(140, 300, 120, 30);
		help.setBounds(290, 300, 120, 30);

		add(logo);
		add(select_level);
		add(level3);
		add(level2);
		add(level1);
		add(play);
		add(help);
	
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==help) {
			dialog=new Help();
			dialog.setVisible(true);
		}
		if(e.getSource()==play) {
			SecondPage.k=0;
			SecondPageMain sf= new SecondPageMain(level);
		}
		
		for(int i=0;i<3;i++) {						//난이도 3개 중 하나만 선택되도록 함
			if(e.getSource()==levels[i]) {
				for(int j=0;j<3;j++) {
					levels[j].setBackground(btn);
				}
				levels[i].setBackground(btn_click);
				level=i+1;
			}
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
	}
}