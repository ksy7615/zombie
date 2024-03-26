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
		// 보스 >>>
		if(monster instanceof Boss) {
			Boss boss = (Boss) monster;
			
			sword = random.nextInt(attackMax) + 1;
			// 보스는 쉴드가 있으므로 공격할 때 쉴드부터 깨기
			if(boss.getShield() > 0) {
				int brokenShield = boss.getShield() - sword;
				
				// 쉴드가 안깨진 상태
				if(brokenShield >= 0) {
					boss.setShield(brokenShield);
					// 쉴드 깨지면서 유효 공격
				} else {
					boss.setShield(0);
					boss.setHp(boss.getHp() - brokenShield);
				}
			} else {
				boss.setHp(boss.getHp()-sword);
			}
			
			if(boss.getHp() <= 0) {
				boss.setHp(0);
			}
			System.out.printf("플레이어가 공격력 %d로 공격\n", sword);
			System.out.printf("현재 보스의 Shield : %d\n", boss.getShield());
			System.out.printf("현재 보스의 HP : %d\n", boss.getHp());
		}
		
		// 좀비 >>>
		sword = random.nextInt(attackMax) + 1;
		monster.setHp(monster.getHp() - sword);
		
		if(monster.getHp() <= 0) {
			monster.setHp(0);
		}
		System.out.printf("플레이어가 공격력 %d로 공격\n", sword);
		System.out.printf("현재 좀비의 HP : %d\n", monster.getHp());
	}
	
	

}
