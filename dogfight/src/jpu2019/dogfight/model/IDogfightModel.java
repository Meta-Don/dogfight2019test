package jpu2019.dogfight.model;

public interface IDogfightModel {
	
	public abstract IArea getArea();
	
	public abstract void buildArea(Dimension dimension);
	
	public abstract void addMobile(IMobile mobile);
	
	public abstract void removeMobile(IMobile mobile);
	
	public abstract ArrayList<IMobile> getMobile();
	
	public abstract IMobile getMobileByPlayer(int player);
	
	public abstract void setMobilesHaveMoved();
	
}
