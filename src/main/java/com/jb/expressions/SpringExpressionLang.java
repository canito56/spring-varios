package com.jb.expressions;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringExpressionLang {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'");
		String message = (String) exp.getValue();
		System.out.println(message);
		
		exp = parser.parseExpression("'Hello World'.bytes");
		byte[] bytes = (byte[]) exp.getValue();
		System.out.println(bytes);
		
		exp = parser.parseExpression("'Hello World'.bytes.length");  
		int length = (Integer) exp.getValue();
		System.out.println(length);
		
		exp = parser.parseExpression("new String('hello world').toUpperCase()");
		String message2 = exp.getValue(String.class);
		System.out.println(message2);
	}

}
