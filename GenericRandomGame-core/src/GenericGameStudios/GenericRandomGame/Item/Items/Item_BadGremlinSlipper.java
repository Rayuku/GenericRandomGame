package GenericGameStudios.GenericRandomGame.Item.Items;

import GenericGameStudios.GenericRandomGame.Item.EquipableItem;
import GenericGameStudios.GenericRandomGame.Item.EquipableItemType;
import GenericGameStudios.GenericRandomGame.Item.Rarity;

public class Item_BadGremlinSlipper extends EquipableItem{

	public Item_BadGremlinSlipper() {
		super("BadGremlinSlipper");
		this.setDescription("");
		this.setMax_Stack_Count(2);
		this.setRarity(Rarity.Not_so_good);
		this.getStats().setAgility(2);
		this.setType(EquipableItemType.Boot);
	}

}
