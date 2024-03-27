package zombie;

public class Boss extends Zombie {
	private int shield;

	public Boss(int position, int hp, int attackMax, int shield) {
		super(position, hp, attackMax);
		this.shield = shield;
	}

	public int getShield() {
		return this.shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	@Override
	public void attack(Unit player) {
		// 궁극기 설정 (확률 25%)
		int ultimateChance = random.nextInt(4) + 1;
		if (ultimateChance == 1) {
			ultimate(player);
		// 일반 공격	
		} else {
			generalAttack(player);
		}
	}

	private void ultimate(Unit player) {
		System.out.println("Boss의 궁극기 사용 *공격력 2배*");
		int power = 2 * (random.nextInt(attackMax) + 1);

		player.setHp(player.getHp() - power);

		if (player.getHp() <= 0) {
			player.setHp(0);
		}
		System.out.println("보스가 공격했다!");
		System.out.printf("[%d]데미지의 공격\n", power);
		System.out.println("치명상을 입었다!");
		System.out.println("player" + player);
	}
	
	private void generalAttack(Unit player) {
		int power = random.nextInt(attackMax) + 1;
		player.setHp(player.getHp() - power);

		if (player.getHp() <= 0) {
			player.setHp(0);
		}
		System.out.println("보스가 공격했다!");
		System.out.printf("[%d]데미지의 공격\n", power);
		System.out.println("player" + player);
	}
}
