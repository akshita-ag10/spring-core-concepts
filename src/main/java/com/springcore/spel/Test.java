package com.springcore.spel;


import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static int sum(int p , int q) {
		return p+q;
	}
	
	
	public static void main(String[] args) {
		
		int a = 23;
		
		SpelExpressionParser temp = new SpelExpressionParser();
//		direct expressions
		Expression exp = temp.parseExpression("11+33");
//		variables
		Expression exp2 = temp.parseExpression(String.valueOf(a));
//		methods
		Expression exp3 = temp.parseExpression(String.valueOf(sum(1, 4)));

//		standalone
//		obj
//		classes
//		coustructors
//		char, numerics, operators,keywords and special symbols with a return value
		


		System.out.println(exp.getValue());
		System.out.println(exp2.getValue());
		System.out.println(exp3.getValue());
	}

}
