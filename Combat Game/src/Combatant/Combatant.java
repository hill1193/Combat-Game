package Combatant;
import java.util.Scanner;


public class Combatant {
	String name;
	int attack;
	int defense;
	int speed;
	int statpoints;
	int stamina;
	Equipment gear;
	
	public Combatant() {
		this.name = "";
		this.attack = 0;
		this.defense = 0;
		this.speed = 0;
		this.statpoints = 10;
		this.stamina = 10;
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
	
	/** Creates a new combatant by giving a name to the character **/
	public void createNewCombatant() {
		System.out.println("Name: ");
		try(Scanner scan = new Scanner(System.in)) {
			String charname = scan.nextLine();
		
			Combatant newchar = new Combatant();
			newchar.name = charname;
			newchar.allocateAttack();
		}
	}
	
	/** Gives the new character a name **/
	
	/** Allocates attack points based on user input and then moves on to defense **/
	public void allocateAttack() {
		System.out.println("Points remaining: " + this.statpoints);
		System.out.println("Attack: ");
		try(Scanner scan = new Scanner(System.in)) {
			int att = scan.nextInt();
			if(att > this.statpoints) {
				System.out.println("Not enough stat points!");
				this.allocateAttack();					
				}
			else {
				this.attack += att;
				this.statpoints -= att;
				this.allocateDefense();
			}
		}
	}
	
	/** Allocates defense points based on user input and then moves on to speed **/
	public void allocateDefense() {
		System.out.println("Points remaining: " + this.statpoints);
		System.out.println("Defense: ");
		try(Scanner scan = new Scanner(System.in)) {
			int def = scan.nextInt();
			if(def > this.statpoints) {
				System.out.println("Not enough stat points!");
				this.allocateDefense();					
				}
			else {
				this.defense += def;
				this.statpoints -= def;
				this.allocateSpeed();
			}
		}
	}
	
	/** Allocates speed points based on user input and then moves on to stamina **/
	public void allocateSpeed() {
		System.out.println("Points remaining: " + this.statpoints);
		System.out.println("Speed: ");
		try(Scanner scan = new Scanner(System.in)) {
			int spd = scan.nextInt();
			if(spd > this.statpoints) {
				System.out.println("Not enough stat points!");
				this.allocateSpeed();					
				}
			else {
				this.speed += spd;
				this.statpoints -= spd;
				this.allocateStamina();
			}
		}
	}
	
	/** Allocates stamina points based on user input **/
	public void allocateStamina() {
		System.out.println("Points remaining: " + this.statpoints);
		System.out.println("Stamina: ");
		try(Scanner scan = new Scanner(System.in)) {
			int stam = scan.nextInt();
			if(stam > this.statpoints) {
				System.out.println("Not enough stat points!");
				this.allocateStamina();					
				}
			else {
				this.stamina += stam;
				this.statpoints -= stam;
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
	
	/** Gets the combatant's statpoints **/
	public int getStatpoints() {
		return this.statpoints;
	}
	
	/** Gets the combatant's name **/
	public String getName() {
		return this.name;
	}
	
	/** Gets the combatant's gear **/
	public Equipment getEquipment() {
		return this.gear;
	}
	
	/** Obtains the stats added by the combatant's equipment and applies them**/
	public void getBonuses() {
		int bonusatt = this.gear.getBonusAtt();
		int bonusdef = this.gear.getBonusDef();
		int bonusspd = this.gear.getBonusSpd();
		int bonusstam = this.gear.getBonusStam();
		
		this.attack = this.getAttack() + bonusatt;
		this.defense = this.getDefense() + bonusdef;
		this.speed = this.getSpeed() + bonusspd;
		this.stamina = this.getStamina() + bonusstam;
	}
	
	/** Main method **/
	public static void main(String args[]) {
		Combatant testchar = new Combatant();
		testchar.createNewCombatant();
		
		System.out.println(testchar.getName());
		System.out.println(testchar.getAttack());
		System.out.println(testchar.getDefense());
		System.out.println(testchar.getSpeed());
		System.out.println(testchar.getStamina());
		System.out.println(testchar.getStatpoints());

	}
	}

