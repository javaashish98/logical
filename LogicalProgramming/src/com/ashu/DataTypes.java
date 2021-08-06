package com.ashu;

import java.util.Scanner;

public class DataTypes {

	
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		float b=scan.nextFloat();
		double c=scan.nextDouble();
		long l=scan.nextLong();
		byte d=scan.nextByte();
	
		//System.out.print("");
		int x=-20;
		System.out.print(x);
		System.out.print("------------");
		double step1=c/b;
		float step2=b/a;
		double step3=c/a;
		double step4=step3+l;
		int step5=a/d;
		System.out.println(step1+" "+step2+" "+step3+" "+step4+" "+step5);
		scan.close();
	}

}
