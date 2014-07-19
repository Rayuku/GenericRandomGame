package GenericGameStudios.GenericRandomGame.Main;

import java.awt.Point;
import java.util.ArrayList;

import GenericGameStudios.GenericRandomGame.Item.EquipableItem;
import GenericGameStudios.GenericRandomGame.Item.EquipableItemType;
import GenericGameStudios.GenericRandomGame.Item.Food;
import GenericGameStudios.GenericRandomGame.Item.Item;
import GenericGameStudios.GenericRandomGame.Item.Potion;
import GenericGameStudios.GenericRandomGame.Item.Statistic;
import GenericGameStudios.GenericRandomGame.Character.Character;
import GenericGameStudios.GenericRandomGame.Main.World;

import com.badlogic.gdx.math.Circle;

public class Player {
	
	private World world;
	private Point position;
	private Character character;
	private ArrayList<Statistic> statistics;
	
	private Statistic statistic;
	
	private int x_Pos,y_Pos;
	
	private int currentHealth;
	private int currentMana;
	
	public Player(){
		position = new Point();
		character = new Character();
		statistics = new ArrayList<Statistic>();
		
		statistic = new Statistic();
		update_Statistic();
		
		currentHealth = statistic.getHealth();
		currentMana = statistic.getMana();
	}
	
	/**
	 * Checks if one or more Items are in a 30 px radius around the player
	 * and packs the item/s into the players inventory.
	 */
	
	public void pickup_Item(){
		ArrayList<Point> tmp_Point = new ArrayList<Point>();
		ArrayList<Item> tmp_Item = new ArrayList<Item>();
		Circle circle = new Circle(position.x,position.y,30);
		for(int i = 0; i < world.getItem_Positions().size(); i++){
			Point p = world.getItem_Positions().get(i);
			if(circle.contains(p.x, p.y))
				if(character.getInventory().insert_Into_Inventory(world.getItems().get(i))){
					tmp_Point.add(p);
					tmp_Item.add(world.getItems().get(i));
				}
		}
		world.getItem_Positions().removeAll(tmp_Point);
		world.getItems().removeAll(tmp_Item);
		circle = null;
	}
	
	public void drop_Item(Item item){
		world.spawnItem(position, item);
	}
	
