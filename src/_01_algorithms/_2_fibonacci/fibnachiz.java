package _01_algorithms._2_fibonacci;

public class fibnachiz {

	public fibnachiz() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int number1=0;
		int number2=1;
		int sum =number1+number2;
		System.out.println(number1);
		System.out.println(number2);
		for(i=0;i<10;i++) {
			System.out.println(sum);
			number1=number2;
			number2=sum;
			sum=number1+number2;
		}
		}
 //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 
}
