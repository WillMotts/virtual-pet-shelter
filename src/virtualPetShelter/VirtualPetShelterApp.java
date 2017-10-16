package virtualPetShelter;

import java.util.Random;
import java.util.Scanner;

import virtualPetShelter.VirtualPet;

public class VirtualPetShelterApp {
	static String doPetChoice;
	static int menuChoice;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int petLife = rand.nextInt(10) + 1;
		VirtualPet pet = new VirtualPet(50, 50, 50);
		String namePet = "";

		System.out.println("Hello! Welcome to Virtual Pet simulator!");
		System.out.println("Would you like to meet the pets at the shelter? y/n");
		String yesNo = input.nextLine();
		do {
			menuOptions();
			while (menuChoice != -1) {

				if (menuChoice == 1) {
					System.out.println("This is Timmy!");
					namePet.equals("Timmy");
				} else if (menuChoice == 2) {
					System.out.println("This is Jimmy!");
					namePet.equals("Jimmy");

				} else if (menuChoice == 3) {
					System.out.println("This is Binny!");
					namePet.equals("Binny");
				} else if (menuChoice == 4) {
					System.out.println("this is bob.");
					namePet.equals("bob");
				} else if (menuChoice == 5) {
					System.out.println("\nWhat will you name your pet?");
					namePet = input.nextLine();
					if (namePet.equals("tim")) {
						System.out.println("That name sucks...");
					} else {
						System.out.println("That's a great name!");
					}

				}

				if (petLife > 1) {
					doPetOptions();

					do {
						doPetChoice = input.nextLine();

						if (doPetChoice.equals("1")) {
							System.out.println("You give " + namePet + " food!");
							System.out.println("How much food?");
							int feedAmount = input.nextInt();
							pet.feedPet(feedAmount);
							System.out.println("You gave " + feedAmount + " food!");
							System.out.println("Pet hunger is " + pet.getHunger());
							System.out.println("\nWhat would you like to do?");

						} else if (doPetChoice.equals("2")) {
							System.out.println("You give " + namePet + " water!");
							System.out.println("How much water?");
							int drinkAmount = input.nextInt();
							pet.drinkPet(drinkAmount);
							System.out.println("You gave " + drinkAmount + " water!");
							System.out.println("Pet thirst is " + pet.getThirst());
							System.out.println("\nWhat would you like to do?");

						} else if (doPetChoice.equals("3")) {
							System.out.println("You play with " + namePet + "!");
							System.out.println("How long do you play with " + namePet + "?");
							int playAmount = input.nextInt();
							pet.playPet(playAmount);
							System.out.println("You play with " + namePet + " for " + playAmount + " minutes!");
							System.out.println("Your pet boredom is " + pet.getBoredom());
							System.out.println("\nWhat would you like to do?");

						} else if (doPetChoice.equals("4")) {
							System.out.println("Pet boredom is " + pet.getBoredom());
							System.out.println("Pet thirst is " + pet.getThirst());
							System.out.println("Pet hunger is " + pet.getHunger());

						}
						if (pet.getThirst() <= 0) {
							System.out.println(namePet + " is dead!");
							break;

						}
						if (pet.getBoredom() <= 0) {
							System.out.println("\nJust kidding!");
							System.out.println(namePet + "bored to death!");
							break;
						}
						if (pet.getHunger() <= 0) {
							System.out.println("\nJust kidding!");
							System.out.println(namePet + " starved to death!");
							break;
						}
						if (pet.getHunger() > 100) {
							System.out.println("\nJust kidding!");
							System.out.println("Your pet died of diabetes!");
							break;
						}
						if (pet.getThirst() > 100) {
							System.out.println("\nJust kidding!");
							System.out.println("Your pet drowned!");
							break;
						}
						if (pet.getBoredom() > 100) {
							System.out.println("\nJust kidding!");
							System.out.println(namePet + " died from excited delirium...");
							break;
						}

						pet.doTick(1);

					} while (!doPetChoice.equals("5"));

				} else {
					System.out.println(namePet + " Was hit by a car...!");
				}
			}
			while (yesNo.equals("y"))
				;
		} while (yesNo.equals("y"));

	}

	public static void menuOptions() {
		System.out.println("\nMeet the friends!");
		System.out.println("Press 1 to look at: Timmy!");
		System.out.println("Press 2 to look at: Jimmy!");
		System.out.println("Press 3 to look at: Binny!");
		System.out.println("Press 4 to look at: bob. ");
		System.out.println("Press 5 to become God!");
		System.out.println("Press -1 to exit");
		menuChoice = input.nextInt();
	}

	public static void doPetOptions() {
		System.out.println("\nWhat would you like to do?");
		System.out.println("1: To give food!");
		System.out.println("2: To give water!");
		System.out.println("3: Play with!");
		System.out.println("4: Check pet status!");
		System.out.println("5: To exit...");
		doPetChoice = input.nextLine();
	}
}
