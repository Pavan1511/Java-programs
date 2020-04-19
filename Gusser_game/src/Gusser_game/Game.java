package Gusser_game;

import java.util.Scanner;
 class Gusser{
	int gnum;
	int guessNum()
	{
		System.out.println("gusser kindly guess the number: ");
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();
		return gnum;
	}
}

class Player
{
	int pnum;
	int c;
	int guessNum()
	{
		System.out.println("Player, kindly guess the number:"+c);
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();
		c=c+1;
		return pnum;
	}
}

class Umpire
{
	int numFromGusser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGusser() {
		Gusser g= new Gusser();
		numFromGusser=g.guessNum();
	}
	void collectNumFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p1.guessNum();
		numFromPlayer3=p1.guessNum();
	}
	void compare()
	{
		if(numFromGusser==numFromPlayer1) {
			System.out.println("player 1 wins ");
		}
		else if(numFromGusser==numFromPlayer2) {
			System.out.println("player 2 wins ");
		}
		else if(numFromGusser==numFromPlayer3) {
			System.out.println("player 3 wins ");
		}
		else {
			System.out.println("game lost!!! try again");
		}
	}

}
public class Game
{ 
	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumFromGusser();
		u.collectNumFromPlayer();
		u.compare();
	}
}

