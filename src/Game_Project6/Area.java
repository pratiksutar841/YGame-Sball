package Game_Project6;



import java.awt.Image;

import javax.swing.ImageIcon;

public class Area extends Actor {
	
	public Area(int x, int y) {
		super(x, y);
		
		initArea();
	}
	
	private void initArea() {
	
	ImageIcon icon = new ImageIcon("src/resources/area.png");
	Image image = icon.getImage();
	setImage(image);
	}

}
