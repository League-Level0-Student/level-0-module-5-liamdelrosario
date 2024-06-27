package _02_nested_loops._3_for_loop_gauntlet;
/**
 * 
 */


import javax.swing.JOptionPane;
public class RF {
/**
 * @author league
 *
 */

	
	/**
	 * 
	 */

		// TODO Auto-generated constructor stub
		
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	
		// TODO Auto-generated method stub
	String sigh =	JOptionPane.showInputDialog("Sigh im bored so lets make a story, you have two options a)western or b)medieval. respond either as a or b");
	if(sigh.equals("a")) {
		String no=JOptionPane.showInputDialog("Your name is Arthur a famous outlaw you are traveling with your gang going further east to run away from the pinkertons as your gang was about to cross a river they spoted a town called Blackwater and planned to rob it should you rob it a)yes or b)no");	
		if(no.equals("a")) {
		String op=JOptionPane.showInputDialog("You took your chances and you and your gang decide to go to the town it nice for now but you had plans on the bank so a) go on the ferry or b) in the bank");
	if(op.equals("a")) {
		JOptionPane.showMessageDialog(null, "While on the boat the ferry was a sneak attack for the pinkertons and they shoot you to death almost immediatly you died duh");
	}
	if(op.equals("b")) {
		JOptionPane.showMessageDialog(null,"you go to the bank and see it is a surprised attack you thought it is crazy how dutch and the other were surviveing on that boat you shred through the pinkertons to the point your bounty gets to 5000$ and dutch tells us to organize and run it was a disaster you lost man posesions and 150000$ not only that you lost Jenny and Davey was wounded and two others lost in the battle but hey you survived and going to the mountains");
	}
	}
	if(no.equals("b")) {
		String l=JOptionPane.showInputDialog( "So you said no and the leader aggred to you he says how some members saw those pinkertonsso a) croosed the large mountains in large storm or b) croosed the gigantic lake. ");
		if(l.equals("a")) {
			JOptionPane.showMessageDialog(null, "You decided to croos the mountains the storm was unexpected to everyone shocked it was bad many members died and fall of and your eqipment will fall of along with your cargo then all the sudden you met Colm and his gang your biggest rival it was mass shoutout at the end whatever was left of the odricos left you lost so many people Bill, Javier, basically everyone all but John, Lenny and Jack then you saw that Dutch and Colm agreeded to duel it was very tense and when they drawed they both shoot eachother killing eacthother Arthur was shocked and they moved on building a home with whatever was left of the gang on Annesberg");
		}
		if(l.equals("b")) {
			JOptionPane.showMessageDialog(null, "Dutch said I Have A Plan the plan was to steal a boat and go to Saint Denis so you rob a boat brought everyone in there and croosed the gigantic lake while there you realise the pinkertons were chasing you so you defended the gang  it was a sucesful fight you did not lost anyone and you quickly booked a boat straight to Tahiti to harvest mangos and stuff and when the day came no more pinkertons just free people forever and ever");
		}
	}
	
	if(sigh.equals("b")) {
		String qwe=JOptionPane.showInputDialog("ILL make a story later so do you choose thefirst option a or the second option b");
			if(qwe.equals("a")) {
				JOptionPane.showMessageDialog(null,"After doing that act yeach the guards were not to found about that so killed while being chased by that thing in doing so the guards die to");
			}
		if(qwe.equals("b")){
			String qa=	JOptionPane.showInputDialog("Just now something came then attack you what ever should you do a(run, b(fight");
			if (qa.equals("a")) { 
			 JOptionPane.showMessageDialog(null, "While running away you got shoot by some plasma and died")	;
			}
			if (qa.equals("b")) {
				JOptionPane.showMessageDialog(null, "You defended you and your partner? But you defeated it");
			}
			
			}
	}
	}
	}


	
}
