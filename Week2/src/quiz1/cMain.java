package quiz1;

import java.util.Scanner;

public class cMain {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int TD,ATT,COMP,YDS,INT;
		
		
		System.out.println("Welcome to use QB rating");
		System.out.print("Please tell me the number of touchdown passes:");
		TD = reader.nextInt();
		System.out.print("Please tell me the number of passing yards:");
		YDS = reader.nextInt();
		System.out.print("Please tell me the number of interceptions:");
		INT = reader.nextInt();
		System.out.print("Please tell me the number of completions:");
		COMP = reader.nextInt();
		System.out.print("Please tell me the number of passing attempts:");
		ATT = reader.nextInt();
		
		double a = (double)COMP / (double)ATT - 0.3;
		a = a * 5;
		if(a > 2.375){
			a = 2.375;
		}else if(a < 0 ){
			a = 0;
		}
		
		double b = (double)YDS / (double) ATT -3.0;
		b = b * 0.25;
		if(b > 2.375){
			b = 2.375;
		}else if(b < 0 ){
			b = 0;
		}
		
		double c = (double)TD / (double)ATT * 20;
		if(c > 2.375){
			c = 2.375;
		}else if(c < 0 ){
			c = 0;
		}
		
		double d = (double)INT / (double)ATT * 25;
		d = 2.375 - d;
		if(d > 2.375){
			d = 2.375;
		}else if(d < 0){
			d = 0;
		}
		
		double result = a + b + c + d;
		result = result / 6;
		result = result * 100;
		
		System.out.println("The QB rating of this player is:" + result);
		reader.close();
	}

}

