package gameBasics;

public class Missile extends Sprite {
	
	private final int BOARD_WIDTH = 390;
    private final int MISSILE_SPEED = 2;
    
	public Missile(int x, int y) {
		super(x, y);
		
		initMissile();
	}
	
private void initMissile() {
        
        loadImage("/Users/alihaider/Documents/Java/images/missile.png");
        getImageDimensions();        
    }


	//Missiles only move right, will disappear after it reaches right window border
    public void move() {
        
        x += MISSILE_SPEED;
        
        if (x > BOARD_WIDTH)
            visible = false;
    }

}
