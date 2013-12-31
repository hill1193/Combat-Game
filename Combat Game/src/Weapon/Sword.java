package Weapon;

public class Sword extends Weapon {
	public Sword(int attack, int defense, int speed, int stamina, String name, boolean twohand) {
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.stamina = stamina;
		this.name = name;
		this.twohand = twohand;
	}
	
	static final Weapon woodensword = new Sword(1, 0, 0, 0, "Wooden Sword", false);
	static final Weapon woodenbroadsword = new Sword(2, 0, 0, 0, "Wooden Broadsword", true);
}
