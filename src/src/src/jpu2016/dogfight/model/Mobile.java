package src.jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

import javax.swing.text.Position;

public class Mobile implements IMobile {
	
	protected Dimension dimension;
	protected Direction direction;
	protected Position position ;
	
	
	
	
public  Mobile(Direction direction , Position position , Dimension dimension , int speed , String image){
	
}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	public void moveRight() {
		
	}
	
	public void moveUp() {
		
	}
	public void moveDown() {
	
}
	public void moveLeft() {
	
}
	
	public Color getColor(){
		return null;
		
	}
	
	

	@Override
	public void PlaceInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public DogfightModel getDogfightModel() {
		return null;
	
		
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

}
