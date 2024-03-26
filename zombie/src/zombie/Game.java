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
		if(player.getHp() == 0) {
			return false;
		}
		
		if(player.getPosition() == DESTINATION) {
			return false;
		}
		
		if(isExit) {
			return false;
		}
		
		return true;
	}
	
	private void printMenu() {
		System.out.println("[1] 앞으로 이동");
		System.out.println("[0] 종료");
	}

	public void run() {
		while(isRun()) {
			
		}
	}
}
