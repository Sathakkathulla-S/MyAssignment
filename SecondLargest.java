package assignment.week2.home.day1;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			//System.out.println(data[i]);
			//System.out.println("The second largest "+data[i]);
		}
		int secLa=data[data.length-2];
		
		System.out.println(secLa);
		
	}

	
	

}
