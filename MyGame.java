import java.util.Scanner; // Было в задачах в материалах про ветвление Java

public class MyGame {
	public static void main(String[] args) {
	    int secretNumber = 25;
	System.out.print("Введи число от 0 до 100");
	Scanner answer = new Scanner(System.in);
	int userNumber = answer.nextInt();

	if(userNumber == secretNumber) {
	    System.out.println ("Ты угадал число!");
	} else if(userNumber < secretNumber && userNumber >=0) {
	    System.out.println ("Мое число больше");
	} else if(userNumber > secretNumber && userNumber <=0) {
	    System.out.println ("Мое число меньше");
	    }
	}
}