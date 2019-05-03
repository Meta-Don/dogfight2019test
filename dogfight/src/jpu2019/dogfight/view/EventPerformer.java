package jpu2019.dogfight.view;

import jpu2019.dogfight.controller.IOrderPerformer;
import jpu2019.dogfight.controller.UserOrder;
import jpu2019.gameframe.IEventPerformer;

public abstract class EventPerformer implements IEventPerformer, IOrderPerformer {
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		
	}
	
	@Override
	public void eventPerform(KeyEvent keyCode) {
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		return ;
	}
	
}
