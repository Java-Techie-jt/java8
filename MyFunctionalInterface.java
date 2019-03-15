package com.javatechie.lambda.demo;

public interface MyFunctionalInterface {

	void m1();

	default void m2() {
		System.out.println("Default method-1");
	}

	default void m3() {
		System.out.println("Default method-2");
	}

	static void m4() {
		System.out.println("static method-1");
	}
}
