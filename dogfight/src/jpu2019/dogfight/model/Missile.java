package jpu2019.dogfight.model;

public class Missile extends Mobile {

	private final int SPEED=4;
	private final int WIDTH=30;
	private final int HEIGHT=10;
	private final int MAX_DISTANCE_TRAVELED=1400;
	private final String IMAGE="missile";
	private int distanceTraveled=0;
	
	public Missile(Direction direction, Dimension dimension) {
		//super(Direction direction, Position ???, Dimension dimension, int speed?, String IMAGE?);
	}
	
	public final int getWidthWithADirection(Direction direction) {
		return null;
	}
	
	public final int getHeightWithADirection(Direction direction) {
		return null;
	}
	
	public void move() {
		
	}
	
	public boolean isWeapon() {
		
	}

}
