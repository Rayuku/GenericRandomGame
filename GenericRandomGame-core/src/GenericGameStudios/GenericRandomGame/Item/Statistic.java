package GenericGameStudios.GenericRandomGame.Item;

public class Statistic {
	private int physique;
	private int health;
	private int toughness;
	private int block;
	private int speed;
	private int accuracy;
	private int agility;
	private int will;
	private int mana;
	private int crit;
	
	public Statistic(){	
	}
	
	public void addPhysique(int physique){
		this.physique += physique;
	}
	
	public void addHealth(int health){
		this.health += health;
	}
	
	public void addToughness(int toughness){
		this.toughness += toughness;
	}
	
	public void addBlock(int block){
		this.block += block;
	}
	
	public void addSpeed(int speed){
		this.speed += speed;
	}
	
	public void addAccurace(int accuracy){
		this.accuracy += accuracy;
	}
	
	public void addAgility(int agility){
		this.agility += agility;
	}
	
	public void addWill(int will){
		this.will += will;
	}
	
	public void addMana(int mana){
		this.mana += mana;
	}
	
	public void addCrit(int crit){
		this.crit += crit;
	}

	public int getPhysique() {
		return physique;
	}

	public int getHealth() {
		return health;
	}

	public int getToughness() {
		return toughness;
	}

	public int getBlock() {
		return block;
	}

	public int getSpeed() {
		return speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public int getAgility() {
		return agility;
	}

	public int getWill() {
		return will;
	}

	public int getMana() {
		return mana;
	}

	public int getCrit() {
		return crit;
	}

	public void setPhysique(int physique) {
		this.physique = physique;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setToughness(int toughness) {
		this.toughness = toughness;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public void setWill(int will) {
		this.will = will;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public void setCrit(int crit) {
		this.crit = crit;
	}
}
