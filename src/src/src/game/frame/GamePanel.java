package src.game.frame;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer{

	protected IGraphicsBuilder igraphicsBuilder;
	
	public GamePanel(IGraphicsBuilder graphicsBuilder){	
	}

	public IGraphicsBuilder getIGraphicsBuilder() {
		return igraphicsBuilder;
	}

	public void setIGraphicsBuilder(IGraphicsBuilder igraphicsBuilder) {
		this.igraphicsBuilder = igraphicsBuilder;
		igraphicsBuilder.setGamePanel(this);
	}
	
	public void painComponent(Graphics graphics){
		
	}

	@Override
	public void update(Observable observable, Object arg) {
		// TODO Auto-generated method stub
		
	}

	
}
