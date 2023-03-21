package Game_Project6;



import java.awt.Image;

import javax.swing.ImageIcon;

public class Player extends Actor {
	
	public Player(int x, int y) {
		super(x, y);
		
		initPlayer();
		}
	
	private void initPlayer() {
		
		ImageIcon icon = new ImageIcon("src/resources/actor.png");
		Image image = icon.getImage();
		setImage(image);
	}
	
	public void move(int x, int y) {

        int dx = x() + x;
        int dy = y() + y;
        
        setX(dx);
        setY(dy);
		
	}	

}
