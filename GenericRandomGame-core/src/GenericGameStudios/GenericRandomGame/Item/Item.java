package GenericGameStudios.GenericRandomGame.Item;

public abstract class Item {
	private String name;
	private Rarity rarity;
	private String description;
	private int max_Stack_Count;
	
	public Item(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Rarity getRarity() {
		return rarity;
	}

	public String getDescription() {
		return description;
	}

	public int getMax_Stack_Count() {
		return max_Stack_Count;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRarity(Rarity rarity) {
		this.rarity = rarity;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMax_Stack_Count(int max_Stack_Count) {
		this.max_Stack_Count = max_Stack_Count;
	}
}
