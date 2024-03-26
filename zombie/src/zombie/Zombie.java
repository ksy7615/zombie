package zombie;

public class Zombie extends Unit {
	private int bite;

	public Zombie(int position, int hp, int attackMax) {
		super(position, hp, attackMax);
	}

	@Override
	public void attack(Unit player) {
		
	}

}
