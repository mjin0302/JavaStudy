package yedam.com.j0117.exam01;

public class GameExample {

	public static void main(String[] args) {
		//RPGgame
		RPGgame rpgPlay = new RPGgame();
		rpgPlay.leftUpButton();
		rpgPlay.rightUpButton();
		rpgPlay.changeMode();
		rpgPlay.rightUpButton();
		rpgPlay.rightDownButton();
		rpgPlay.leftDownButton();
		rpgPlay.changeMode();
		rpgPlay.rightDownButton();
		System.out.println("====================");
		
		//ArcadeGame
		ArcadeGame arcadePlay = new ArcadeGame();
		arcadePlay.leftUpButton();
		arcadePlay.rightUpButton();
		arcadePlay.leftDownButton();
		arcadePlay.changeMode();
		arcadePlay.rightUpButton();
		arcadePlay.leftUpButton();
		arcadePlay.rightDownButton();

	}

}