	public boolean equip_Item(EquipableItem e_item, int slotId){
		Item item;
		 switch(slotId){
		 case 1:
			 if(e_item.getType() == EquipableItemType.Headgear){
				 if((item = character.getHeadgear().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getHeadgear().setItem(e_item);
				 return true;
			 }
			 break;
		 case 2:
			 if(e_item.getType() == EquipableItemType.Chest_Protector){
				 if((item = character.getChest_Protector().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getChest_Protector().setItem(e_item);
				 return true;
			 }
			 break;
		 case 3:
			 if(e_item.getType() == EquipableItemType.Bracer){
				 if((item = character.getBracer_0().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getBracer_0().setItem(e_item);
				 return true;
			 }
			 break;
		 case 4:
			 if(e_item.getType() == EquipableItemType.Bracer){
				 if((item = character.getBracer_1().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getBracer_1().setItem(e_item);
				 return true;
			 }
			 break;
		 case 5:
			 if(e_item.getType() == EquipableItemType.Gauntlet){
				 if((item = character.getGauntlet_0().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getGauntlet_0().setItem(e_item);
				 return true;
			 }
			 break;
		 case 6:
			 if(e_item.getType() == EquipableItemType.Gauntlet){
				 if((item = character.getGauntlet_1().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getGauntlet_1().setItem(e_item);
				 return true;
			 }
			 break;
		 case 7:
			 if(e_item.getType() == EquipableItemType.Leg_Protection){
				 if((item = character.getLeg_Protection_0().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getLeg_Protection_0().setItem(e_item);
				 return true;
			 }
			 break;
		 case 8:
			 if(e_item.getType() == EquipableItemType.Leg_Protection){
				 if((item = character.getLeg_Protection_1().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getLeg_Protection_1().setItem(e_item);
				 return true;
			 }
			 break;
		 case 9:
			 if(e_item.getType() == EquipableItemType.Boot){
				 if((item = character.getBoot_0().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getBoot_0().setItem(e_item);
				 return true;
			 }
			 break;
		 case 10:
			 if(e_item.getType() == EquipableItemType.Boot){
				 if((item = character.getBoot_1().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getBoot_1().setItem(e_item);
				 return true;
			 }
			 break;
		 case 11:
			 if(e_item.getType() == EquipableItemType.One_Handed_Melee_Weapon || e_item.getType() == EquipableItemType.One_Handed_Ranged_Weapon){
				 if((item = character.getHand_0().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 if((item = character.getHand_1().getItem()) != null && 
						 (((EquipableItem)(item)).getType() == EquipableItemType.Two_Handed_Melee_Weapon ||
						 ((EquipableItem)(item)).getType() == EquipableItemType.Two_Handed_Ranged_Weapon)){
					 insert_Into_Inventory_Or_Drop(item);
					 character.getHand_1().setItem(null);
				 }	
				 character.getHand_0().setItem(e_item);
				 return true;
			 }else if(e_item.getType() == EquipableItemType.Two_Handed_Melee_Weapon || e_item.getType() == EquipableItemType.Two_Handed_Ranged_Weapon){
				 if((item = character.getHand_0().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 if((item = character.getHand_1().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getHand_0().setItem(e_item);
				 character.getHand_1().setItem(null);
				 return true;
			 }
			 break;
		 case 12:
			 if(e_item.getType() == EquipableItemType.One_Handed_Melee_Weapon || e_item.getType() == EquipableItemType.One_Handed_Ranged_Weapon){
				 if((item = character.getHand_1().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 if((item = character.getHand_0().getItem()) != null &&
						 (((EquipableItem)(item)).getType() == EquipableItemType.Two_Handed_Melee_Weapon ||
						 ((EquipableItem)(item)).getType() == EquipableItemType.Two_Handed_Ranged_Weapon)){
					 insert_Into_Inventory_Or_Drop(item);
					 character.getHand_0().setItem(null);
				 }	
				 character.getHand_1().setItem(e_item);
				 return true;
			 }else if(e_item.getType() == EquipableItemType.Two_Handed_Melee_Weapon || e_item.getType() == EquipableItemType.Two_Handed_Ranged_Weapon){
				 if((item = character.getHand_1().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 if((item = character.getHand_0().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getHand_1().setItem(e_item);
				 character.getHand_0().setItem(null);
				 return true;
			 }
			 break;
		 case 13:
			 if(e_item.getType() == EquipableItemType.One_Handed_Melee_Weapon || 
					 e_item.getType() == EquipableItemType.Two_Handed_Melee_Weapon ||
					 e_item.getType() == EquipableItemType.One_Handed_Ranged_Weapon ||
					 e_item.getType() == EquipableItemType.Two_Handed_Ranged_Weapon){
				 if((item = character.getSecondWeapon().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getSecondWeapon().setItem(e_item);
				 return true;
			 }
		 case 14:
			 if(e_item.getType() == EquipableItemType.Necklace){
				 if((item = character.getNecklance().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getNecklance().setItem(e_item);
				 return true;
			 }
			 break;
		 case 15:
			 if(e_item.getType() == EquipableItemType.Bangle){
				 if((item = character.getBangle_0().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getBangle_0().setItem(e_item);
				 return true;
			 }
			 break;
		 case 16:
			 if(e_item.getType() == EquipableItemType.Bangle){
				 if((item = character.getBangle_1().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getBangle_1().setItem(e_item);
				 return true;
			 }
			 break;
		 case 17:
			 if(e_item.getType() == EquipableItemType.Ring){
				 if((item = character.getRing_0().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getRing_0().setItem(e_item);
				 return true;
			 }
			 break;
		 case 18:
			 if(e_item.getType() == EquipableItemType.Ring){
				 if((item = character.getBangle_1().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getBangle_1().setItem(e_item);
				 return true;
			 }
			 break;
		 case 19:
			 if(e_item.getType() == EquipableItemType.Charm){
				 if((item = character.getCharm().getItem()) != null)
					 insert_Into_Inventory_Or_Drop(item);
				 character.getCharm().setItem(e_item);
				 return true;
			 }
			 break;
		 }
		 return false;
	}
	
	private void insert_Into_Inventory_Or_Drop(Item item){
		if(!character.getInventory().insert_Into_Inventory(item))
			 drop_Item(item);
	}
	
	public void update_Statistic(){
		
		statistic.setAccuracy(0);
		statistic.setAgility(0);
		statistic.setBlock(0);
		statistic.setCrit(0);
		statistic.setHealth(100);
		statistic.setMana(50);
		statistic.setPhysique(0);
		statistic.setSpeed(0);
		statistic.setToughness(0);
		statistic.setWill(0);
		
		for(Statistic stats : statistics){
			statistic.addAccurace(stats.getAccuracy());
			statistic.addAgility(stats.getAgility());
			statistic.addBlock(stats.getBlock());
			statistic.addCrit(stats.getCrit());
			statistic.addHealth(stats.getHealth());
			statistic.addMana(stats.getMana());
			statistic.addPhysique(stats.getPhysique());
			statistic.addSpeed(stats.getSpeed());
			statistic.addToughness(stats.getToughness());
			statistic.addWill(stats.getWill());
		}
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getCurrentMana() {
		return currentMana;
	}

	public void setCurrentMana(int currentMana) {
		this.currentMana = currentMana;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public ArrayList<Statistic> getStatistics() {
		return statistics;
	}

	public void setStatistics(ArrayList<Statistic> statistics) {
		this.statistics = statistics;
	}

	public Statistic getStatistic() {
		return statistic;
	}

	public void setStatistic(Statistic statistic) {
		this.statistic = statistic;
	}
}
