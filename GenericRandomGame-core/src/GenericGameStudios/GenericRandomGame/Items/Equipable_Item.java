package GenericGameStudios.GenericRandomGame.Items;

public abstract class Equipable_Item extends Item{

	private Equipable_Item_Type type;
	private Statistic stats;
	
	public Equipable_Item(String name) {
		super(name);
	}

	public Equipable_Item_Type getType() {
		return type;
	}

	public Statistic getStats() {
		return stats;
	}

	public void setType(Equipable_Item_Type type) {
		this.type = type;
	}

	public void setStats(Statistic stats) {
		this.stats = stats;
	}
}
