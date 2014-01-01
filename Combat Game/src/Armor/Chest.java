package Armor;

public class Chest extends Armor {
	
	public Chest(int attack, int defense, int speed, int stamina, String name) {
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.stamina = stamina;
		this.name = name;
	}
	
	public static final Armor leatherchest = new Chest(0, 1, 1, 1, "Leather Chest");
}
