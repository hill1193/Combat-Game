package Armor;

public class Neck extends Armor {

	public Neck(int attack, int defense, int speed, int stamina, String name) {
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.stamina = stamina;
		this.name = name;
	}
	
	public static final Armor empty = new Neck(0, 0, 0, 0, "Empty");
}
