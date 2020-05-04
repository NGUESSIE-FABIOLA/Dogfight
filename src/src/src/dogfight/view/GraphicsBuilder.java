package src.dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import src.game.frame.GamePanel;
import src.game.frame.IGraphicsBuilder;
import src.jpu2016.dogfight.model.IDogfightModel;
import src.jpu2016.dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder{

	public int Width;
	public int Height;
	//protected IDoghtFightModel dogfightModel;
	protected IDogfightModel idogfigthModel;
	
	public GraphicsBuilder(IDogfightModel idogfightModel){
		
		/*this.dogfightModel = new IDogfightModel();
		this.dogfightModel.setGraphicsBuilder(this);*/
	
			this.idogfigthModel.setGraphicsBuilder(this);
		
		
	}
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer){
		
	}
	
	private void buildEmptySky(){
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){
		
	}

	public int getWidth() {
		return Width;
	}

	public int getHeight() {
		return Height;
	}

	public void setDogfightView(DogfightView dogfightView) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGamePanel(GamePanel gamePanel) {
		// TODO Auto-generated method stub
		
	}

	

	
	
	
}

	
	
	

