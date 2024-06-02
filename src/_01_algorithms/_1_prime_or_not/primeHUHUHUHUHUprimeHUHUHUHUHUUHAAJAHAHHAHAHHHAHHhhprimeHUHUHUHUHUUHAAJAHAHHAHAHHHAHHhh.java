package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeHUHUHUHUHUprimeHUHUHUHUHUUHAAJAHAHHAHAHHHAHHhhprimeHUHUHUHUHUUHAAJAHAHHAHAHHHAHHhh {

	public primeHUHUHUHUHUprimeHUHUHUHUHUUHAAJAHAHHAHAHHHAHHhhprimeHUHUHUHUHUUHAAJAHAHHAHAHHHAHHhh() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String input =JOptionPane.showInputDialog(null, "Give me any number you want any thing possible");
				int i=2;
				boolean isprime=true;
				int number=Integer.parseInt(input);
				for(i=2;i<number;i++) {
					if(number % i == 0) {
					isprime=false;
				}
					
				}
				if(isprime==true) {
					JOptionPane.showMessageDialog(null, "this number is prime");
				}
				else {
					JOptionPane.showMessageDialog(null, "this number is not prime");
				}
			
				
			
	}

}
