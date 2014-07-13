package GenericGameStudios.GenericRandomGame.Items.Items;

import GenericGameStudios.GenericRandomGame.Items.EquipableItem;
import GenericGameStudios.GenericRandomGame.Items.EquipableItemType;
import GenericGameStudios.GenericRandomGame.Items.Rarity;

public class Item_GremlinSlipper extends EquipableItem{

	public Item_GremlinSlipper() {
		super("GremlinSlipper");
		this.setDescription("");
		this.setMax_Stack_Count(2);
		this.setRarity(Rarity.Well);
		this.getStats().setAgility(1);
		this.setType(EquipableItemType.Boot);
	}

}
