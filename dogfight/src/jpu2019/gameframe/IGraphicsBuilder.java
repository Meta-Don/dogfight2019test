package jpu2019.gameframe;

public interface IGraphicsBuilder {

	public abstract void applyModelToGraphics(Graphics graphic, ImageObserver observer);
	
	public abstract int getGlobalWidth();
	
	public abstract int getGlobalHeight();
	
}
