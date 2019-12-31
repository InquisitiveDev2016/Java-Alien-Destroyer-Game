package gameBasics;


import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip extends Sprite {
	
	private int dx;
    private int dy;
    
    //All the missiles fired by the craft are stored in the arraylist
    private List<Missile> missiles;
    
    
    public SpaceShip(int x, int y) {
        super(x, y);

        initCraft();
    }

    private void initCraft() {
        
        missiles = new ArrayList<>();
        loadImage("/Users/alihaider/Documents/Java/images/craft.png");
        getImageDimensions();
    }
    
    public void move() {
    	
    	x += dx;
    	y += dy;
    	
    	if(x < 1) {
    		x = 1;
    	}
    	
    	if (y < 1) {
    		y = 1;
    	}
    }

	public List<Missile> getMissiles() {
		return missiles;
	}

	public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }
	
	public void fire() {
		
		//When fired, a new missiles object is stored in the list, until it collides
		//with an alien or goes out of the window
		
		
        missiles.add(new Missile(x + width, y + height / 2));
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
      

}
