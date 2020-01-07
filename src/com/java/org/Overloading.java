package com.java.org;

public class Overloading {
	public void student (int id) {
		System.out.println("id is"+id);
		}
public void student(String name) {
	System.out.println( "name is"+name);
	}
public void student(char grade,String name) {
	System.out.println("grade@ name"+grade+name);

}
public static void main(String[] args) {
	Overloading o=new Overloading();
	o.student(10);
	o.student("baa");
	o.student('a',"bay");
	
}
}
