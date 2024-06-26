package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		int happinessLevel = 0;
		String input=JOptionPane.showInputDialog("what pet do you want dog, cat and guinea pig");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		if(input.equals("dog"))	{
		int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Water", "feed", "walk", "sleep juice", "pat" }, null);
		
		if(task==0) {
			water(happinessLevel);
		}		
		if(task==1) {
			feed(happinessLevel);
		}		
		if(task==2) {
			walk(happinessLevel);
		}		
		if(task==3) {
			sleep(happinessLevel);
		}		
		if(task==4) {
			pat(happinessLevel);
			
		}
			if(happinessLevel==-100) {
				JOptionPane.showMessageDialog(null, "You killed the Dog how dare you by the way where did you found the neddle I need it for my dog");
			}
		}
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
 
 	}
	
	private static void water(int happinessLevel) {
		
		happinessLevel+=2;
	}	
	private static void feed(int happinessLevel) {
		
		happinessLevel+=1;
	}	
	private static void sleep(int happinessLevel) {
		
		happinessLevel-=100;
	}	
	private static void pat(int happinessLevel) {
		
		happinessLevel+=3;
	}	
	private static void walk(int happinessLevel) {
		
		happinessLevel+=4;
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
}