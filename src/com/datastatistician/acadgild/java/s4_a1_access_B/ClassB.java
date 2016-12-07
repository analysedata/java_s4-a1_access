package com.datastatistician.acadgild.java.s4_a1_access_B;

import com.datastatistician.acadgild.java.s4_a1_access_A.ClassA;

public class ClassB extends ClassA {

	public static void main(String[] args) {

		// To call the subclass method,
		// instantiate a ClassB object
		ClassB classB = new ClassB();

		// Invoke the subclass method
		classB.subClassMethod();

	}

	// In order to access the parent method in ClassA, create
	// a subclass method and invoke the parent protected method.
	// Make sure that ClassA is imported
	public void subClassMethod() {

		parentProtectedMethod();

	}

}
