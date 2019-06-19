package com.lambadas.main;

import com.lambdas.consumers.ConsumeInterfaces;

public class Driver {

	public static void main(String[] args) {
		// Demo of lambda expression
		
		ConsumeInterfaces consumeObj = new ConsumeInterfaces();
		consumeObj.runLambdaCode( () -> System.out.println("Hello World!"));
		consumeObj.runParamCode(System.out::println, "Display me");
		// or the above statement can br written as
		consumeObj.runParamCode(s->System.out.println(s), "Another example");
		// Lets add two numbers
		Object result = consumeObj.runParamCodeWithResult((s1,s2)-> s1+s2, new Integer(1) , new Integer(2));
		System.out.println("Result is " + result);
		
		// We can do this another thing
		String example ="one";
		result = consumeObj.process(example::substring, 0);
		System.out.println(result);
		
		
		
		
	}

}
