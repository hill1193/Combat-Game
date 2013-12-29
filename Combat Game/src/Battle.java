
public class Battle {
	Combatant char1;
	Combatant char2;
	boolean dead1;
	boolean dead2;
	boolean turn;  // true for player 1, false for player 2
	boolean firstturn;
	
	public Battle(Combatant char1, Combatant char2) {
		this.char1 = char1;
		this.char2 = char2;
		this.dead1 = false;
		this.dead2 = false;
		this.turn = true;
		this.firstturn = true;
	}
		
	public void turninit() {
			if(this.char1.speed > this.char2.speed) {
				System.out.println("Player 1's turn");
				this.turn = true;
			}
			else if(this.char1.speed < this.char2.speed) {
				System.out.println("Player 2's turn");
				this.turn = false;
			}
		this.turn();
	}
	
	public void turn() {
		if (turn = true) {
			int dmg = this.char1.attack - (this.char2.defense/2);
			this.char2.stamina -= dmg;
			if(this.char2.stamina <= 0) {
				System.out.println("Player 2 has been defeated!");
				return;
			}
			else {
				int dmg1 = this.char2.attack - (this.char1.defense/2);
				this.char1.stamina -= dmg1;
				if(this.char1.stamina <= 0) {
					System.out.println("Player 1 has been defeated!");
					return;
			}
				else {
					turninit();
				}
			}
		}
		else {
			int dmg = this.char2.attack - (this.char1.defense/2);
			this.char1.stamina -= dmg;
			if(this.char1.stamina <= 0) {
				System.out.println("Player 1 has been defeated!");
				return;
			}
			else {
				int dmg1 = this.char2.attack - (this.char1.defense/2);
				this.char1.stamina -= dmg1;
				if(this.char1.stamina <= 0) {
					System.out.println("Player 1 has been defeated!");
					return;
			}
				else {
					turninit();
				}
		}
	}
}
	
	public static void main(String args[]) {
		Combatant comb1 = new Combatant("Joe", 5, 30, 3, 0, 20);
		Combatant comb2 = new Combatant("Martin", 10, 5, 3, 0, 20);
		Battle battle = new Battle(comb2, comb1);
		battle.turninit();
}
}

	