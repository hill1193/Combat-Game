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
		
		this.updateAttack(0);
		this.updateDefense(0);
		this.updateSpeed(0);
		this.updateStamina(0);
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

	/** updates the combatant's attack **/
	public void updateAttack(int att) {
		if(this.gear != null) {
			this.setAttack(this.getAttack() + att + this.getBonusAtt());
		}
		else {
			this.setAttack(this.getAttack() + att);
		}
	}
	
	/** updates the combatant's defense **/
	public void updateDefense(int def) {
		if(this.gear != null) {
			this.setDefense(this.getDefense() + def + this.getBonusDef());
		}
		else {
			this.defense = this.getDefense() + def;
		}
	}
	
	/** updates the combatant's speed **/
	public void updateSpeed(int spd) {
		if(this.gear != null) {
			this.setSpeed(this.getSpeed() + spd + this.getBonusSpd());
		}
		else {
			this.speed = this.getSpeed() + spd;
		}
	}
	
	/** updates the combatant's stamina **/
	public void updateStamina(int stam) {
		if(this.gear != null) {
			this.setStamina(this.getStamina() + stam + getBonusStam());
		}
		else {
			this.stamina = this.getStamina() + stam;
		}
	}
	
	/** Sets the combatant's health **/
	public void setHealth() {
		this.health = (this.getStamina() + 1) * 10;
	}
	
	/** Sets the combatant's statpoints **/
	public void setStatpoints(int stat) {
		this.statpoints = stat;
	}
	
	/** updates the combatant's evasion **/
	public void updateEvasion() {
		if(this.gear != null) {
			this.setEvasion(roundTo2Decimals(this.speed * 0.7) + getBonusEva());
		}
		else {
			this.evasion = roundTo2Decimals(this.speed * 0.7);
		}
	}
	
	/** Sets the combatant's gear **/
	public void setGear(Equipment gear) {
		this.gear = gear;
	}
	
	
	/** Obtains the attack added by the combatant's equipment and applies it**/
	public int getBonusAtt() {
		return this.gear.getBonusAtt();
	}
	
	/** Obtains the defense added by the combatant's equipment and applies it**/
	public int getBonusDef() {
		return this.gear.getBonusDef();
	}
	
	/** Obtains the speed added by the combatant's equipment and applies it**/
	public int getBonusSpd() {
		return this.gear.getBonusSpd();
	}
	
	/** Obtains the stamina added by the combatant's equipment and applies it**/
	public int getBonusStam() {
		return this.gear.getBonusStam();
	}
	
	/** Obtains the evasion added by the combatant's equipment and applies it**/
	public double getBonusEva() {
		return this.gear.getBonusEva();
	}
	
	public double roundTo2Decimals(double val) {
        DecimalFormat df2 = new DecimalFormat("###.##");
    return Double.valueOf(df2.format(val));
}
	
	/** Main method **/
	public static void main(String args[]) {
		Combatant newchar = new Combatant();
		Equipment newequip = new Equipment(Helmet.leathercap, Chest.leatherchest, null, null, null, null, null, null, Sword.woodensword, Sword.woodensword);
		newchar.createChar();
		newchar.setGear(newequip);
		System.out.println("Character Created!");
		System.out.println("Name: " + newchar.getName());
		System.out.println("Attack: " + newchar.getAttack());
		System.out.println("Defense:  " + newchar.getDefense());
		System.out.println("Speed: " + newchar.getSpeed());
		System.out.println("Stamina: " + newchar.getStamina());
		System.out.println("Health: " + newchar.getHealth());
		System.out.println("Evasion: " + newchar.getEvasion());
		System.out.println("Statpoints: " + newchar.getStatpoints());
	}
}

