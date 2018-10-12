import java.util.Scanner;

public class MyGame {
	
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Выбери число от 0 до 100. Отгадай мое загаданное число");
		int guessNumberofSystem = 25;
		int playerNumber;

		do {
			playerNumber = scan.nextInt();
			if (playerNumber < guessNumberofSystem) {
				System.out.println ("Мое число больше");
			} else if (playerNumber > guessNumberofSystem) {
				System.out.println ("Мое число меньше");
			}
		}while(playerNumber != guessNumberofSystem);
		System.out.println("Поздровляю, ты угадал");
	}
}
