package Armor;

public class Helmet extends Armor {

	public Helmet(int attack, int defense, int speed, int stamina, String name) {
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.stamina = stamina;
		this.name = name;
	}
	
	public static final Armor leathercap = new Helmet(0, 1, 1, 1, "Leather Cap");
}
