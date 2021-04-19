import java.util.*;

public class Blackjack {
	
	public static void main(String[] args) {
		
		int seed = Integer.parseInt(args[0]); //args[0] -> (int)

		int playernum = Integer.parseInt(args[1]);
		
		System.out.println("seed:"+seed+" num:"+playernum);
		
		
		
		BlackJackGame game = new BlackJackGame(seed,playernum);
		
		
		game.startgame();
		game.checknum();
	}
}

class BlackJackGame{
	
	
	
	int seed=9, playernum=5;
	
	BlackJackGame(int a, int b) {seed = a; playernum = b;};
	
	House house = new House();
	
	Player player = new Player();
	
	Computer[] com = new Computer[playernum-1];
	
	Deck deck = new Deck();
	
	public void checknum()
	{
		System.out.println("11seed:"+seed+" num:"+playernum);
	}
	
	public void checkgood()
	{
		System.out.println("good");
	}
	
	
	public void startgame()
	{
		System.out.println("11seed:"+seed+" num:"+playernum);
		deck.checkgood();
		deck.makedeck();
		deck.shuffle(seed);
		
		house.table[house.cardnum] = deck.dealCard();
		house.table[house.cardnum] = deck.dealCard();
		
		player.table[player.cardnum] = deck.dealCard();
		player.table[player.cardnum] = deck.dealCard();
		
		for(int i = 0; i < playernum-1; i++)
		{
			com[i].table[com[i].cardnum] = deck.dealCard();
			com[i].cardnum++;
			com[i].table[com[i].cardnum] = deck.dealCard();
			com[i].cardnum++;
		}
		
		house.showstart();
		
		System.out.print("Player1: ");
		player.showall();
		
		for(int i = 0; i < playernum-1; i++)
		{
			System.out.print("Player" + (i+2) + ": ");
			com[i].showall();
		}
		
		
		
		
	}
	
	
	
	
}

class Card{
	int theValue; int theSuit;
	public Card() {}
	public Card(int V,int S) {theValue = V; theSuit=S;}
}

class Deck{
	private Card[] deck;
	private int cardsUsed;
	
	public void shuffle(int seed) {
		Random random = new Random(seed);
		for (int i=deck.length-1; i<0; i--) {
			int rand = (int)(random.nextInt(i+1));
			Card temp = deck[rand];
			deck[rand] = temp;
		}
		cardsUsed = 0;
	}
	public Card dealCard() {
		if(cardsUsed == deck.length)
			throw new IllegalStateException("No cards are left in the deck.");
		cardsUsed++;
		return deck[cardsUsed-1];
	}
	
	public void checkgood()
	{
		System.out.println("good");
	}
	
	public void makedeck() {
		int z  = 0;
		
		deck = new Card[52];
		checkgood();
		for(int i = 1; i<=4 ; i++)
		{
			checkgood();
			for (int j=1;  j<=13; j++)
			{
				deck[z++] = new Card(j,i);
			}
		}
		
	}
}

class Hand {
	/*code*/
	int cardnum = 0;
	
	int acenum = 0;
	
	int status = 0; // 1 = bust
	
	Card[] table = new Card[21];
	
	public int getcardnum (int num)
	{
		if(num < 10)
		{
			return num;
		}
		else if(num >= 10)
		{
			return 10;
		}
		
		return -1;
	}
	
	public int getsum ()
	{
		int sum = 0;
		
		checkace();
		
		for (int i = 0; i<cardnum; i++)
		{
			sum += getcardnum(table[i].theValue);
		}
		
		sum = sum - acenum * 1;
		
		for (int i = 0; i<acenum; i++)
		{
			if((sum + (acenum-i)*11) <= 21)
			{
				return (sum + (acenum-i)*11);
			}
			else
			{
				status = 1; //bust
				return (sum + acenum*1);
			}
		}
		
		if(sum > 21)
		{
			status = 1;
		}
		
		return sum;
		
	}
	
	public void checkace()
	{
		acenum = 0;
		for(int i = 0; i<cardnum; i++)
		{
			if(1 == table[i].theValue)
				acenum++;
		}
	}
	
	public void showall ()
	{
		for(int i=0; i<cardnum; i++)
		{
			System.out.print(itos(table[i].theValue,table[i].theSuit) + ", ");
		}
		System.out.print("(" + getsum() + ")");
		if(status == 1)
		{
			System.out.print(" - Bust!");
		}
		System.out.println();
	}
	
	public String itos(int val, int sui)
	{
		String ret = null;
		
		if(val == 1)
		{
			ret = ret +  "A";
		}
		else if ( 1<val && val <= 10)
		{
			ret =ret + Integer.toString(val);
		}
		else if (11 == val)
		{
			ret =  ret + "J";
		}
		else if (12 == val)
		{
			ret =  ret + "Q";
		}
		else if (13 == val)
		{
			ret =  ret + "K";
		}
		
		if(sui == 1)
		{
			ret = ret +  "c";
		}
		else if(sui == 2)
		{
			ret = ret + "h";
		}
		else if(sui == 3)
		{
			ret = ret + "d";
		}
		else if(sui == 4)
		{
			ret = ret + "s";
		}
		
		return ret;
		
	}
}

class Computer extends Hand {
	/*code*/
	
	
}

class Player extends Hand {
	/*code*/
	
}

class House extends Hand{
	public void showstart()
	{
		System.out.print("House: HIDDEN, " + itos(table[1].theValue,table[1].theSuit));
		System.out.println();
		
	}
}




