package src.jpu2016.dogfight.controller;

import src.dogfight.view.IViewSystem;
import src.jpu2016.dogfight.model.IDogfightModel;

public class DogfightController implements IOrderPerformer{
	private final int TIME_SLEEP = 30;
	private IDogfightModel dogfightModel;
	private IViewSystem viewSystem;
	
	public IDogfightModel getIDogfightModel() {
		return dogfightModel;
	}

	
	public DogfightController(IDogfightModel dogfightModel){
		
	}

	public IViewSystem getIViewSystem() {
		return viewSystem;
	}
	
	public void orderPerform(UserOrder userOrder){
		
	}
	
	public void play(){
		
	}
	
	public void setViewSystem(IViewSystem viewSystem){
		
	}
	
	private void lauchMissile(int player){
		
	}
	
	private void gameLoop(){
		
	}
}
