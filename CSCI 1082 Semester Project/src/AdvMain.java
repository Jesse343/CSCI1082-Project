import java.util.Scanner;

public class AdvMain {
	
	public static void main(String[] args) {
		
		Scanner survivor = new Scanner (System.in);
		
		System.out.println("Welcome to [insert game title here]!");
		System.out.println("This is a survival text-adventure game! \n"
				+ "Your objective is to stay alive and get to the evacuation center"
				+ " and escape the city that is crawling with zombies! \t");
		System.out.println("You may encounter things that can help you or hinder you,"
				+ " all is based on your decisions and will affect the outcome of the end.");
		System.out.println("Before we begin, what is your name?: \n"
				+ "Name: ");
		String name = survivor.nextLine();
		while (name == null || name.isEmpty()) {
			System.out.println("*your name cannot be empty!*");
			System.out.print("Please enter your character's name: ");
			name = survivor.nextLine();
		}
		
		System.out.println("\nOkay " + name + ", just recently, there's been an outbreak."
				+ " The city is infested with the walking dead, fortunately the military"
				+ "\nis still evacuating civilians out of the city. You best be one of them"
				+ ", unless you'll trying to get teared and chewed up by the undead!"
				+ "\nGood Luck!\n");
		System.out.println("First, I need some supplies, I wont get far without them,"
				+ " Where should I go?"
				+ "\n A: Super Market      B: Gunshop");
		
		survivor.close();
	
	}
	
	
}
