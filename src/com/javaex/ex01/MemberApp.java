package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member MB1 = new Member("정우성","jws",50000);
		Member MB2 = new Member("유재석","yjs",50000);
		Member MB3 = new Member("이효리","lhr",50000);
		
		MB1.showinfo();
		MB2.showinfo();
		MB3.showinfo();
		
	}

}
