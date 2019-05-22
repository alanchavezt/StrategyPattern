
/**

* Project Prolog
 * Name: A. Chavez
 * CS3450 Section 002
 * Project: assignment 1
* Date: 02/12/2018 5:00:00 PM
* Purpose: Arrange the classes. Identify one abstract class, one interface and eight classes
* put the setWeapon() into the right class.

*/

public class Game 
{
	public static void main(String[] args) 
	{
		Character cKing = new King();
		cKing.useWeapon();
		cKing.fight();
		
		Character cQueen = new Queen();
		cQueen.useWeapon();
		cQueen.fight();

		Character cKnight = new Knight();
		cKnight.useWeapon();
		cKnight.fight();
		
		Character cTroll = new Troll();
		cTroll.useWeapon();
		cTroll.fight();
	}
}
