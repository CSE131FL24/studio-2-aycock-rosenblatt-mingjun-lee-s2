package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("What's your starting amount?");
		double startAmount = s.nextDouble();
		System.out.println("What is the win chance?");
		double winChance = s.nextDouble();
		System.out.println("What is the win limit?");
		double winLimit = s.nextDouble();
		System.out.println("How many simulations do you want to run?");
		int simNum = s.nextInt();
		int i=0;
		int timesRan = 0;
		
		while(i<simNum)
		{
		while((startAmount >= 1) && (startAmount < winLimit)) {
			double number = Math.random()*101;
			if(number > winChance)
			{
				startAmount = startAmount --;
				timesRan ++;
			}
			else
			{
				startAmount ++;
				timesRan ++;
			}
			System.out.println(number);
			System.out.println(startAmount);
	
		}
		   i++;
			if (startAmount==0) {
				System.out.println("lose "+ timesRan);
			}
			if (startAmount==winLimit) {
				System.out.println("win "+ timesRan);
		   
		}
		}
		 
		 }
		
		
		
		
		
		
	}




