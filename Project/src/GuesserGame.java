import java.util.*;

class Guesser
{
	int guessNum;
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guesser enter number to guess ");
		int guessNum=scan.nextInt();
		return guessNum;
	}
}

class Player
{
	int guessNum;
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("player please enter a number to guess ");
		int guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser =g.guessNum();
	}
	void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 has won");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and 2 has won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and 3 has won");
			}
			else
			{
				System.out.println("The player 1 has won");
			}

		}
		
		
		else if (numFromGuesser==numFromPlayer2)
		{
			System.out.println("Player 2 has won");
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 has won");
		}
		
		else
		{
			System.out.println("Please retry");
		}
	}
	
}

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		
	}

}



