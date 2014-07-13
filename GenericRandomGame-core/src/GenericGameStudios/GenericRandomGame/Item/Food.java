package GenericGameStudios.GenericRandomGame.Item;

public abstract class Food extends NonEquipableItem{
	
	private long time_period;
	private int healing;
	private int mana_reg;
	
	public Food(String name) {
		super(name);
	}

	public long getTime_period() {
		return time_period;
	}

	public int getHealing() {
		return healing;
	}

	public int getMana_reg() {
		return mana_reg;
	}

	public void setTime_period(long time_period) {
		this.time_period = time_period;
	}

	public void setHealing(int healing) {
		this.healing = healing;
	}

	public void setMana_reg(int mana_reg) {
		this.mana_reg = mana_reg;
	}
}
