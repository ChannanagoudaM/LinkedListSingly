package com.hlo;

public class Main {

	public static void main(String[] args) {
Functions f=new Functions();
f.insert(10);
f.insert(20);
f.insert(30);
f.insert(40);
f.insert(50);
f.display();
System.out.println(f.size());
f.insetrtFirst(5);
f.display();
System.out.println(f.size());
f.insertLast(60);
f.display();
System.out.println(f.size());
f.deleteFirst();
f.display();
System.out.println(f.size());
f.deleteLast();
f.display();
System.out.println(f.size());
f.delete(1);
f.display();
System.out.println(f.size());
System.out.println(f.find(60));
	}

}
