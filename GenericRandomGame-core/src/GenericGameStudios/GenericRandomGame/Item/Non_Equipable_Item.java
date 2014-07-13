package GenericGameStudios.GenericRandomGame.Item;

public abstract class Non_Equipable_Item extends Item{

	private String effect;
	
	public Non_Equipable_Item(String name) {
		super(name);
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}
}
