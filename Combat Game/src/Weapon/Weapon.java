package Weapon;

public abstract class Weapon {
	int attack;
	int defense;
	int speed;
	int stamina;
	String name;
	boolean twohand; // true for two handed weapon, false for one handed weapon
	/**
	 * @return the attack
	 */
	public int getAttack() {
		return this.attack;
	}
	/**
	 * @return the defense
	 */
	public int getDefense() {
		return this.defense;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return this.speed;
	}
	/**
	 * @return the stamina
	 */
	public int getStamina() {
		return this.stamina;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * @return the twohand
	 */
	public boolean isTwohand() {
		return this.twohand;
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
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param twohand the twohand to set
	 */
	public void setTwohand(boolean twohand) {
		this.twohand = twohand;
	}
}
