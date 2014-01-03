package Armor;

public class Finger extends Armor {

	public Finger(int attack, int defense, int speed, int stamina, String name) {
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.stamina = stamina;
		this.name = name;
	}
	
	public static final Armor empty = new Finger(0, 0, 0, 0, "Empty");
}
