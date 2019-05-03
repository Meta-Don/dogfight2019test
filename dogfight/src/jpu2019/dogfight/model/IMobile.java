package jpu2019.dogfight.model;

public interface IMobile {

	public abstract Direction getDirection();
	
	public abstract void setDirection(Direction direction);
	
	public abstract Point getPosition();
	
	public abstract Dimension getDimension();
	
	public abstract int getWidth();
	
	public abstract int getHeight();
	
	public abstract int getSpeed();
	
	public abstract Image getImage();
	
	public abstract void move();
	
	public abstract void placeInArea(IArea area);
	
	public abstract boolean isPlayer(int player);
	
	public abstract void setDogfightModel(DogfightModel dogfightModel);
	
	public abstract boolean hit();
	
	public abstract boolean isWeapon();
	
	
}
