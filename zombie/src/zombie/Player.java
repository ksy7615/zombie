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
		if (monster instanceof Boss) {
			attackBoss(monster);
		// 좀비 >>>	
		} else {
			attackZombie(monster);
		}
	}
	
	private void attackBoss(Unit monster) {
		Boss boss = (Boss) monster;
		
		this.sword = random.nextInt(attackMax) + 1;
		if (boss.getShield() > 0) {
			int brokenShield = boss.getShield() - this.sword;

			// 쉴드가 안깨진 상태
			if (brokenShield >= 0) {
				boss.setShield(brokenShield);
				// 쉴드 깨지면서 유효 공격
			} else {
				boss.setShield(0);
				boss.setHp(boss.getHp() - brokenShield);
			}
		} else {
			boss.setHp(boss.getHp() - this.sword);
		}

		if (boss.getHp() <= 0) {
			boss.setHp(0);
		}
		System.out.printf("플레이어가 공격력 %d로 공격\n", this.sword);
		System.out.printf("현재 보스의 Shield : %d\n", boss.getShield());
		System.out.printf("현재 보스의 HP : %d\n", boss.getHp());
	}
	
	private void attackZombie(Unit monster) {
		this.sword = random.nextInt(attackMax) + 1;
		monster.setHp(monster.getHp() - this.sword);

		if (monster.getHp() <= 0) {
			monster.setHp(0);
		}
		System.out.printf("플레이어가 공격력 %d로 공격\n", this.sword);
		System.out.printf("현재 좀비의 HP : %d\n", monster.getHp());
	}

	public void recovery() {
		if (this.potion > 0) {
			setHp(MAX_HP);
			this.potion--;
			System.out.println("player" + this);
			System.out.println("완전히 회복되었습니다!");

		} else if (this.potion == 0) {
			System.err.println("텅 -");
		}
	}

}
