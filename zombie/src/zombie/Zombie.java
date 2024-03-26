package zombie;

public class Zombie extends Unit {
	private int bite;

	public Zombie(int position, int hp, int attackMax) {
		// 위치 / hp / 최대 공격력 >> 설정은 게임에서
		super(position, hp, attackMax);
	}

	@Override
	public void attack(Unit player) {
		bite = random.nextInt(attackMax)+1;
		
	}

}
