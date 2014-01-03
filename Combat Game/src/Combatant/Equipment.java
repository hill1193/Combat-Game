package Combatant;
import Armor.*;
import Weapon.*;

public class Equipment {
	Armor head;
	Armor chest;
	Armor wrist;
	Armor hand;
	Armor leg;
	Armor feet;
	Armor neck;
	Armor finger;
	Weapon mainhand;
	Weapon offhand;
	
	public Equipment(Armor head, Armor chest, Armor wrist, Armor hand, Armor leg, Armor feet, Armor neck, Armor finger, Weapon mainhand, Weapon offhand) {
		this.head = head;
		this.chest = chest;
		this.wrist = wrist;
		this.hand = hand;
		this.leg = leg;
		this.feet = feet;
		this.neck = neck;
		this.finger = finger;
		this.mainhand = mainhand;
		this.offhand = offhand;
	}

	/**
	 * @return the head
	 */
	public Armor getHead() {
		return head;
	}

	/**
	 * @return the chest
	 */
	public Armor getChest() {
		return chest;
	}

	/**
	 * @return the wrist
	 */
	public Armor getWrist() {
		return wrist;
	}

	/**
	 * @return the hand
	 */
	public Armor getHand() {
		return hand;
	}

	/**
	 * @return the leg
	 */
	public Armor getLeg() {
		return leg;
	}

	/**
	 * @return the feet
	 */
	public Armor getFeet() {
		return feet;
	}

	/**
	 * @return the neck
	 */
	public Armor getNeck() {
		return neck;
	}

	/**
	 * @return the finger
	 */
	public Armor getFinger() {
		return finger;
	}

	/**
	 * @return the mainhand
	 */
	public Weapon getMainhand() {
		return mainhand;
	}

	/**
	 * @return the offhand
	 */
	public Weapon getOffhand() {
		return offhand;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Armor head) {
		this.head = head;
	}

	/**
	 * @param chest the chest to set
	 */
	public void setChest(Armor chest) {
		this.chest = chest;
	}

	/**
	 * @param wrist the wrist to set
	 */
	public void setWrist(Armor wrist) {
		this.wrist = wrist;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(Armor hand) {
		this.hand = hand;
	}

	/**
	 * @param leg the leg to set
	 */
	public void setLeg(Armor leg) {
		this.leg = leg;
	}

	/**
	 * @param feet the feet to set
	 */
	public void setFeet(Armor feet) {
		this.feet = feet;
	}

	/**
	 * @param neck the neck to set
	 */
	public void setNeck(Armor neck) {
		this.neck = neck;
	}

	/**
	 * @param finger the finger to set
	 */
	public void setFinger(Armor finger) {
		this.finger = finger;
	}

	/**
	 * @param mainhand the mainhand to set
	 */
	public void setMainhand(Weapon mainhand) {
		this.mainhand = mainhand;
	}

	/**
	 * @param offhand the offhand to set
	 */
	public void setOffhand(Weapon offhand) {
		this.offhand = offhand;
	}
	
	/** Calculates the bonus attack of the equipment **/
	int getBonusAtt() {
		int att = 0;
		att += this.head.getAttack();
		att += this.chest.getAttack();
		att += this.wrist.getAttack();
		att += this.hand.getAttack();
		att += this.leg.getAttack();
		att += this.feet.getAttack();
		att += this.neck.getAttack();
		att += this.finger.getAttack();
		att += this.offhand.getAttack();
		att += this.mainhand.getAttack();
		
		return att;
	}
	
	/** Calculates the bonus defense of the equipment **/
	int getBonusDef() {
		int def = 0;
		def += this.head.getDefense();
		def += this.chest.getDefense();
		def += this.wrist.getDefense();
		def += this.hand.getDefense();
		def += this.leg.getDefense();
		def += this.feet.getDefense();
		def += this.neck.getDefense();
		def += this.finger.getDefense();
		def += this.offhand.getDefense();
		def += this.mainhand.getDefense();
		
		return def;
	}
	
	/** Calculates the bonus speed of the equipment **/
	int getBonusSpd() {
		int spd = 0;
		spd += this.head.getSpeed();
		spd += this.chest.getSpeed();
		spd += this.wrist.getSpeed();
		spd += this.hand.getSpeed();
		spd += this.leg.getSpeed();
		spd += this.feet.getSpeed();
		spd += this.neck.getSpeed();
		spd += this.finger.getSpeed();
		spd += this.offhand.getSpeed();
		spd += this.mainhand.getSpeed();
		
		return spd;
	}
	
	/** Calculates the bonus stamina of the equipment **/
	int getBonusStam() {
		int stam = 0;
		stam += this.head.getStamina();
		stam += this.chest.getStamina();
		stam += this.wrist.getStamina();
		stam += this.hand.getStamina();
		stam += this.leg.getStamina();
		stam += this.feet.getStamina();
		stam += this.neck.getStamina();
		stam += this.finger.getStamina();
		stam += this.offhand.getStamina();
		stam += this.mainhand.getStamina();
		
		return stam;
	}
	
	/** Calculates the bonus evasion of the equipment **/
	int getBonusEva() {
		int eva = 0;
		eva += this.head.getEvasion();
		eva += this.chest.getEvasion();
		eva += this.wrist.getEvasion();
		eva += this.hand.getEvasion();
		eva += this.leg.getEvasion();
		eva += this.feet.getEvasion();
		eva += this.neck.getEvasion();
		eva += this.finger.getEvasion();
		
		return eva;
	}	
}
