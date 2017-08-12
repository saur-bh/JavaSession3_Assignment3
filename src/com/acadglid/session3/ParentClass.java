/*
 * This is parent class where showcase of chaining constructor is show. 
 * 
 */

package com.acadglid.session3;

public class ParentClass {


	// default constructor 
	ParentClass(String name){


		System.out.println("Hello " +name+ " I was called by two parameter constructor by use of this();");


	}

	ParentClass( String name,int age){

		this(name); //Use of this(); will call the default constructor which is with one argument, showcase of chaining of consturctor in same class 

		System.out.println("I got age "+age+" I am printed after default constructor"); 


	}

}
