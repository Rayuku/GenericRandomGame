package GenericGameStudios.GenericRandomGame.Items;

public abstract class Potion extends Food{

	public Statistic stats;
	
	public Potion(String name) {
		super(name);
	}

	public Statistic getStats() {
		return stats;
	}

	public void setStats(Statistic stats) {
		this.stats = stats;
	}
}
