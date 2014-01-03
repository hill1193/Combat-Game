package Combatant;
import java.text.DecimalFormat;
import java.util.Scanner;
import Weapon.*;
import Armor.*;


public class Combatant {
	private String name;
	private int attack;
	private int defense;
	private int speed;
	private int statpoints;
	private int stamina;
	private int health;
	private double evasion;
	private Equipment gear;
	
	public Combatant() {
		this.name = "";
		this.attack = 0;
		this.defense = 0;
		this.speed = 0;
		this.statpoints = 15;
		this.stamina = 0;
		this.gear = null;
	}
	
	public Combatant(String name, int attack, int defense, int speed, int statpoints, int stamina, Equipment gear) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.statpoints = statpoints;
		this.stamina = stamina;
		this.gear = gear;
	}
	
	/** Character creation method **/
	public void createChar() {
		Scanner scan = new Scanner(System.in);
		this.giveName(scan);
		this.giveAttack(scan);
		this.giveDefense(scan);
		this.giveSpeed(scan);
		this.giveStamina(scan);
		this.setHealth();
		this.setEvasion(0);
		
		scan.close();
	}

	
	/** Character naming method **/
	public void giveName(Scanner scan) {
		System.out.printf("Name: ");
		String name = scan.nextLine();
		this.setName(name);
		System.out.println("");
		}
	
	/** Attack allocation method **/
	public void giveAttack(Scanner scan) {
		if(this.statpoints > 0) {
			
			System.out.printf("Statpoints Remaining: " + this.getStatpoints() + "\n");
			System.out.printf("Current Attack: " + this.getAttack() + "\n");
			System.out.printf("Add Attack: ");
			int att = scan.nextInt();
			if(att > this.getStatpoints()) {
				System.out.println("Not enough statpoints! Try again.");
				System.out.println("");
				this.giveAttack(new Scanner(System.in));
			}
			else {
				this.setAttack(this.getAttack() + att);
				this.setStatpoints(this.getStatpoints() - att);
				System.out.println("");
			}
		}
	}
	
	/** Defense allocation method **/
	public void giveDefense(Scanner scan) {
		if(this.statpoints > 0) {
			
			System.out.printf("Statpoints Remaining: " + this.getStatpoints() + "\n");
			System.out.printf("Current Defense: " + this.getDefense() + "\n");
			System.out.printf("Add Defense: ");
			int def = scan.nextInt();
			if(def > this.getStatpoints()) {
				System.out.println("Not enough statpoints! Try again.");
				System.out.println("");
				this.giveDefense(new Scanner(System.in));
			}
			else {
				this.setDefense(this.getDefense() + def);
				this.setStatpoints(this.getStatpoints() - def);
				System.out.println("");
			}
		}
	}
	
	/** speed allocation method **/
	public void giveSpeed(Scanner scan) {
		if(this.statpoints > 0) {
			
			System.out.printf("Statpoints Remaining: " + this.getStatpoints() + "\n");
			System.out.printf("Current Speed: " + this.getSpeed() + "\n");
			System.out.printf("Add Speed: ");
			int spd = scan.nextInt();
			if(spd > this.getStatpoints()) {
				System.out.println("Not enough statpoints! Try again.");
				System.out.println("");
				this.giveSpeed(new Scanner(System.in));
			}
			else {
				this.setSpeed(this.getSpeed() + spd);
				this.setStatpoints(this.getStatpoints() - spd);
				System.out.println("");
			}
		}
	}
	
	/** stamina allocation method **/
	public void giveStamina(Scanner scan) {
		if(this.statpoints > 0) {
			
			System.out.printf("Statpoints Remaining: " + this.getStatpoints() + "\n");
			System.out.printf("Current Stamina: " + this.getStamina() + "\n");
			System.out.printf("Add Stamina: ");
			int stam = scan.nextInt();
			if(stam > this.getStatpoints()) {
				System.out.println("Not enough statpoints! Try again.");
				System.out.println("");
				this.giveStamina(new Scanner(System.in));
			}
			else {
				this.setStamina(this.getStamina() + stam);
				this.setStatpoints(this.getStatpoints() - stam);
				System.out.println("");
			}
		}
	}
	
	/** Gets the combatant's attack **/
	public int getAttack() {
		return this.attack;
	}
	
	/** Gets the combatant's defense **/
	public int getDefense() {
		return this.defense;
	}
	
	/** Gets the combatant's speed **/
	public int getSpeed() {
		return this.speed;
	}
	
	/** Gets the combatant's stamina **/
	public int getStamina() {
		return this.stamina;
	}
	
	/** Gets the combatant's health **/
	public int getHealth() {
		return this.health;
	}
	
	/** Gets the combatant's statpoints **/
	public int getStatpoints() {
		return this.statpoints;
	}
	
	/** Gets the combatant's evasion **/
	public double getEvasion() {
		return this.evasion;
	}
	
	/** Gets the combatant's name **/
	public String getName() {
		return this.name;
	}
	
	/** Gets the combatant's gear **/
	public Equipment getEquipment() {
		return this.gear;
	}
	
	
	/** Sets the combatant's name **/
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @param stamina the stamina to set
	 */
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/** Sets the combatant's evasion **/
	public void setEvasion(double eva) {
		this.evasion = roundTo2Decimals(this.getSpeed() * 0.7 + eva);
	}
	
	/** Sets the combatant's health **/
	public void setHealth() {
		this.health = (this.getStamina() + 1) * 10;
	}
	
	/** Sets the combatant's statpoints **/
	public void setStatpoints(int stat) {
		this.statpoints = stat;
	}
	
	/** Sets the combatant's gear **/
	public void setGear(Equipment gear) {
		this.gear = gear;
		this.getBonusAtt();
		this.getBonusDef();
		this.getBonusStam();
		this.getBonusEva();
		this.getBonusSpd();
	}
	
	
	/** Obtains the attack added by the combatant's equipment and applies it**/
	public void getBonusAtt() {
		this.setAttack(this.getAttack() + this.gear.getBonusAtt());
	}
	
	/** Obtains the defense added by the combatant's equipment and applies it**/
	public void getBonusDef() {
		this.setDefense(this.getDefense() + this.gear.getBonusDef());
	}
	
	/** Obtains the speed added by the combatant's equipment and applies it**/
	public void getBonusSpd() {
		this.setSpeed(this.getSpeed() + this.gear.getBonusSpd());
	}
	
	/** Obtains the stamina added by the combatant's equipment and applies it**/
	public void getBonusStam() {
		this.setStamina(this.getStamina() + this.gear.getBonusStam());
	}
	
	/** Obtains the evasion added by the combatant's equipment and applies it**/
	public void getBonusEva() {
		this.setEvasion(this.getEvasion() + this.gear.getBonusEva());
	}
	
	public double roundTo2Decimals(double val) {
        DecimalFormat df2 = new DecimalFormat("###.##");
    return Double.valueOf(df2.format(val));
}
	
	public void displayStats() {
		System.out.println("Name: " + this.getName());
		System.out.println("Attack: " + this.getAttack());
		System.out.println("Defense:  " + this.getDefense());
		System.out.println("Speed: " + this.getSpeed());
		System.out.println("Stamina: " + this.getStamina());
		System.out.println("Health: " + this.getHealth());
		System.out.println("Evasion: " + this.getEvasion());
		System.out.println("Statpoints: " + this.getStatpoints());
	}
	
	/** Main method **/
	public static void main(String args[]) {
		Combatant newchar = new Combatant();
		Equipment newequip = new Equipment(Helmet.leathercap, Chest.leatherchest, Wrist.empty, Hand.empty, Leg.empty, Feet.empty, Neck.empty, Finger.empty, Sword.woodensword, Sword.woodensword);
		newchar.createChar();
		newchar.setGear(newequip);
		newchar.displayStats();
		
	}
}

