package GenericGameStudios.GenericRandomGame.Character;

import GenericGameStudios.GenericRandomGame.Item.Item;


public class Slot {
	private Item item;
	private int stack_Count;

	public Item getItem() {
		return item;
	}

	public int getStack_Count() {
		return stack_Count;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public void setStack_Count(int stack_Count) {
		this.stack_Count = stack_Count;
	}
}
