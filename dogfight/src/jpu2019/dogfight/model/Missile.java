package jpu2019.dogfight.model;

public class Missile extends Mobile {

	private static int SPEED=4;
	private static int WIDTH=30;
	private static int HEIGHT=10;
	private static int MAX_DISTANCE_TRAVELED=1400;
	private static String IMAGE="missile";
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
