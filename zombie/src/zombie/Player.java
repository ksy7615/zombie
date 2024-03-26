package zombie;

public class Player extends Unit {
	private int sword;
	private int potion;

	public Player(int position, int hp, int attackMax, int potion) {
		super(position, hp, attackMax);
		this.potion = potion;
	}

	@Override
	public void attack(Unit monster) {
		
	}

}
