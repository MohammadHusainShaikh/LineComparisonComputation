package com.infoglaxy.linecomp;

import java.util.Scanner;

public class LineComparisonComputation {
	
	int x1;
	int x2;
	int y1;
	int y2;
	//double length;

	 
		public void input(int x1, int x2, int y1, int y2) {
			System.out.println("Enter the X1,Y1 and X1,Y2 Points for the Line:");
		
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x1;
			this.y2 = x2;
		
		}
		double lineCalculate() {
			return Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
			//System.out.print("Length of Line="+length);
		}
	
		public void checkEquality(LineComparisonComputation lineComparisonComputation2) {
			if(this.lineCalculate() == lineComparisonComputation2.lineCalculate())
			{
				System.out.println("Line are same");
			}
				else if(this.lineCalculate() > lineComparisonComputation2.lineCalculate()){
					System.out.println("Line 1 length is greter then line 2 length");
				}
				else {
				System.out.println("Line 2 length is greter then line 1 length");
			}
		}
	
	
		
	
		public static void main(String[] args) {
		
			LineComparisonComputation lineComparisonComputation = new LineComparisonComputation();
			lineComparisonComputation.input(10, 20, 30, 40);
			System.out.println("----------------------------------------------");
			LineComparisonComputation lineComparisonComputation2 = new LineComparisonComputation();
			lineComparisonComputation2.input(20, 20, 40, 50);
			System.out.println("----------------------------------------------");
			lineComparisonComputation.checkEquality(lineComparisonComputation2);
		}

}
