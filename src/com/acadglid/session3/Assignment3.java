
/*
 * Create a program to demonstrate Constructor Chaining. Between the same class
	and between the child and parent class.
	Parent is having two constructor and showcase chaining by use of this() childclass uses super();
 */

package com.acadglid.session3;

public class Assignment3 {

	public static void main(String arg[]){

		//1. Creation of parent class object 

		ParentClass objParent = new ParentClass("Parent",32);

		//2. Creation of child class object

		ChildClass objChild = new ChildClass("fromSuper");

	}




}
