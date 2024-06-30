package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkillPractice skills = new SkillPractice();
        skills.skill1();
        skills.skill2();
        skills.skill3();
        skills.skill4();
        skills.skill5();


	}

	private void skill5() {
		// TODO Auto-generated method stub
		String l=JOptionPane.showInputDialog("What is your School?");
		String o=JOptionPane.showInputDialog("Do you like your School?");
		if(o.equals("yes")) {
			JOptionPane.showMessageDialog(null, "I sure hope you have a good time in "+l);
		}if(o.equals("no")) {
			JOptionPane.showMessageDialog(null, "You should drop out from "+l);
		}else {
			JOptionPane.showMessageDialog(null, "Youre neutral in "+l);
		}
	}

	private void skill4() {
		// TODO Auto-generated method stub
		String base=JOptionPane.showInputDialog("What city do you live in?");
		if(base.equals("san diego")) {
			String John=JOptionPane.showInputDialog("Do you like it there yes or no");
			if(John.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Congrats hope you would like youre current stay in san diego");
			}
			if(John.equals("no")) {
				JOptionPane.showMessageDialog(null, "Oh my you should get a therapist");
			}else {
				JOptionPane.showMessageDialog(null, "I would suppose you like the the glorius city of san diego");
			}
		}else {
			JOptionPane.showMessageDialog(null, "You shoulg go to san diego ( :");
		}
	}

	private void skill3() {
		// TODO Auto-generated method stub
	
		Random ran = new Random();
	int number = 0;
		for (int i=0; i<1; i++) {
		number=ran.nextInt(20);
		JOptionPane.showMessageDialog(null, "This is the first number "+number);
		}int number1 = 0;
		for (int j=0; j<1; j++) {
			number1=ran.nextInt(10);
			JOptionPane.showMessageDialog(null, "This is the second number "+number1);
			}
		int morgan=number-number1;
			JOptionPane.showMessageDialog(null, "Heres the diffrence of the numbers "+morgan);
	}

	private void skill2() {
		// TODO Auto-generated method stub
		for(int i=1;i<31;i++) {
			if(i%3==0) {
			JOptionPane.showMessageDialog(null, i);	
			}
		}
	}

	private void skill1() {
		// TODO Auto-generated method stub
		String input=JOptionPane.showInputDialog("how many dimes do you have?");
		int num =Integer.parseInt(input);
		double inpu=num*0.1;
		JOptionPane.showMessageDialog(null, "You have "+inpu+"$");
		String iput=JOptionPane.showInputDialog("how tall are you in inches");
		int nu =Integer.parseInt(iput);
		if(nu<=36) {
			JOptionPane.showMessageDialog(null, "You need to eat your wheats");
		}else {
			JOptionPane.showMessageDialog(null, "YOure......Alright");
		}
	}
	}


