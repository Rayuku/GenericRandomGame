package GenericGameStudios.GenericRandomGame.Items;

public abstract class NonEquipableItem extends Item{

	private String effect;
	
	public NonEquipableItem(String name) {
		super(name);
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}
}
