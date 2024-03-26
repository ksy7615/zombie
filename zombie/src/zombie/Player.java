package zombie;

public class Player extends Unit {
	private int potion;

	public Player(int position, int hp, int attackMax, int potion) {
		super(position, hp, attackMax);
		this.potion = potion;
	}

	@Override
	void attack(Unit unit) {
		
	}

}
