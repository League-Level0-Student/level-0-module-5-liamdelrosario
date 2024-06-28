package _04_practice._1_skill_practice;

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
		
	}

	private void skill4() {
		// TODO Auto-generated method stub
		
	}

	private void skill3() {
		// TODO Auto-generated method stub
		
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
		JOptionPane.showMessageDialog(null, "You have "+inpu+" cents");
		String iput=JOptionPane.showInputDialog("how tall are you in inches");
		int nu =Integer.parseInt(iput);
		if(nu<=36) {
			JOptionPane.showMessageDialog(null, "You need to eat your wheats");
		}else {
			JOptionPane.showMessageDialog(null, "YOure......Alright");
		}
	}
	}


