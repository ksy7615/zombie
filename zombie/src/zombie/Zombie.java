package zombie;

public class Zombie extends Unit {
	private int bite;

	public Zombie() {
		// 위치 / hp / 최대 공격력
		super(5, 100, 10);
	}

	@Override
	public void attack(Unit player) {
		bite = random.nextInt(attackMax)+1;
		
	}

}
