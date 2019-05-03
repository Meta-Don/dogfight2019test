package jpu2019.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public abstract class DogfightModel extends Observable implements IDogfightModel {

	public DogfightModel() {
		
	}
	
	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMobile(IMobile mobile) {
		
	}
	
	@Override
	public void removeMobile(IMobile mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<IMobile> getMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHaveMoved() {
		// TODO Auto-generated method stub
		
	}

	
	
}
