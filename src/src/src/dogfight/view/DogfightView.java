package src.dogfight.view;

import java.lang.Runnable;
import java.util.Observable;

import src.game.frame.GameFrame;
import src.game.frame.IEventPerformer;
import src.game.frame.IGraphicsBuilder;
import src.jpu2016.dogfight.controller.IOrderPerformer;
import src.jpu2016.dogfight.model.IDogfightModel;


public class DogfightView implements IViewSystem , Runnable {
	
	protected GraphicsBuilder graphicsBuilder;
	protected EventPerformer eventPerformer;
	protected GameFrame gameFrame;
	protected IEventPerformer performer;
	String title;

	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfight, Observable observable){
		
			this.graphicsBuilder = new GraphicsBuilder( dogfight);
			this.graphicsBuilder.setDogfightView(this);
			
			this.eventPerformer = new EventPerformer(orderPerformer);
			this.eventPerformer.setDogfightView(this);
			
			
			
			this.gameFrame = new GameFrame(title, performer, graphicsBuilder, observable);
			this.gameFrame.setDogfightView(this);
			//(String title, IEventPerformer performer)
		
	}
	
	public void run(){
		
	}
	
	public String displayMessage(String message){
		return message;
		
	}
	
	public void closeAll(){
		
	}

}

