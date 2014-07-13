package GenericGameStudios.GenericRandomGame.Items.Items;

import GenericGameStudios.GenericRandomGame.Items.EquipableItem;
import GenericGameStudios.GenericRandomGame.Items.EquipableItemType;
import GenericGameStudios.GenericRandomGame.Items.Rarity;

public class Item_TheBreaker extends EquipableItem{

	public Item_TheBreaker() {
		super("TheBreaker");
		this.setDescription("It breaks, when it breaks!");
		this.setMax_Stack_Count(1);
		this.setRarity(Rarity.Well);
		this.getStats().setPhysique(2);
		this.setType(EquipableItemType.Two_Handed_Melee_Weapon);
	}
	
}
