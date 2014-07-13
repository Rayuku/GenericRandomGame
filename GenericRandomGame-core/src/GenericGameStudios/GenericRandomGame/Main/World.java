package GenericGameStudios.GenericRandomGame.Main;

import java.awt.Point;
import java.util.ArrayList;

import GenericGameStudios.GenericRandomGame.Item.Item;

public class World {

	private Player player;
	private ArrayList<Point> item_Positions;
	private ArrayList<Item> items;
	
	public World(){
		item_Positions = new ArrayList<Point>();
		items = new ArrayList<Item>();
	}
	
	public void spawnItem(Point point, Item item){
		item_Positions.add(point);
		items.add(item);
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public ArrayList<Point> getItem_Positions() {
		return item_Positions;
	}

	public void setItem_Positions(ArrayList<Point> item_Positions) {
		this.item_Positions = item_Positions;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}
