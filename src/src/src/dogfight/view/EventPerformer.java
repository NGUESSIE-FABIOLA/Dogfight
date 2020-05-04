package src.dogfight.view;

import java.awt.event.KeyEvent;

import src.game.frame.GameFrame;
import src.game.frame.IEventPerformer;
import src.jpu2016.dogfight.controller.IOrderPerformer;
import src.jpu2016.dogfight.controller.UserOrder;

public class EventPerformer implements IEventPerformer{
	

	public EventPerformer(IOrderPerformer orderPreformer){
		
	}
	
	public void eventPerform(KeyEvent keyCode){
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode){
		return null;
		
	}

	@Override
	public void setGameFrame(GameFrame gameFrame) {
		// TODO Auto-generated method stub
		
	}

	public void setDogfightView(DogfightView dogfightView) {
		// TODO Auto-generated method stub
		
	}

	
	
}
