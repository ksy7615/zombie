package zombie;

abstract public class Unit {
	int position, hp, attack;
	// 모든 유닛이 가진 속성
	// 1. 위치
	// 2. hp
	// 3. 공격력
	
	public Unit(int position, int hp, int attack) {
		this.position = position;
		this.hp = hp;
		this.attack = attack;
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

	public int getAttack() {
		return this.attack;
	}
	
	
}
