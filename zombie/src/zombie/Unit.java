package zombie;

import java.util.Random;

abstract public class Unit {
	public final int MAX_HP;
	private int position, hp;
	public int attackMax;
	public Random random;
	// 모든 유닛이 가진 속성
	// 1. 위치
	// 2. hp
	// 3. 공격력
	
	public Unit(int position, int hp, int attackMax) {
		MAX_HP = hp;
		this.position = position;
		this.hp = hp;
		this.attackMax = attackMax;
		
		random = new Random();
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttackMax() {
		return this.attackMax;
	}
	
	abstract void attack(Unit unit);
	
	@Override
	public String toString() {
		return String.format("[%d/%d]", this.hp, MAX_HP);
	}
}
