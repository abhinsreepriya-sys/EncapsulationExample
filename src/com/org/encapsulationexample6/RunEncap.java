package com.org.encapsulationexample6;

public class RunEncap {

	   public static void main(String args[]) {
	      TestEncap encap = new TestEncap();
	      encap.setName("James");
	      encap.setAge(20);
	      encap.setIdNum("12343ms");

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	   }
	}
