package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	 // 1. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	 static int happinessLevel = 0;

	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable

		String input = JOptionPane.showInputDialog("what pet do you want dog, cat and guinea pig");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!

		// 4. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		if (input.equals("dog")) {
			while (happinessLevel < 10) {

				int task = JOptionPane.showOptionDialog(null, "kill the dog", "Title", 0, JOptionPane.INFORMATION_MESSAGE,
						null, new String[] { "Water", "feed", "walk", "sleep juice", "pat" }, null);

				if (task == 0) {
					water();
				}
				if (task == 1) {
					feed();
				}
				if (task == 2) {
					walk();
				}
				if (task == 3) {
					sleep();

				}
				if (task == 4) {
					pat();
				}
				if(happinessLevel<=-10) {
					
					JOptionPane.showMessageDialog(null, "Your pet loves you");
					break;
				}
			}
			JOptionPane.showMessageDialog(null,
					"You killed the Dog how dare you by the way where did you found the neddle I need it for my dog");
		}

		if (input.equals("cat")) {
			while (happinessLevel < 10) {
				int task = JOptionPane.showOptionDialog(null, "qwertyuiopasdfghjklzxcvbnm", "Title", 0, JOptionPane.INFORMATION_MESSAGE,
						null, new String[] { "Water", "feed", "walk", "sleep juice", "pat" }, null);

				if (task == 0) {
					water();
				}
				if (task == 1) {
					feed();
				}
				if (task == 2) {
					walk();
				}
				if (task == 3) {
					sleep();

				}
				if (task == 4) {
					pat();
				}
if(happinessLevel<=-10) {
					
					JOptionPane.showMessageDialog(null, "Your pet loves you");
					break;
				}

			}
			JOptionPane.showMessageDialog(null, "You hurt cat");
		}
		if (input.equals("guinea pig")) {
			while (happinessLevel < 10) {
				int task = JOptionPane.showOptionDialog(null, "Choose something for guinea pig", "dw", 0,
						JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Water", "feed", "walk", "sleep juice", "pat" }, null);
				if (happinessLevel >= 10) {
				}
				if (task == 0) {
					water();
				}
				if (task == 1) {
					feed();
				}
				if (task == 2) {
					walk();
				}
				if (task == 3) {
					sleep();

				}
				if (task == 4) {
					pat();
				}
					if(happinessLevel<=-10) {
					
					JOptionPane.showMessageDialog(null, "Your pet loves you");
					break;
				}

			}
		}else {
			JOptionPane.showMessageDialog(null, "Sorry we do not have that");
		}
		JOptionPane.showMessageDialog(null, "Your pet loves you");

		// 6. Use user input to call the appropriate method created in step 5 below.

		// 7. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
		
	}

	private static void water() {

		happinessLevel += 2;
	}

	private static void feed() {

		happinessLevel += 1;
	}

	private static void sleep() {

		happinessLevel -= 100;
	}

	private static void pat() {

		happinessLevel += 3;
		System.out.println("pat");
		System.out.println(happinessLevel);
	}

	private static void walk() {

		happinessLevel += 4;
		System.out.println("walk");
		System.out.println(happinessLevel);

	}

	// 5. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

}