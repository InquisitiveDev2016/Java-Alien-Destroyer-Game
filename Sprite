package gameBasics;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Sprite {
	
	protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;
    
    
    public Sprite(int x, int y) {
    	setX(x);
    	setY(y);
    	visible = true;
    }
    
    
    protected void getImageDimensions() {
    	width = image.getWidth(null);
    	height = image.getHeight(null);
    }
    
    protected void loadImage(String imageName) {
    	ImageIcon ii = new ImageIcon(imageName);
    	image = ii.getImage();
    }


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}
	
	
	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	//The code that is shared by all sprites (craft, aliens, missiles, etc.) is placed in the Sprites class
	//getBounds returns the bounding rectangle of the sprite image, will be required in collision detection
	public Rectangle getBounds() {
		return new Rectangle(x,y, width, height);
	}

	
	
    
    
}
