package zombie;

public class Game {
	private Player player = new Player(1, 200, 30, 2);
	private Zombie zombie = new Zombie(4, 100, 10);
	private Boss boss = new Boss(9, 300, 20, 100);
	
	private final int DESTINATION = 10;

	private Game() {

	}

	private static Game instance = new Game();

	public static Game getInstance() {
		return instance;
	}
	
	private boolean isRun() {
		if(player.getHp() == 0) {
			return false;
		}
		
		if(player.getPosition() == DESTINATION) {
			return false;
		}
		
		return true;
	}

	public void run() {
		
	}
}
