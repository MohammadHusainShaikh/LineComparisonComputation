package com.infoglaxy.linecomp;

import java.util.Scanner;

public class LineComparisonComputation {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation problem");
		int x1;
		int x2;
		int y1;
		int y2;
		double length;
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter the X1,Y1 and X1,Y2 Points for the Line:");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
	
		// Length of Line  = sqrt ( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)
		length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.print("Length of Line="+length);

	}

}
