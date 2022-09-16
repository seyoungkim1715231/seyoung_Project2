import java.awt.*;
import javax.swing.*;

class TotalTimer extends Thread {
	JPanel totaltimer = new JPanel();
	JLabel la;
	JLabel la1;
	int min, sec;
	int level;										
	
	public TotalTimer() {				
		//level=level_num;									
	}
	

	public void run() {
		totaltimer.setLayout(new BorderLayout(10, 10));

		la = new JLabel();
		la1 = new JLabel();

		la.setFont(new Font("Gothic", Font.PLAIN, 40));
		la1.setFont(new Font("Gothic", Font.ITALIC, 20));
		la1.setOpaque(true);
		Color color = new Color(255, 0, 0);
		la1.setForeground(color);

		totaltimer.add("Center", la);
		totaltimer.add("North", la1);
		totaltimer.setVisible(true);
		int n = 0;
		
		while (true) {
			n++;
			sec = n % 60;
			min = n / 60 % 60;

			if (min == 0) {
				la1.setText(String.format(" ※ 게임 제한시간은 1분 입니다."));
			}
			if (min == 1) {
				n=0;
				la1.setText(String.format(" ※ 제한시간이 끝났습니다."));
				la.setText(String.format("  %02d:%02d", 0, 0));
				
				//System.out.println(sp.rtscore());
				TimeOver t = new TimeOver();						
				break;
			}

			la.setText(String.format("  %02d:%02d", min, sec));
			try {
				sleep(1000);
			} catch (Exception e) {
				return;
			}
		}
	}

}