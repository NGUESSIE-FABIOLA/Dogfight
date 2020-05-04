package src.jpu2016.dogfight.controller;

public abstract class UserOrder implements IUserOrder {
	private int player;
	
	public UserOrder (int player, Order order){
		
	}
	
	public Order getOrder() {
		return null;
		
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

}