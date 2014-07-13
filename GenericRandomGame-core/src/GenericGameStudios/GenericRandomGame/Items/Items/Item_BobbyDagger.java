package GenericGameStudios.GenericRandomGame.Items.Items;

import GenericGameStudios.GenericRandomGame.Items.EquipableItem;
import GenericGameStudios.GenericRandomGame.Items.EquipableItemType;
import GenericGameStudios.GenericRandomGame.Items.Rarity;

public class Item_BobbyDagger extends EquipableItem{

	public Item_BobbyDagger() {
		super("BobbyDagger");
		this.setDescription("Dag it if u can");
		this.setMax_Stack_Count(1);
		this.setRarity(Rarity.Well);
		this.getStats().setPhysique(1);
		this.setType(EquipableItemType.One_Handed_Melee_Weapon);
	}

}
