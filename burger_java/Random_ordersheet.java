import javax.swing.*;
import java.awt.*;

public class Random_ordersheet extends JPanel{
	
	final Image topbun = new ImageIcon("topbun.png").getImage();
	final Image bottombun = new ImageIcon("bottombun.png").getImage();
	final Image cheese = new ImageIcon("cheese.png").getImage();
	final Image lettuce = new ImageIcon("lettuce.png").getImage();
	final Image onion = new ImageIcon("onion.png").getImage();
	final Image patty = new ImageIcon("patty2.png").getImage();
	final Image tomato = new ImageIcon("tomato.png").getImage();
	final Image coke = new ImageIcon("coke.png").getImage();
	final Image sprite = new ImageIcon("sprite.png").getImage();
	
	Image random1,random2,random3,random4, random5;
	int r1,r2,r3,r4,r5;							
	int level;											
	Image [] recipe= new Image[7];
	Image drink_recipe;
	
	public Random_ordersheet(int level_num) {			
		level=level_num;
	}
	
	public void paint(Graphics g) {
		
		Image ingredient[] = {cheese, lettuce, onion, patty, tomato};
		Image drink[]= {coke, sprite,null};
		
		r1=(int)((Math.random()*5));	
		r2=(int)((Math.random()*5));
		r3=(int)((Math.random()*5));
		r4=(int)((Math.random()*5));
		r5=(int)((Math.random()*5));
		
		random1=ingredient[r1];
		random2=ingredient[r2];
		random3=ingredient[r3];
		random4=ingredient[r4];
		random5=ingredient[r5];
		
		int random_drink=(int)((Math.random()*3));			
		g.drawImage(drink[random_drink],170,100,this);
		drink_recipe=drink[random_drink];
	
		if(level==3) {
			
			g.drawImage(bottombun,40,175,this);
			g.drawImage(random1,40,165,this);
			g.drawImage(random2,40,150,this);
			g.drawImage(random3,40,135,this);
			g.drawImage(random4,40,120,this);
			g.drawImage(random5,40,105,this);
			g.drawImage(topbun,40,45,this);
			
			recipe[0]=bottombun;
			recipe[1]=random1;
			recipe[2]=random2;
			recipe[3]=random3;
			recipe[4]=random4;
			recipe[5]=random5;
			recipe[6]=topbun;
		}
		else if(level==2) {
			g.drawImage(bottombun,40,175,this);
			g.drawImage(random1,40,165,this);
			g.drawImage(random2,40,150,this);
			g.drawImage(random3,40,135,this);
			g.drawImage(random4,40,120,this);
			g.drawImage(topbun,40,60,this);
			
			recipe[0]=bottombun;
			recipe[1]=random1;
			recipe[2]=random2;
			recipe[3]=random3;
			recipe[4]=random4;
			recipe[5]=topbun;
		}
		else {
			g.drawImage(bottombun,40,175,this);
			g.drawImage(random1,40,165,this);
			g.drawImage(random2,40,150,this);
			g.drawImage(random3,40,135,this);
			g.drawImage(topbun,40,75,this);
		
			recipe[0]=bottombun;
			recipe[1]=random1;
			recipe[2]=random2;
			recipe[3]=random3;
			recipe[4]=topbun;
		}

		setOpaque(false);
		super.paint(g);
	}
}