package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class JavaYPythN {
	public static void main(String[] args) {
		Robot rob= new Robot();

		String input=JOptionPane.showInputDialog("what shape do you want? Square,Triangle and Circle");
	if(input.equals("square")) {
		String it=JOptionPane.showInputDialog("Thanks for picking sqaure what color do you want Red blue and green or random");
		if(it.equals("red")) {
			rob.setPenColor(Color.red);
			drawSquare(rob);
		}
		if(it.equals("green")) {
			rob.setPenColor(Color.green);
			drawSquare(rob);
		}
		if(it.equals("blue")) {
			rob.setPenColor(Color.blue);
			drawSquare(rob);
		}else {
			rob.setRandomPenColor();
			drawSquare(rob);

		}
	}
	if(input.equals("triangle")) {
		String it=JOptionPane.showInputDialog("Thanks for picking triangle what color do you want Red blue and green or random");
		if(it.equals("red")) {
			rob.setPenColor(Color.red);
			drawTriangle(rob);
		}
		if(it.equals("green")) {
			rob.setPenColor(Color.green);
			drawTriangle(rob);
		}
		if(it.equals("blue")) {
			rob.setPenColor(Color.blue);
			drawTriangle(rob);
		}else {
			rob.setRandomPenColor();
			drawTriangle(rob);

		}
	}
	if(input.equals("circle")) {
		String it=JOptionPane.showInputDialog("Thanks for picking circle (: what color do you want Red blue and green or random");
		if(it.equals("red")) {
			rob.setPenColor(Color.red);
			drawCirlce(rob);
		}
		else if(it.equals("green")) {
			rob.setPenColor(Color.green);
			drawCirlce(rob);
		}
		if(it.equals("blue")) {
			rob.setPenColor(Color.blue);
			drawCirlce(rob);
		}else {
			rob.setRandomPenColor();
			drawCirlce(rob);

		}
	}else {
		JOptionPane.showMessageDialog(null, "Sorry that is not a shape im going to do");
	}
					//drawSquare();
					//drawTriangle();
					//drawCirlce();
}
	
	public static void drawSquare(Robot rob) {
		
				rob.penDown();
				rob.setPenWidth(20);
				for(int i=0;i<=3;i++) {
					rob.setSpeed(100);
						rob.move(70);
						rob.turn(90);
		}
	}
	public static void drawTriangle(Robot rob) {
		
		rob.penDown();
		rob.setPenWidth(20);
		for(int i=0;i<=2;i++) {
			rob.setSpeed(100);
			
			rob.move(200);
					rob.turn(120);
}
		
	}
	public static void drawCirlce(Robot rob) {
		
		rob.penDown();
		rob.setPenWidth(20);
		for(int i=0;i<=359;i++) {
			rob.setSpeed(100);
			
			rob.move(2);
					rob.turn(1);
}
	}
}