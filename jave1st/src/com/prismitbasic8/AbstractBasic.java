package com.prismitbasic8;
/*
 * trying to make a basic abstract class
 * @raj version 1.7
 */
  public class AbstractBasic {

//creating instance object

	public static void main(String[] args) {
	 Base b =new Derived();
		b.fun();
	
  }
  }
  // abstract declaration
abstract class Base {
//declaring empty construstor
Base(){
	System.out.println("derived construstor called" );// printing the derived construstor 
	}
//abstract method 
abstract void fun();
}
//extanding abstract class
class Derived extends Base{
// declaring empty construst
//Derived(){
	//System.out.println("derived construstor called");
	//}
// extanding abstract fun method in derived class 
	void fun() {
		System.out.println("derived fun() called");
		}
	}
