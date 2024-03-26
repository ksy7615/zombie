package zombie;

public class Boss extends Zombie {
	private int shield;

	public Boss(int position, int hp, int attackMax, int shield) {
		super(position, hp, attackMax);
		this.shield = shield;
	}

}
