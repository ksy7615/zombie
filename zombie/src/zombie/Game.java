package zombie;

public class Game {
	
	private Game() {
		
	}
	
	private static Game instance = new Game();
	
	public static Game getInstance() {
		return instance;
	}
	
	private void setGame() {
		Player player = new Player(1, 200, 30, 2);
		Zombie zombie = new Zombie(4, 100, 10);
		Boss boss = new Boss(9, 300, 20, 100);
	}
	
	public void run() {
		setGame();
		
	}
}
