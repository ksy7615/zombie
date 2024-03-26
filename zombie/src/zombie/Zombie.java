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
		
		player.setHp(player.getHp()-bite);
		
		if(player.getHp() <= 0) {
			player.setHp(0);
		}
		System.out.println("좀비가 공격했다!");
		System.out.printf("[%d]데미지의 깨물기 공격\n", this.bite);
		System.out.println("player" + player);
	}
	
}
