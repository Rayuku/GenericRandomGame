package GenericGameStudios.GenericRandomGame.Character;

public class Character {
	
	private Slot headgear;
	private Slot chest_Protector;
	private Slot bracer_0;
	private Slot bracer_1;
	private Slot gauntlet_0;
	private Slot gauntlet_1;
	private Slot leg_Protection_0;
	private Slot leg_Protection_1;
	private Slot boot_0;
	private Slot boot_1;
	private Slot hand_0;
	private Slot hand_1;
	private Slot secondWeapon;
	private Slot necklance;
	private Slot bangle_0;
	private Slot bangle_1;
	private Slot ring_0;
	private Slot ring_1;
	private Slot charm;
	
	private Inventory inventory;
	
	public Character(){
		headgear = new Slot();
		chest_Protector = new Slot();
		bracer_0 = new Slot();
		bracer_1 = new Slot();
		gauntlet_0 = new Slot();
		gauntlet_1 = new Slot();
		leg_Protection_0 = new Slot();
		leg_Protection_1 = new Slot();
		boot_0 = new Slot();
		boot_1 = new Slot();
		hand_0 = new Slot();
		hand_1 = new Slot();
		secondWeapon = new Slot();
		necklance = new Slot();
		bangle_0 = new Slot();
		bangle_1 = new Slot();
		ring_0 = new Slot();
		ring_1 = new Slot();
	    charm = new Slot();
	    
	    inventory = new Inventory();
	}

	public Slot getHeadgear() {
		return headgear;
	}

	public Slot getChest_Protector() {
		return chest_Protector;
	}

	public Slot getBracer_0() {
		return bracer_0;
	}

	public Slot getBracer_1() {
		return bracer_1;
	}

	public Slot getGauntlet_0() {
		return gauntlet_0;
	}

	public Slot getGauntlet_1() {
		return gauntlet_1;
	}

	public Slot getLeg_Protection_0() {
		return leg_Protection_0;
	}

	public Slot getLeg_Protection_1() {
		return leg_Protection_1;
	}

	public Slot getBoot_0() {
		return boot_0;
	}

	public Slot getBoot_1() {
		return boot_1;
	}

	public Slot getHand_0() {
		return hand_0;
	}

	public Slot getHand_1() {
		return hand_1;
	}

	public Slot getSecondWeapon() {
		return secondWeapon;
	}

	public Slot getNecklance() {
		return necklance;
	}

	public Slot getBangle_0() {
		return bangle_0;
	}

	public Slot getBangle_1() {
		return bangle_1;
	}

	public Slot getRing_0() {
		return ring_0;
	}

	public Slot getRing_1() {
		return ring_1;
	}

	public Slot getCharm() {
		return charm;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setHeadgear(Slot headgear) {
		this.headgear = headgear;
	}

	public void setChest_Protector(Slot chest_Protector) {
		this.chest_Protector = chest_Protector;
	}

	public void setBracer_0(Slot bracer_0) {
		this.bracer_0 = bracer_0;
	}

	public void setBracer_1(Slot bracer_1) {
		this.bracer_1 = bracer_1;
	}

	public void setGauntlet_0(Slot gauntlet_0) {
		this.gauntlet_0 = gauntlet_0;
	}

	public void setGauntlet_1(Slot gauntlet_1) {
		this.gauntlet_1 = gauntlet_1;
	}

	public void setLeg_Protection_0(Slot leg_Protection_0) {
		this.leg_Protection_0 = leg_Protection_0;
	}

	public void setLeg_Protection_1(Slot leg_Protection_1) {
		this.leg_Protection_1 = leg_Protection_1;
	}

	public void setBoot_0(Slot boot_0) {
		this.boot_0 = boot_0;
	}

	public void setBoot_1(Slot boot_1) {
		this.boot_1 = boot_1;
	}

	public void setHand_0(Slot hand_0) {
		this.hand_0 = hand_0;
	}

	public void setHand_1(Slot hand_1) {
		this.hand_1 = hand_1;
	}

	public void setSecondWeapon(Slot secondWeapon) {
		this.secondWeapon = secondWeapon;
	}

	public void setNecklance(Slot necklance) {
		this.necklance = necklance;
	}

	public void setBangle_0(Slot bangle_0) {
		this.bangle_0 = bangle_0;
	}

	public void setBangle_1(Slot bangle_1) {
		this.bangle_1 = bangle_1;
	}

	public void setRing_0(Slot ring_0) {
		this.ring_0 = ring_0;
	}

	public void setRing_1(Slot ring_1) {
		this.ring_1 = ring_1;
	}

	public void setCharm(Slot charm) {
		this.charm = charm;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}
