package amen14;


import java.util.Scanner;

/*
 * Ailsa Mensinger
 * Text Adventure Game
 */

public class ThroughTheLabyrinth {

	public static void main(String[] args) {
		//import scanner
		Scanner input = new Scanner(System.in);
		//add in first ascii art in the form of the title
		System.out.println("                 _..._       .-'''-.                                                              .-'''-.                                                                                                                                                  \r\n" + 
				"                                 .---.    .-'_..._''.   '   _    \\                                                           '   _    \\                                                              .---.                                                                             \r\n" + 
				"                   __.....__     |   |  .' .'      '.\\/   /` '.   \\  __  __   ___         __.....__                        /   /` '.   \\                      .              __.....__               |   |          /|                           .--.   _..._              .           \r\n" + 
				"       _     _ .-''         '.   |   | / .'          .   |     \\  ' |  |/  `.'   `.   .-''         '.                     .   |     \\  '                    .'|          .-''         '.             |   |          ||    .-.          .-        |__| .'     '.          .'|           \r\n" + 
				" /\\    \\\\   ///     .-''\"'-.  `. |   |. '            |   '      |  '|   .-.  .-.   ' /     .-''\"'-.  `.                .| |   '      |  '               .| <  |         /     .-''\"'-.  `.           |   |          ||     \\ \\        / /.-,.--. .--..   .-.   .     .| <  |           \r\n" + 
				" `\\\\  //\\\\ ///     /________\\   \\|   || |            \\    \\     / / |  |  |  |  |  |/     /________\\   \\             .' |_\\    \\     / /              .' |_ | |        /     /________\\   \\          |   |    __    ||  __  \\ \\      / / |  .-. ||  ||  '   '  |   .' |_ | |           \r\n" + 
				"   \\`//  \\'/ |                  ||   || |             `.   ` ..' /  |  |  |  |  |  ||                  |           .'     |`.   ` ..' /             .'     || | .'''-. |                  |          |   | .:--.'.  ||/'__ '.\\ \\    / /  | |  | ||  ||  |   |  | .'     || | .'''-.    \r\n" + 
				"    \\|   |/  \\    .-------------'|   |. '                '-...-'`   |  |  |  |  |  |\\    .-------------'          '--.  .-'   '-...-'`             '--.  .-'| |/.'''. \\\\    .-------------'          |   |/ |   \\ | |:/`  '. '\\ \\  / /   | |  | ||  ||  |   |  |'--.  .-'| |/.'''. \\   \r\n" + 
				"     '        \\    '-.____...---.|   | \\ '.          .              |  |  |  |  |  | \\    '-.____...---.             |  |                             |  |  |  /    | | \\    '-.____...---.          |   |`\" __ | | ||     | | \\ `  /    | |  '- |  ||  |   |  |   |  |  |  /    | |   \r\n" + 
				"               `.             .' |   |  '. `._____.-'/              |__|  |__|  |__|  `.             .'              |  |                             |  |  | |     | |  `.             .'           |   | .'.''| | ||\\    / '  \\  /     | |     |__||  |   |  |   |  |  | |     | |   \r\n" + 
				"                 `''-...... -'   '---'    `-.______ /                                   `''-...... -'                |  '.'                           |  '.'| |     | |    `''-...... -'             '---'/ /   | |_|/\\'..' /   / /      | |         |  |   |  |   |  '.'| |     | |   \r\n" + 
				"                                                   `                                                                 |   /                            |   / | '.    | '.                                  \\ \\._,\\ '/'  `'-'`|`-' /       |_|         |  |   |  |   |   / | '.    | '.  \r\n" + 
				"                                                                                                                     `'-'                             `'-'  '---'   '---'                                  `--'  `\"          '..'                    '--'   '--'   `'-'  '---'   '---' ");
		//begin program by going straight to the first situation
		start(input);
		
	}
	//create first situation
	public static void start(Scanner input) {
		//add in story text
		System.out.println("You wake up in the middle of a large open area surrounded by walls curved around you.");
		System.out.println("You have no way of looking over the walls because of their massive height");
		System.out.println("In front of you, there is a letter, you pick it up and read it");
		System.out.println("\"Congratulations! You have been chosen to be the participant in our little experiment.");
		System.out.println("What you see in front of you is our own maze that we created. As of right now you are in the center.");
		System.out.println ("You must get through our man-made labyrinth without, well, dying.");
		System.out.println ("You have as much time as you need, but beware, your choices certianly have consequences");
		System.out.println ("so you best make sure you don't choose the wrong path. Happy traveling!\" ");
		System.out.println("You look up from the letter to see two openings in front of you.");
		//prompt a question to the user
		System.out.println("Do you choose to go to the right or left?");
		//create a while loop that interprets the user's string answer
		String answer = input.next();
		while(true) {
			if (answer.equals("right") || answer.equals("Right")) {
			Right(input);
			break;
			}
			else if (answer.equals("left") || answer.equals("Left")) {
				Left(input);
				break;
			}
			else {
				System.out.println("That is not an acceptable answer. Try again.");
				start(input);
			}
			
		}
		
		
		
	}
	//create second situation
	public static void Right (Scanner input) {
		//add in story text
		System.out.println("You go to the right because after all, the right is always right");
		System.out.println("You continue to walk down the hallway as you start to get hungry.");
		System.out.println("You then realize that you can't rely on going the right directions,"
				+ " you need to find food and water");
		System.out.println("As you walk further, you approach a table of three plates (much"
				+ " to your convenience)");
		System.out.println("On the first plate, there's a beautiful steak dinner that would surely"
				+ " fill up your stomach for the rest of your day as well as give your taste buds"
				+ " a gift");
		System.out.println("On the second plate, there's a grilled fish fillet that looks absolutely"
				+ " appetizing");
		System.out.println("On the third plate, you happen to find a not-so-appealing stew of something that looked gray");
		//prompt a question to the user
		System.out.println("Which plate do you choose: first, second, or third?");
		//create a while loop that interprets the user's string answer
		String answer2 = input.next();
		while (true) {
			if (answer2.equals("first") || answer2.equals("First")) {
				foodPoisoning(input);
				break;
			}
			else if (answer2.equals("second") || answer2.equals("Second")) {
				foodPoisoning(input);
				break;
			}
			else if (answer2.equals("third") || answer2.equals("Third")) {
				deliciousDinner(input);
				break;
			}
			else {
				System.out.println("That is not an acceptable answer. Try again.");
				Right(input);
			}
		}
		
	}
	//create death situation
	public static void Left (Scanner input) {
		System.out.println("You go to the left and happen to see a dead end. You turn around to go back but to your surprise"
				+ " a large stone mallet swings your way straight into your head.");
		System.out.println("You are now dead. Try again");
		//loop back to previous method
		start(input);
				
	}
	//create death situation
	public static void foodPoisoning (Scanner input) {
		System.out.println("As you eat your delicious meal, you get an unpleasant surprise.");
		System.out.println("The moment the food touched your mouth, your taste buds received a foul and rotten taste.");
		System.out.println("Suddenly you realize that the appetizing meal has now decayed on the plate. Before you can fully respond, your head gets dizzy and you fall to the ground foaming at the mouth.");
		System.out.println("You have died of food poisoning. Try again.");
		//loop back to previous method
		Right(input);
		

	}
	//create third situation
	public static void deliciousDinner(Scanner input) {
		//add in story text
		System.out.println(" ___                                                                   ___             ___      \r\n" + 
				"(   )                                                                 (   )      .-.  (   )     \r\n" + 
				" | |.-.     .--.    ___ .-.       .---.     .-..      .-..     .--.    | |_     ( __)  | |_     \r\n" + 
				" | /   \\   /    \\  (   )   \\     / .-, \\   /    \\    /    \\   /    \\  (   __)   (''\") (   __)   \r\n" + 
				" |  .-. | |  .-. ;  |  .-. .    (__) ; |  ' .-,  ;  ' .-,  ; |  .-. ;  | |       | |   | |      \r\n" + 
				" | |  | | | |  | |  | |  | |      .'`  |  | |  . |  | |  . | |  | | |  | | ___   | |   | | ___  \r\n" + 
				" | |  | | | |  | |  | |  | |     / .'| |  | |  | |  | |  | | |  |/  |  | |(   )  | |   | |(   ) \r\n" + 
				" | |  | | | |  | |  | |  | |    | /  | |  | |  | |  | |  | | |  ' _.'  | | | |   | |   | | | |  \r\n" + 
				" | '  | | | '  | |  | |  | |    ; |  ; |  | |  ' |  | |  ' | |  .'.-.  | ' | |   | |   | ' | |  \r\n" + 
				" ' `-' ;  '  `-' /  | |  | |    ' `-'  |  | `-'  '  | `-'  ' '  `-' /  ' `-' ;   | |   ' `-' ;  \r\n" + 
				"  `.__.    `.__.'  (___)(___)   `.__.'_.  | \\__.'   | \\__.'   `.__.'    `.__.   (___)   `.__.   \r\n" + 
				"                                          | |       | |                                         \r\n" + 
				"                                         (___)     (___)                                        ");
		System.out.println("You take the third plate, obviously not because of the appetizing presentation, but something in your gut just tells you to eat it.");
		System.out.println("As you take the first bite, much to your surprise, the grey meal tastes absolutely delicious.");
		System.out.println("You gladly wolf down the rest of the platter, then resuming on your way with no more hunger.");
		System.out.println("After about an hour of walking through the maze, you reach a door. You open and inside there’s two doors on the other end of the room.");
	System.out.println("Door number one has a picture of a man with the lower body of a goat playing what seems to be a magic flute.");
	System.out.println("Door number two has a picture of a cornucopia and a sceptor, along with a mighty God standing tall and proud.");
	//ask a question to the user
	System.out.println("Which door do you pick: one or two?"); 
	//create a while loop that interprets the user's string answer
	String answer3 = input.next();
	while (true) {
		if (answer3.equals("one") || answer3.equals("One")) {
			magicForest(input);
			break;
	}
		else if (answer3.equals("two") || answer3.equals("Two")) {
			Underworld(input);
			break;
	}
		else {
			System.out.println("That is not an acceptable answer. Try again.");
			deliciousDinner(input);
	}
	}
	}
	//create death situation
	public static void Underworld (Scanner input) {
		System.out.println("You choose door number two.");
		System.out.println("Your hand reaches for the knob and swings the door open, only to reveal a swirling vortex where the ground should be.");
		System.out.println("Suddenly a man, the same one printed on the door, flies up to you and pulls you down into the depths of hell. You have failed to recognize the god himself, Hades.");
		System.out.println("You are now a prisoner of the underworld. Try again.");
		//loop back to previous method
		deliciousDinner(input);
		

	}
	//create fourth situation
	public static void magicForest (Scanner input) {
		//add in story text
		System.out.println("You recognize the second door as Hades and what symbols represent him, figuring that door number two can bring nothing but trouble.");
		System.out.println("On the first door, you can see that the half goat man is Pan, god of wild beasts and the forest. You figure that would be the safest bet.");
		System.out.println("You open the first door to find an amazing forest hiding behind it. You look around at how astonishing it is. It was a whole world with grass and trees and animals all around.");
		System.out.println("You take a step inside and the door slams shut behind you. There’s no path so all you can do is continue on straight and hope for the best.");
		System.out.println("As you trudge through the tall grasses, a deep growl emits from behind you.");
		System.out.println("Your head slowly turns to see the object of the growling, only to be petrified at the sight of a tiger.");
		System.out.println("The only things you could possibly use to get away from the tiger is to run and depend on your speed, jump in the lake and depend on your swimming capabilities, or climb a tree and hope for the best.");
		//ask user a question
		System.out.println("You must make a quick decision. Do you run, swim, or climb?");
		//create a while loop to interpret user's string answer
		String answer4 = input.next();
		while (true) {
			if (answer4.equals("run") || answer4.equals("Run")) {
				Run(input);
				break;
	}
			else if (answer4.equals("swim") || answer4.equals("Swim")) {
				Swim(input);
				break;
	}
			else if (answer4.equals("climb") || answer4.equals("Climb")) {
				Climb(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				magicForest(input);
	}
	}
	}
	//create fifth situation
	public static void Run (Scanner input) {
		//add in story text
		System.out.println("You immediately run forward, hoping to get away from the tiger.");
		System.out.println("Sadly this does not work out that well for you. The tiger’s speed overwhelms you by a mile and he quickly starts to catch up.");
		System.out.println("You have to come up with a different plan, but the only choices you have are to keep running, jump in the lake and swim away, or climb a tree.");
		//ask the user a question
		System.out.println("The tiger is almost at you. Do you choose to run, swim, or climb?");
		//create a while loop to interpret the user's string answer
		String answer4P2 = input.next();
		while (true) {
			if (answer4P2.equals("run") || answer4P2.equals("Run")) {
				keepRunning(input);
				break;
	}
			else if (answer4P2.equals("swim") || answer4P2.equals("Swim")) {
				Swim(input);
				break;
	}
			else if (answer4P2.equals("climb") || answer4P2.equals("Climb")) {
				Climb(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				Run(input);
	}

	}
	}
	//create death situation
	public static void keepRunning (Scanner input) {
		System.out.println("You choose to keep running.");
		System.out.println("This doesn’t quite work out the way you had planned. The tiger catches up completely to you in a matter of seconds. You feel the swipe of his paw and everything goes black.");
		System.out.println("The tiger has killed you. Try again.");
		//loop back to previous method
		Run(input);
		
	}
	//create death situation
	public static void Swim (Scanner input) {
		System.out.println("You chose to swim.");
		System.out.println("You jump into the large lake and muster up all the strength in your body to kick and paddle away from the tiger.");
		System.out.println("It’s too bad you didn’t know how good tigers are at swimming. It catches up to you so fast you didn’t realize it was right behind you until it attacked you with its paw.");
		System.out.println("The tiger has killed you. Try again.");
		//loop back to previous method
		magicForest(input);
		

	}
	//create sixth situation
	public static void Climb (Scanner input) {
		//add in story text
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0kkkxxkOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMNOdoddxkOOkxxxdxKWMMMWWMMMMMMWWNNWMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMXdlokXWMMMMMMMMWXkdkNMWWWN0kxxkkkkkkxxxOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMXdcdKWMMMMMMMMMMMMWWNOOKkdddxk0XNWWMMWNKOxoxXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMKllKWMMMMMMMMMMMMMMMMMW0lo0XWMMMMMMMMMMMMMMNxl0MMMMMMWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMXclXMMMMMMMMMMMMMMMMMMMMNKNWWMMMMMMMMMMMMMMWMNdoNMMMWNXK0000KNMMWMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMWxc0MMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMWxlXXOxxxxxxxxxxxdx0NMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMWooNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNo;odx0XWMMMMMMMWXOdokNMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMWWWolNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWOoxKWMMMMMMMMMMMMMWWKooKMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMWNx:OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNWMMMMMMMMMMMMMMMMMMNdlKMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMWNOxxkxd0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMXlxMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMNxoxONWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNodWMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMW0loKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWM0lOMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWkckNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXodNMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMkckWMMMWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0ldXWMMMMMMMM\r\n" + 
				"MMMMMMMMMMMXldWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXxoONMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMkcOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0xoxXMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMxc0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWOloONMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMM0cxWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMkcOWMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMWkcOWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMxc0WMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWOld0NMMMMMMMMWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMWWMWOlkWMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMWXkdxxkOO00OkkXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWMWN0doOWMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMWNK0OOOOkcdWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOkO0KXK0kxddONMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMXldWWMMMMMMMMMMMMMMMMMMMWKO0NMMMMMMMMMMMMWxcxxxxxxxk0NMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMW0ooONWMMMMMMMMMMMMMNKOxxxdooONMMMMMMMWWKdl0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMNOxxxdxxkOOOOOkxdodxx0NWMW0ddddkkkkxdookNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMWMWN0OkkxxxxkkOkcxWMMMMMMMMN0Okl:oO0XWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMxcKMMMMMMMMWWMMOl0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMOckMMMMMMMMMMMMkc0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXcdWMMMMMMMMMMMkc0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWllNMMMMMMMMMMMkc0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWolNMMMMMMMMMMMkcOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWolNMMMMMMMMMMMOcOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNloWMMMMMMMMMMM0cxMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXcdMMMMMMMMMMMMNloWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0ckMMMMMMMMMMMMWdcKMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMxlXMMMMMMMMMMMMM0cxWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXoxWMMMMMMMMMMMMMWdlXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWkoXMMMMMMMMMMMMMMMXldWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0oOWMMMMMMMMMMMMMMMM0oOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMW0okWMWWMMMMMMMMMMMMMMW0xxk00NMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMNK0OOkkxxd0WWWMWMMMMMMMMMMMWMMMWNKkxxxdd0NMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMWXkxxxkkOOO0XWWWWWMWWMMMMMMMMMMWNXKK0KKKXKOdll0WMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMWWXxoxKNWNXXK000OOkkxxOXMMMMMMMMMWxokkkkkkkOOO00x0WMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMWklx0000OOOOO000KKK0OdokNMMMMWMMOcOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMWNXNWWMMMMMMMMMMMMMMMMKod0XMWWWXoxWMMMMMMMMMMMMMMMMMMMMMMMMWWMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNxldKWN0dkNMMMMMMMMMMMMWX0XXK00OO00O0KO0XKKKKKKXK00X\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0k0OOKWMMMMMMMMMMMMMWOxO0kxkkkkxdxkxdxdoddxxkdllk\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNXK00OOkxxxxkxxxdddoddood0");
		System.out.println("You choose to climb a tree.");
		System.out.println("Looking around the forest, there are numerous species of trees ranging from all kinds of shapes and sizes.");
		System.out.println("The four that are closest to you are 1. a pine tree, 2. a birch tree, 3. a redwood tree, and 4. an aspen tree.");
		//ask the user a question
		System.out.println("Which tree do you choose to climb?: one, two, three, or four?");
		//create a while loop to interpret the user's string answer
		String answer5 = input.next();
		while (true) {
			if (answer5.equals("one") || answer5.equals("One")) {
				Pine(input);
				break;
	}
			else if (answer5.equals("two") || answer5.equals("Two")) {
				Birch(input);
				break;
	}
			else if (answer5.equals("three") || answer5.equals("Three")) {
				Redwood(input);
				break;
	}
			else if (answer5.equals("four") || answer5.equals("Four")) {
				Aspen(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				Climb(input);
	}

	}
	}
	//create death situation
	public static void Birch (Scanner input) {
		System.out.println("You chose to climb the birch tree.");
		System.out.println("It wasn’t a particularly thick tree, therefore the moment you tried to pull your body weight into the branches it snapped.");
		System.out.println("With no more time to pick yourself up and run to a different tree, the tiger strikes his attack.");
		System.out.println("The tiger has killed you. Try again.");
		//loop back to previous method
		Climb(input);
		
	}
	//create death situation
	public static void Aspen (Scanner input) {
		System.out.println("You chose to climb the aspen tree.");
		System.out.println("It wasn’t a particularly thick tree, therefore the moment you tried to pull your body weight into the branches it snapped.");
		System.out.println("With no more time to pick yourself up and run to a different tree, the tiger strikes his attack.");
		System.out.println("The tiger has killed you. Try again.");
		//loop back to previous method
		Climb(input);
		
	}
	//create safe alternative
	public static void Pine (Scanner input) {
		//add in story text
		System.out.println("You chose to climb the pine tree.");
		System.out.println("Although it wasn’t the most comfortable to climb up, it surely worked. The tiger couldn’t reach you due to the pine needles sticking into it.");
		Safe(input);
		
	}
	//create safe alternative
	public static void Redwood (Scanner input) {
		//add in story text
		System.out.println("You chose to climb the redwood tree.");
		System.out.println("It had a massive height that took a lot of your strength to climb, but you manage to get to the top. Surely enough, it worked and the tiger couldn’t climb up the giant tree.");
		Safe(input);
		
	}
	//create seventh situation
	public static void Safe (Scanner input) {
		//add in story text
		System.out.println("Frustrated, the tiger moped away. Once it was out of your sight you  hopped out of the tree and continued on your path, being more cautious of your surroundings so you didn’t have to encounter another predator.");
		System.out.println("At a distance, a few outlines catch your eye. You walk closer and it appears to be two large bumps in the grass, each containing a tunnel that goes opposite directions.");
		System.out.println("The first tunnel looks like a straight drop downwards, while the second is a straight walk forward.");
		//ask the user a question
		System.out.println("Which tunnel do you pick?: one or two?");
		//create while loop for the user's string answer
		String answer6 = input.next();
		while (true) {
			if (answer6.equals("one") || answer6.equals("One")) {
				tunnelOne(input);
				break;
	}
			else if (answer6.equals("two") || answer6.equals("Two")) {
				tunnelTwo(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				Safe(input);
	}

	}
	}
	//create death situation
	public static void tunnelTwo (Scanner input) {
		System.out.println("You chose to go down the second tunnel.");
		System.out.println("You walk down the straight pathway and you feel your left foot sink into something. You look down and you’ve appeared to step on a block, almost as if it was planted there.");
		System.out.println("You find it odd but nudged it off. But as soon as you look up, long spears emerge from the walls of the tunnel and impale you.");
		System.out.println("You have been killed by a booby trap. Try again.");
		//loop back to previous method
		Safe(input);
		
	}
	//create eighth situation
	public static void tunnelOne (Scanner input) {
		//add in story text
		System.out.println("You choose to go down the first tunnel.");
		System.out.println("You walk up to the opening and see that it’s a slide that drops straight down. Hesitantly, you sit down and the push yourself to go down.");
		System.out.println("Your stomach does a backflip at the rush of taking a straight drop down, but the slide curves so that you’re eventually parallel with the ground.");
		System.out.println("As you speed down the slide, the end comes near and you find yourself being flung off and your body hits the ground of the labyrinth.");
		System.out.println("You get up and brush yourself off, immediately getting back to the path and leaving no time for being exasperated.");
		System.out.println("You continue on for what felt like hours, the lights never dimming once. Finally after going down many random twists and turns, you encounter a massive door decorated with all kinds of medieval ornaments.");
		System.out.println("You open the door to reveal a table of weapons, a note right next to it with the written words \"Pick one\". You look at the selection and there’s three different ones to choose from: an axe, a chainsaw, and a sword.");
		//ask the user a question
		System.out.println("Which do you choose?: axe, chainsaw, or sword");
		//create while loop to interpret the user's string answer
		String answer7 = input.next();
		while (true) {
			if (answer7.equals("axe") || answer7.equals("Axe")) {
				Axe(input);
				break;
	}
			else if (answer7.equals("chainsaw") || answer7.equals("Chainsaw")) {
				Chainsaw(input);
				break;
	}
			else if (answer7.equals("sword") || answer7.equals("Sword")) {
				Sword(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				tunnelOne(input);
	}

	}
	}
	//create alternative for the user's choice
	public static void Axe (Scanner input) {
		System.out.println("You chose the axe.");
		Monster(input);
		
	}
	//create alternative for the user's choice
	public static void Chainsaw (Scanner input) {
		System.out.println("You chose the chainsaw.");
		Monster(input);
		
	}
	//create alternative for the user's choice
	public static void Sword (Scanner input) {
		System.out.println("You chose the sword.");
		Monster(input);
		
	}
	//create ninth situation
	public static void Monster (Scanner input) {
		//add in story text
		System.out.println("After you picked your weapon, a second table popped up from the ground with three different pictures of monsters. Another \"Pick one\" note was placed next to it. Your selection in monsters consisted of a dragon, a cerberus, and a cyclops.");
		//ask the user a question
		System.out.println("Which monster do you pick?: dragon, cerebus, or cyclops");
		//create while loop to interpret the user's string answer
		String answer8 = input.next();
		while (true) {
			if (answer8.equals("dragon") || answer8.equals("Dragon")) {
				Dragon(input);
				break;
	}
			else if (answer8.equals("cererbus") || answer8.equals("Cererbus")) {
				Cerberus(input);
				break;
	}
			else if (answer8.equals("cyclops") || answer8.equals("Cyclops")) {
				Cyclops(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				Monster(input);
	}

	}
	}
	//create alternative for the user's choice
	public static void Dragon (Scanner input) {
		System.out.println("         ..    .                       \r\n" + 
				"                                                .: .    .:M .                   \r\n" + 
				"                                                . M,.   .DMO.                   \r\n" + 
				"                                                  MM.   .MMM.                   \r\n" + 
				"                                                  MM+.. IMMM .                  \r\n" + 
				"                                             .  .+MMM...MMMM..                  \r\n" + 
				"                                               . MMMM.,MMMMM .                  \r\n" + 
				"                                                MMMMN?MM~MMD..                  \r\n" + 
				"                  ..                    ...  . MMMM.MMM=MMMMM.                  \r\n" + 
				"                .  MI..               ...   ..MMMMMMMZIMMMMMI.                  \r\n" + 
				"                 . .,MM:.           .NMMMMMMMMMMMMMM.NMMMMMM..                  \r\n" + 
				"                    . MMM .....  .  MMMMMMMMMMMMMMM8 ?= MMM                     \r\n" + 
				"                     .~MMMMMMMMO?O: MMMMMM8.MMM,MMMM.=MMMM                      \r\n" + 
				"                      .MMD.NMMMMMMMMN.NO..? $MM$MMMMMMM~MM$..                   \r\n" + 
				"                .. ... ZMMMMMMMMMMMMMMMMZMMMMMMMMMM8=++N$$M~.                   \r\n" + 
				"                ..?M...ZMMMMMMMMMMMMMMMMMM$MM$MM,MMMMMMMMMM8~MM.                \r\n" + 
				"                .MMM   M:MMM. .. 7MMMMMMMMMMMMNMMMMMMMMMMMMMMMM.                \r\n" + 
				"                ZMMM=. ,N.MM.  .   .. ...MMM.8MMMMMMMMMMMMMMMM~                 \r\n" + 
				"               .MMMMM.  .....     . . ....DMMM:MMM$MMMMMMMMMM7.                 \r\n" + 
				"              ..~:M. .     .. .. $MMMMMMMMMMMMM+MMM:MMMMMMM++.                  \r\n" + 
				"                  MM.      ?.,MMMMMMM$:.. ..,=OM8MMMMMMMMMMMMMO.                \r\n" + 
				"                 .,MM?.. .~NNMM8.7IMMMMMMMMMMMMMMMMMMMMMMMMMMM..                \r\n" + 
				"                .  .7MMMMMM=MM.N+MMMMMMMMMMMNNMMMMZ$MMMMMMMMM ..                \r\n" + 
				"                    . . . $MMMMMMMMMM~. ..+NMMMM8MMMMO?II~ ~ . ..               \r\n" + 
				"                           ~MMMMMM..  ....MMMMMMMMM~..:MMMM:MMMM...             \r\n" + 
				"                          . MMMMM:   .. ,MMMMMMMMMMMMM7MMMM?MMM:. .             \r\n" + 
				"                           .MMZ    . .OMMMMMMMMMMMMMM=MMMMDMMZ.                 \r\n" + 
				"                         .I7,.. ...  N..M$=MMMMM=MMM=MMMMM. .  .                \r\n" + 
				"                             .  .. MMMMMM,.I8Z.8MMMM8MMMM .                     \r\n" + 
				"                            .  OMMMMMMMMMMMMMMDMMMM8=MMMI..                     \r\n" + 
				"                            .M:MMMMMMMMMMMMMMMMMM8MMMM8MM~.                     \r\n" + 
				"                        ....+ MOMMMMMMMMMMMMMMMM$MMMMMMMMM:                     \r\n" + 
				"                        .. MMM~~M~MMMMMMMM:MMMM+MMMMZ .~$7..                    \r\n" + 
				"                        .7MMMMMMM,.?$I. DMMMMMMMMMMO.                           \r\n" + 
				"                        ,MMMMMMMMMMMMMZMMMMMMM=MMMM..                           \r\n" + 
				"                      . MMMMMMMMMMMMMMDMMMMMMMIMMM.+.                           \r\n" + 
				"                      .MMMMMMMMMMMMMM:MMMMMMMMO7MMMMM...                        \r\n" + 
				"                     ..M OMMMMMMMMO.8MMMMMMMMOMMM=MMMMD                         \r\n" + 
				"                      .. ..,...,DMMMDMMMMMMMM+MMM,+....                         \r\n" + 
				"                     . MMMMMMMMMMMMMDMMMMMMMM7MMM?..                            \r\n" + 
				"                     . MMMMMMMMMMMMM~MMMMMMMM~MMMM.  .                          \r\n" + 
				"                     ..MMMMMMMMMMMMMMMMMMMMMMMMMMM: . ..                        \r\n" + 
				"                      :=MMMMMMMMMM$+?MMMMMMMMMIMMMM.+MM7. .                     \r\n" + 
				"             .  ..   ..NMMMMMO=..=MMM:MMMMMMMMMM,MMM.MM.. .  ..                 \r\n" + 
				"               8.     .$?+?7OMMMMMMMMDMMMMMMMMMMM$MMMD$ .                       \r\n" + 
				"             ..?N   . MMMMMMMMMMMMMMMM.MMMMMMMMMMMOMMMMMO,  .= .                \r\n" + 
				"             . .MMMMMMMMMMMMMMMMMMMMMMM MM MMMMMMMM,MMMMMMMMM  .                \r\n" + 
				"                 MMMMMMMMMMMMMM$OMMMMMMM.MZ :MMMMMMMD+MMMMM,.                   \r\n" + 
				"                  .NMMMMMMMMM... ,MMMMMMMM=.$8M ~DMMMMM7..                      \r\n" + 
				"                  .. . ......    ...DMMMMMMM?. . .   .                          \r\n" + 
				"                                     .......                                    \r\n" + 
				"                                          .                              ");
		System.out.println("You chose the dragon.");
		System.out.println("Suddenly both the tables in the room drop into the ground and the wall in front of you opens up to reveal a large underground arena.");
		System.out.println("You walk in and immediately are almost trampled by a dragon. You look up a see the monster towering above you. For a moment you are completely dumbfounded by the situation you are currently in.");
		System.out.println("The dragon takes a massive step forward and opens its mouth, releasing an inferno of fire onto you.");
		System.out.println("You need to make a quick decision: 1. Use your weapon as a shield, 2. Run away from the dragon, 3. Run towards the dragon with your weapon.");
		System.out.println("What will you do to avoid the dragon’s fire?: one, two, or three");
		String answer9P1 = input.next();
		while (true) {
				if (answer9P1.equals("one") || answer9P1.equals("One")) {
				Shield1(input);
				break;
	}
			else if (answer9P1.equals("two") || answer9P1.equals("Two")) {
				Avoid1(input);
				break;
	}
			else if (answer9P1.equals("three") || answer9P1.equals("three")) {
				Attack1(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				Dragon(input);
	}

	}
	}
	//create alternative for user's choice
	public static void Cerberus (Scanner input) {
		System.out.println("                                                              \r\n" + 
				"                                         ZN7                                    \r\n" + 
				"                                     .N   8MI$M.                                \r\n" + 
				"                                    MMMM  N ,:.                                 \r\n" + 
				"                                MI. DO..I =.                                    \r\n" + 
				"                              M..     N.. .M.                                   \r\n" + 
				"                             M.           ..=                                   \r\n" + 
				"                            N .  ~..        . ~                                 \r\n" + 
				"                            .  .:N           .M             M                   \r\n" + 
				"                           N..~ 8            .M             ,M:.M    .?:        \r\n" + 
				"                 8        . MOMM.      :.     M          .+ D77 ..?,...M        \r\n" + 
				"               .           M....       8.     $        .I.. Z. .  ..MM.M        \r\n" + 
				"   +.     .M$.O M         M.          ..M    .O       M    ,.. M   ..M.7        \r\n" + 
				"   MM   ?...N  . . M   .,: .      . .Z. ..   .D     .N     .,  M      MD        \r\n" + 
				"   N M . ..N.  D    +  M+~        ~:.    :   .I     M .      .       .M.        \r\n" + 
				"   $ $   .,.O .     .N M..      OM=      8    ..   N   7     =       .M.        \r\n" + 
				"   :,..  .N~.        .M  8~ .N.N  MD     8   . ,  M   7.  M .MM       ?         \r\n" + 
				"    M                  ? . . M$. .MM     N    .D.:.. .M: MM. M.      .          \r\n" + 
				"   .M.      ..          N          N     =     M .     MM8M ..+M  ? .M.         \r\n" + 
				"    M.     .M      D   ..O .  .  M.D            D.   M  MMM .  ?: .$+ .         \r\n" + 
				"    M. .. .N..     NN.     N   . ..N           .         :O .  ,?,M+            \r\n" + 
				"    ?  ., .IZ    . $ ~.    .M. .8..Z           .    .   .7O        .            \r\n" + 
				"     M N.M       8M         .7 O.  .           M        ..M      . ..           \r\n" + 
				"      :+$MM      D             Z.             .           .N.  N .Z.~           \r\n" + 
				"      $8  .     =.,.                          =             .MMM.$M             \r\n" + 
				"       .. .    .$ O            ..        .       . .         8 ..               \r\n" + 
				"      .  .M.    M.             ?   .             I        . M D                 \r\n" + 
				"       M7.M.  .M8              .. .      .       .    .   M? I I                \r\n" + 
				"       78I~OM  8.M         Z..    M     $       ..   N.. M .   M                \r\n" + 
				"          ..   D .M.      . =     =     .          ,..,...     M                \r\n" + 
				"              ,   . M.N.          .    :.   .  M..=MZ.       ..,                \r\n" + 
				"              N      MMMN . .M .. ,  . $.?+I=. 7. M8         .N.                \r\n" + 
				"              M       ..N .   ..  ?. .$..        M            .                 \r\n" + 
				"              M        ..N                     .I            O                  \r\n" + 
				"              ..         .N                     .           M                   \r\n" + 
				"               M.          N .                 ,           M                    \r\n" + 
				"               .,         . :                . Z        ..N                     \r\n" + 
				"                ?           ~                .8.        . .                     \r\n" + 
				"                 N          .$               .I        Z N                      \r\n" + 
				"                  M.+.      .O.             .Z                                  \r\n" + 
				"                   N..        ,             .N.     .   M.                      \r\n" + 
				"                   .NN        M     .   .   .          D                        \r\n" + 
				"               ...   D        ..  .$ .= Z.            $                         \r\n" + 
				"            .  ... 8M M        , . .    .   M        I . .DN+M.                 \r\n" + 
				"            Z.                 M            .        ..M     .N                 \r\n" + 
				"           .:.         D.      .M.        I M      .M.         D                \r\n" + 
				"                        ~.       M       M.       ..           :.               \r\n" + 
				"           M             .    .D M       O 7    . M.            N.              \r\n" + 
				"                 ..    . . .     N       .=     ..M             7               \r\n" + 
				"          +.      . =    +       M     .,        .. ...         .,              \r\n" + 
				"          =.     MMM7 M .M       M     .M.       ,. D. 8,       .               \r\n" + 
				"           ?          . M,       M      M        MMM,           7               \r\n" + 
				"           :.            .M.     ~ .    ,                       Z               \r\n" + 
				"            N             8.                   .N.             :                \r\n" + 
				"             N            .=     .$.   +.      .             ...                \r\n" + 
				"              M .          = .    M.   M.     .M             .O                 \r\n" + 
				"               M..          M     ..   O.                    8                  \r\n" + 
				"               ..:..         .    .. ..M.    .N             ,                   \r\n" + 
				"                  ~~ .       N.   .M   M     7         . .7                     \r\n" + 
				"              .     .7O       .   .O   D    .        ..M.                       \r\n" + 
				"                        .M8  .D   ... .,    D   .  +O .                         \r\n" + 
				"                             D..    =. ..   M...M                               \r\n" + 
				"                      . . .N  .N    . M   . M  8,.. .                           \r\n" + 
				"                  . 8M   .  . .N     D.   ..      ,DM                           \r\n" + 
				"                   Z M  ,:. 7? .     N      M.    ..NM.                         \r\n" + 
				"                   M .. +..M.8 ..   .       .O:   D, 8=:                        \r\n" + 
				"                 .O N$  .Z.N ..     7  ...     .   ?.I N                        \r\n" + 
				"                 .MMMMM =.M.MM .D.  M  N.  .   7 .Z=$ M                         \r\n" + 
				"                     ,  ...7.MMM.MZNM 8. :  + NM.=NM             ");
		System.out.println("You chose the cerberus.");
		System.out.println("Suddenly both the tables in the room drop into the ground and the wall in front of you opens up to reveal a large underground arena.");
		System.out.println("You walk in and immediately are almost trampled by a cerberus. You look up a see the monster towering above you. For a moment you are completely dumbfounded by the situation you are currently in.");
		System.out.println("The cerberus takes a massive step forward and raises its paw up, about to attack you.");
		System.out.println("You need to make a quick decision: 1. Use your weapon as a shield, 2. Run away from the cerberus, 3. Run towards the cerberus with your weapon.");
		System.out.println("What will you do to avoid the cerberus’s attack?: one, two, or three");
		String answer9P2 = input.next();
		while (true) {
				if (answer9P2.equals("one") || answer9P2.equals("One")) {
				Shield2(input);
				break;
	}
			else if (answer9P2.equals("two") || answer9P2.equals("Two")) {
				Avoid2(input);
				break;
	}
			else if (answer9P2.equals("three") || answer9P2.equals("three")) {
				Attack2(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				Cerberus(input);
	}

	}
	}
	//create alternative for user's choice
	public static void Cyclops (Scanner input) {
		System.out.println("                                                                    \r\n" + 
				"                                                                                \r\n" + 
				"                                                                                \r\n" + 
				"                                   . ......                                     \r\n" + 
				"                           . .=D88888888D888888D. .                             \r\n" + 
				"                     .    ,8888D,.            ID888D..                          \r\n" + 
				"                       .D888.                     I88D7                         \r\n" + 
				"                     .8887                          .D88D                       \r\n" + 
				"                    D88=              ....             888:                     \r\n" + 
				"                  .D8O .        .D88888888888D.        ..888                    \r\n" + 
				"                  8D.   ..  :88888+ . ......$88888.       :8+                   \r\n" + 
				"                         .8888.   .D8888888$   .=D88D..                         \r\n" + 
				"                      .~88D,     888$.    D8D.   ..Z888.                        \r\n" + 
				"                    .D888..    .888..D888O .88.      .888,                      \r\n" + 
				"                .  D88?        .88.:888888D. 88.        D88:                    \r\n" + 
				"                .:88D.         .8D 88888888+ 88 .     .. .888.                  \r\n" + 
				"                888.           .8D D8888888. 88.           .88+                 \r\n" + 
				"                 888D.          88. D88888:.D8O         ..888D                  \r\n" + 
				"                   ,8888.        88D  .. ..D8D       .Z888D.                    \r\n" + 
				"                 ..  .$8888+..    8888888888.    ..D8888.   ,                   \r\n" + 
				"                 D88.   ..888888..  .ZDDD~. ..:D88888..   D88.                  \r\n" + 
				"       .          .888+. .  .=88888888888888888DD.     .D88D                    \r\n" + 
				"    I8.             .8888Z.  .   ..=8D8DDD$..       .D888O..           .88      \r\n" + 
				"    88.                .Z888D8                  .88888:.                88=     \r\n" + 
				"   .88                      =O                  .D,.                    ,8D     \r\n" + 
				"    88.                                                                 D8+     \r\n" + 
				"    .88D.                      .               .                      .888      \r\n" + 
				"     .O88888D.              +88D              .888.              :888888.       \r\n" + 
				"          .8888,           888..                .88.           D888~.           \r\n" + 
				"             .D88         Z8D  .              .  .88.        .88D               \r\n" + 
				"              .88.     .  8D. 8888          8888. 88+..      D88                \r\n" + 
				"              .88..   888 8D.   .888.     Z88I    88.?8D.    D8?                \r\n" + 
				"              .88   .88D ..888D   .8D    :88   .D888  .88.   .8O                \r\n" + 
				"                    D8O     .7.    D8.  .88.   .O.     .88.                     \r\n" + 
				"                   .88             8D    D8.            .88                     \r\n" + 
				"                   D8.            .88    .88             88.                    \r\n" + 
				"          .               .                                        .            \r\n" + 
				"             .$8DDDD8I...                            ..,ZDDDDD8$...             \r\n" + 
				"            $8D88D88DDD88888O.               . ..888888DD888888D88              \r\n" + 
				"                 88      .+D888888DI.... .=D888888D~...    DD.                  \r\n" + 
				"                 +8~       D8: ..$D888888888O....88.      .88                   \r\n" + 
				"                . D8.   . 88.     .               88      DD..                  \r\n" + 
				"                  .88 .  88,                 .    .88    $8$                    \r\n" + 
				"                   ,8D  .88   .88O .       ..88.   $8.. ?8D                     \r\n" + 
				"                    .8D.?8.    .Z888888888888D..   .88.88O                      \r\n" + 
				"                     .8888.        ....,...         8888.                       \r\n" + 
				"                       .D8                         .78.                         \r\n" + 
				"                                                     .                          \r\n" + 
				"                                                                                \r\n" + 
				"                                                                                \r\n" + 
				"                                                                                \r\n" + 
				"                            ..                   ..                             \r\n" + 
				"                            D888D,.     .   ..Z8888.                            \r\n" + 
				"                              .+888888888888888D.  .                            \r\n" + 
				"                                    ......                                      \r\n" + 
				"                                                                                \r\n" + 
				"                                                                  ");
		System.out.println("You chose the cyclops.");
		System.out.println("Suddenly both the tables in the room drop into the ground and the wall in front of you opens up to reveal a large underground arena.");
		System.out.println("You walk in and immediately are almost trampled by a cyclops. You look up a see the monster towering above you. For a moment you are completely dumbfounded by the situation you are currently in.");
		System.out.println("The cyclops takes a massive step forward and raises its huge spiked club to strike you.");
		System.out.println("You need to make a quick decision: 1. Use your weapon as a shield, 2. Run away from the cyclops, 3. Run towards the cyclops with your weapon.");
		System.out.println("What will you do to avoid the cyclops’s attack?: one, two, or three");
		String answer9P3 = input.next();
		while (true) {
				if (answer9P3.equals("one") || answer9P3.equals("One")) {
				Shield3(input);
				break;
	}
			else if (answer9P3.equals("two") || answer9P3.equals("Two")) {
				Avoid3(input);
				break;
	}
			else if (answer9P3.equals("three") || answer9P3.equals("three")) {
				Attack3(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				Cyclops(input);
	}

	}
	}
	//create death situation
	public static void Shield1 (Scanner input) {
		System.out.println("You chose to use your weapon as a shield.");
		System.out.println("You stick it above you, praying that it would block out all the fire.");
		System.out.println("Sadly you are poorly mistaken, and the fire consumes you.");
		System.out.println("The dragon has killed you. Try again.");
		Dragon(input);
		
	}
	public static void Shield2 (Scanner input) {
		System.out.println("You chose to use your weapon as a shield.");
		System.out.println("You stick it above you, praying that it would take all the impact for you.");
		System.out.println("Sadly you are poorly mistaken, and the cerberus’s attack kills you immediately.");
		System.out.println("The cerberus has killed you. Try again.");
		Cerberus(input);
		
	}
	public static void Shield3 (Scanner input) {
		System.out.println("You chose to use your weapon as a shield.");
		System.out.println("You stick it above you, praying that it would take all the impact for you.");
		System.out.println("Sadly you are poorly mistaken, and the club immediately kills you.");
		System.out.println("The cyclops has killed you. Try again.");
		Cyclops(input);
		
	}
	public static void Avoid1 (Scanner input) {
		System.out.println("You decide to run away from the dragon.");
		System.out.println("You turn around and bolt away, praying that you’ll avoid all the fire.");
		System.out.println("Unfortunately you weren’t able to run far enough and the fire still gets to you.");
		System.out.println("The dragon has killed you. Try again.");
		Dragon(input);
		
	}
	public static void Avoid2 (Scanner input) {
		System.out.println("You decide to run away from the cerberus.");
		System.out.println("You turn around and bolt away, praying that you’ll avoid the attack.");
		System.out.println("Unfortunately you weren’t able to run far enough and the cerberus’s paw still gets to you.");
		System.out.println("The cerberus has killed you. Try again.");
		Cerberus(input);
		
	}
	public static void Avoid3 (Scanner input) {
		System.out.println("You decide to run away from the cyclops.");
		System.out.println("You turn around and bolt away, praying that you’ll avoid the attack.");
		System.out.println("Unfortunately you weren’t able to run far enough and the club still gets to you.");
		System.out.println("The cyclops has killed you. Try again.");
		Cyclops(input);
		
	}
	public static void Attack1 (Scanner input) {
		System.out.println("You decide to run towards the dragon with your weapon.");
		System.out.println("Sprinting with your weapon positioned in front of you ready to strike, you narrowly miss the fire. You strike the dragon in the leg which ended with a large gash through its skin.");
		System.out.println("It screams in pain and takes a few steps back, attempting to recover.");
		System.out.println("You realize that this is the final moment, the dragon is injured and this is the best chance you have at defeating it.");
		System.out.println("You try and look for the best spots to attack and find three: in the middle of the chest, the wound that you previously made, and straight through the head.");
		System.out.println("Where do you decide to attack?: chest, wound, or head");
		String answer10P1 = input.next();
		while (true) {
			if (answer10P1.equals("chest") || answer10P1.equals("Chest")) {
				Chest1(input);
				break;
	}
			else if (answer10P1.equals("wound") || answer10P1.equals("Wound")) {
				Wound1(input);
				break;
	}
			else if (answer10P1.equals("head") || answer10P1.equals("Head")) {
				Head1(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				Attack1(input);
	}

	}
	}
	public static void Attack2 (Scanner input) {
		System.out.println("You decide to run towards the cerberus with your weapon.");
		System.out.println("Sprinting with your weapon positioned in front of you ready to strike, you narrowly miss the paw. You strike the cerberus in the leg which ended with a large gash through its skin.");
		System.out.println("It screams in pain and takes a few steps back, attempting to recover.");
		System.out.println("You realize that this is the final moment, the cerberus is injured and this is the best chance you have at defeating it.");
		System.out.println("You try and look for the best spots to attack and find three: in the middle of the chest, the wound that you previously made, and straight through the head.");
		System.out.println("Where do you decide to attack?: chest, wound, or head");
		String answer10P2 = input.next();
		while (true) {
			if (answer10P2.equals("chest") || answer10P2.equals("Chest")) {
				Chest2(input);
				break;
	}
			else if (answer10P2.equals("wound") || answer10P2. equals("Wound")) {
				Wound2(input);
				break;
	}
			else if (answer10P2.equals("head") || answer10P2.equals("Head")) {
				Head2(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				Attack2(input);
	}

	}
	}
	public static void Attack3 (Scanner input) {
		System.out.println("You decide to run towards the cyclops with your weapon.");
		System.out.println("Sprinting with your weapon positioned in front of you ready to strike, you narrowly miss the club. You strike the cyclops in the leg which ended with a large gash through its skin.");
		System.out.println("It screams in pain and takes a few steps back, attempting to recover.");
		System.out.println("You realize that this is the final moment, the cyclops is injured and this is the best chance you have at defeating it.");
		System.out.println("You try and look for the best spots to attack and find three: in the middle of the chest, the wound that you previously made, and straight through the head.");
		System.out.println("Where do you decide to attack?: chest, wound, or head");
		String answer10P3 = input.next();
		while (true) {
			if (answer10P3.equals("chest") || answer10P3.equals("Chest")) {
				Chest3(input);
				break;
	}
			else if (answer10P3.equals("wound") || answer10P3.equals("Wound")) {
				Wound3(input);
				break;
	}
			else if (answer10P3.equals("head") || answer10P3.equals("Head")) {
				Head3(input);
				break;
	}
			else {
				System.out.println("That is an unacceptable answer. Try again.");
				Attack3(input);
	}

	}
	}
	//create death situation
	public static void Chest1(Scanner input) {
		System.out.println("You have chosen to attack the chest.");
		System.out.println("You run up the stairs lining the walls and jump onto the monster, your"
				+ " weapon ready to attack it.");
		System.out.println("Unfortunetaly, the monster swings its arm and kills you upon impact.");
		System.out.println("The monster has killed you. Try again.");
		Attack1(input);
	}
	//create death situation
	public static void Chest2(Scanner input) {
		System.out.println("You have chosen to attack the chest.");
		System.out.println("You run up the stairs lining the walls and jump onto the monster, your"
				+ " weapon ready to attack it.");
		System.out.println("Unfortunetaly, the monster swings its arm and kills you upon impact.");
		System.out.println("The monster has killed you. Try again.");
		Attack2(input);
	}
	//create death situation
	public static void Chest3(Scanner input) {
		System.out.println("You have chosen to attack the chest.");
		System.out.println("You run up the stairs lining the walls and jump onto the monster, your"
				+ " weapon ready to attack it.");
		System.out.println("Unfortunetaly, the monster swings its arm and kills you upon impact.");
		System.out.println("The monster has killed you. Try again.");
		Attack3(input);
	}
	//create death situation
	public static void Wound1(Scanner input) {
		System.out.println("You have chosen to attack the wound.");
		System.out.println("You run at the leg that you previously attacked and stab your weapon into your wound.");
		System.out.println("The monster doesn't fall for this. It lifts up its leg and tramples you.");
		System.out.println("The monster has killed you. Try again.");
		Attack1(input);
		
	}
	//create death situation
	public static void Wound2(Scanner input) {
		System.out.println("You have chosen to attack the wound.");
		System.out.println("You run at the leg that you previously attacked and stab your weapon into your wound.");
		System.out.println("The monster doesn't fall for this. It lifts up its leg and tramples you.");
		System.out.println("The monster has killed you. Try again.");
		Attack2(input);
		
	}
	//create death situation
	public static void Wound3(Scanner input) {
		System.out.println("You have chosen to attack the wound.");
		System.out.println("You run at the leg that you previously attacked and stab your weapon into your wound.");
		System.out.println("The monster doesn't fall for this. It lifts up its leg and tramples you.");
		System.out.println("The monster has killed you. Try again.");
		Attack3(input);
		
	}//create alternative situation
	public static void Head1(Scanner input) {
		System.out.println("You have chosen to attack the head.");
		System.out.println("You run up the stairs lining the walls and jump above the monster's head.");
		System.out.println("The monster doesn't expect you and can't attack due to you not being in eyesight.");
		System.out.println("You take your weapon and stab it directly into the middle of its head.");
		System.out.println("The monster screams in pain and falls to the ground, stone cold dead.");
		Final(input);
	}
	//create alternative situation
	public static void Head2(Scanner input) {
		System.out.println("You have chosen to attack the head.");
		System.out.println("You run up the stairs lining the walls and jump above the monster's head.");
		System.out.println("The monster doesn't expect you and can't attack due to you not being in eyesight.");
		System.out.println("You take your weapon and stab it directly into the middle of its head.");
		System.out.println("The monster screams in pain and falls to the ground, stone cold dead.");
		Final(input);
	}
	//create alternative situation
	public static void Head3(Scanner input) {
		System.out.println("You have chosen to attack the head.");
		System.out.println("You run up the stairs lining the walls and jump above the monster's head.");
		System.out.println("The monster doesn't expect you and can't attack due to you not being in eyesight.");
		System.out.println("You take your weapon and stab it directly into the middle of its head.");
		System.out.println("The monster screams in pain and falls to the ground, stone cold dead.");
		Final(input);
	}
	//create final scene
	public static void Final(Scanner input) {
		System.out.println("You look up to see the walls of the room fold into each other to reveal the outside world.");
		System.out.println("A small paper floats down to your feet.");
		System.out.println("\"You have beat the labyrinth. Congratulations chosen participant.\"");
		System.out.println("                                                                                          \r\n" + 
				"                                                                                 _______       \r\n" + 
				"           .              __.....__                     __.....__        _..._   \\  ___ `'.    \r\n" + 
				"         .'|          .-''         '.               .-''         '.    .'     '.  ' |--.\\  \\   \r\n" + 
				"     .| <  |         /     .-''\"'-.  `.            /     .-''\"'-.  `. .   .-.   . | |    \\  '  \r\n" + 
				"   .' |_ | |        /     /________\\   \\          /     /________\\   \\|  '   '  | | |     |  ' \r\n" + 
				" .'     || | .'''-. |                  |          |                  ||  |   |  | | |     |  | \r\n" + 
				"'--.  .-'| |/.'''. \\\\    .-------------'          \\    .-------------'|  |   |  | | |     ' .' \r\n" + 
				"   |  |  |  /    | | \\    '-.____...---.           \\    '-.____...---.|  |   |  | | |___.' /'  \r\n" + 
				"   |  |  | |     | |  `.             .'             `.             .' |  |   |  |/_______.'/   \r\n" + 
				"   |  '.'| |     | |    `''-...... -'                 `''-...... -'   |  |   |  |\\_______|/    \r\n" + 
				"   |   / | '.    | '.                                                 |  |   |  |              \r\n" + 
				"   `'-'  '---'   '---'                                                '--'   '--'       ");
		
	}
	
	
	
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

