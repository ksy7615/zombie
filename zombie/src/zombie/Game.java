package zombie;

import java.util.Scanner;

public class Game {
	private Player player = new Player(1, 200, 30, 2);
	private Zombie zombie = new Zombie(4, 100, 10);
	private Boss boss = new Boss(9, 300, 20, 100);

	private Scanner scanner = new Scanner(System.in);
	private final int DESTINATION = 10;
	private boolean isExit;

	private Game() {

	}

	private static Game instance = new Game();

	public static Game getInstance() {
		return instance;
	}
	// >> 여기까지 싱글톤 처리

	private boolean isRun() {
		if (player.getHp() == 0) {
			return false;
		}

		if (player.getPosition() == DESTINATION) {
			return false;
		}

		if (isExit) {
			return false;
		}

		return true;
	}

	private void locatedPlayer() {
		System.out.println("플레이어의 위치 : " + player.getPosition());
	}

	private void printMenu() {
		System.out.println("[1] 앞으로 이동");
		System.out.println("[0] 종료");
	}

	private void haveAnAdventurePlayer() {
		int position = player.getPosition() + 1;
		player.setPosition(position);
		
		meetZombie();
	}
	
	private void meetZombie() {
		if(player.getPosition() == zombie.getPosition()) {
			System.out.println("좀비를 만났다!");
			System.out.println("[공격모드로 전환]");
			
			while(true) {
				printAttackMode();
				runAttackMode(inputNumber("선택"));
				
				if(zombie.getHp() == 0) {
					System.out.println("좀비를 무찔렀다!");
					return;
				}
			}
		}
	}
	
	private void printAttackMode() {
		System.out.println("[1] 공격하기");
		System.out.println("[2] 포션먹기");
	}
	
	private void attackZombie() {
		player.attack(zombie);
		zombie.attack(player);
	}
	
	private void eatPotion() {
		player.recovery();
	}
	
	private void runAttackMode(int select) {
		if(select == 1) {
			attackZombie();
		} else if(select == 2) {
			eatPotion();
		}
	}
	
	private void runMenu(int select) {
		if (select == 1) {
			haveAnAdventurePlayer();
		} else if (select == 0) {
			isExit = true;
		}
	}

	public void run() {
		while (isRun()) {
			locatedPlayer();
			printMenu();
			int select = inputNumber("입력");
			runMenu(select);
		}
	}

	private int inputNumber(String message) {
		int number = -1;
		try {
			System.out.print(message + " : ");
			String input = scanner.next();
			number = Integer.parseInt(input);
		} catch (Exception e) {
			System.err.println("숫자를 입력하세요.");
		}
		return number;
	}
}
