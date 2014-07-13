package GenericGameStudios.GenericRandomGame.Character;

import java.util.ArrayList;

import GenericGameStudios.GenericRandomGame.Item.Item;

public class Inventory {
	private ArrayList<Slot> slots;
	
	public Inventory(){	
		slots = new ArrayList<Slot>();
		
		for(int i = 0; i < 12; i++)
			slots.add(new Slot());
	}
	
	public boolean insert_Into_Inventory(Item item){
		for(Slot slot : slots){
			if(slot.getItem() == item && slot.getStack_Count() < item.getMax_Stack_Count()){
				slot.setStack_Count(slot.getStack_Count()+1);
				return true;
			}
		}
		for(Slot slot : slots){
			if(slot.getItem() == null){
				slot.setItem(item);
				slot.setStack_Count(1);
				return true;
			}
		}
		return false;
	}
	
	public Item get_Item_In_Slot(int slotNumber){
		return slots.get(slotNumber).getItem();
	}

	public ArrayList<Slot> getSlots() {
		return slots;
	}

	public void setSlots(ArrayList<Slot> slots) {
		this.slots = slots;
	}
}
