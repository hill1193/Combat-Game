package Armor;

public abstract class Armor {
	int attack;
	int defense;
	int speed;
	int stamina;
	double evasion;
	String name;
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
	 * @return the evasion
	 */
	public double getEvasion() {
		return this.evasion;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
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
	 * @param eva the evasion to set
	 */
	public void setEvasion(double eva) {
		this.evasion = eva;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}	
}
