package GenericGameStudios.GenericRandomGame.Items;

public abstract class EquipableItem extends Item{

	private EquipableItemType type;
	private Statistic stats;
	
	public EquipableItem(String name) {
		super(name);
		stats = new Statistic();
	}

	public EquipableItemType getType() {
		return type;
	}

	public Statistic getStats() {
		return stats;
	}

	public void setType(EquipableItemType type) {
		this.type = type;
	}

	public void setStats(Statistic stats) {
		this.stats = stats;
	}
}
