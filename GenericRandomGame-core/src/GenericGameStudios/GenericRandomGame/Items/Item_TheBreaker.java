package GenericGameStudios.GenericRandomGame.Items;

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
