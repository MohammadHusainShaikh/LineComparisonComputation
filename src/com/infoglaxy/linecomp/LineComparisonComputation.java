package com.infoglaxy.linecomp;

import java.util.Scanner;

public class LineComparisonComputation {
	
	int x1;
	int x2;
	int y1;
	int y2;
	//double length;

	 
		public void input() {
			System.out.println("Enter the X1,Y1 and X1,Y2 Points for the Line:");
			Scanner scanner = new Scanner(System.in);
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
		
		}
		double lineCalculate() {
			return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			//System.out.print("Length of Line="+length);
		}
	
		public void checkEquality(LineComparisonComputation lineComparisonCoputation2) {
			if(this.lineCalculate() == lineComparisonCoputation2.lineCalculate())
			{
				System.out.println("Line are same");
			}else {
				System.out.println("Line are not same");
			}
		}
	
	
		
	
		public static void main(String[] args) {
			System.out.println("Welcome to Line Comparison Computation problem");
			LineComparisonComputation lineComparisonComputation = new LineComparisonComputation();
			lineComparisonComputation.input();
			LineComparisonComputation lineComparisonComputation2 = new LineComparisonComputation();
			lineComparisonComputation2.input();
			
			lineComparisonComputation.checkEquality(lineComparisonComputation2);
		}

}
