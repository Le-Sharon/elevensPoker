/**
 * This is a class that tests the Card class.
 */import java.io.*;
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)throws IOException {
	String ranks[] ={"A","1","2","3","4","5","6","7","8","9","10","Q","K","J"};
	String suits[]={"Hearts","Spades","Clubs","Diamonds"};
	int values[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
	Deck decka= new Deck(ranks,suits,values);
	
	System.out.println(decka);
	}
}
