package com.tech.pranav.practice;
import java.util.Scanner;
public class Calcu {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int b,c;
	int d,e,f,g;
	System.out.println("Enter the value of b:");
	b = sc.nextInt();
	System.out.println("Enter the value of c:");
	c =sc.nextInt();
	d= b+c;
	e = b-c;
	f=b*c;
	g = b/c;
	System.out.println("Add:"+d+"\t"+"Subtract: "+e+"\t"+"Multiplication: "+f+"\t"+"Division: "+g);
	sc.close();
}
}

