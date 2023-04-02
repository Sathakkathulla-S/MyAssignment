package assignment.day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		int input =5;
		for (i=1; i<=input; i++) {
			fact=fact*i;
			
		}
		System.out.println("The Factorial number of " + input + " is: "+ fact);

	}

}

