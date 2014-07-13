package GenericGameStudios.GenericRandomGame.Items.Items;

import GenericGameStudios.GenericRandomGame.Items.EquipableItem;
import GenericGameStudios.GenericRandomGame.Items.EquipableItemType;
import GenericGameStudios.GenericRandomGame.Items.Rarity;

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
