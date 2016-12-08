package com.company;

import java.util.Scanner;

public class Kwadrat {

	public static void main(String[] args) 
	{
		System.out.println("Podaj parametry r�wnania kwadratowego ax2+bx+c");
		Scanner skaner = new Scanner(System.in);
		double a = skaner.nextDouble();
		double b = skaner.nextDouble();
		double c = skaner.nextDouble();
		double delta = b*b-4*a*c;
		if (delta>0)
		{
			delta = Math.sqrt(delta);
			double x1 = (-b - delta)/(2*a);
			double x2 = (-b + delta)/(2*a);
			System.out.println("Pierwiastki r�wnania to:" + x1 + " oraz " +x2);
			
		}
		else if (delta == 0 )
		{
		double x0 = -b/(2*a);
		System.out.println("Pierwiastek podw�jny r�wnania to: " + x0);
		}
		else if (delta<0)
		{
			System.out.println(" R�wnanie nie posiada pierwiastk�w rzeczywistych ");
			
		}
		
	}

}
