package com.javaex.ex10;

public class Book {
	private int bookNo, stateCode;
	private String title, author;
	//생성자
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
	//getter setter
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	//메소드
	public void rent() {
		stateCode=0;
		System.out.println("\""+title+"이(가) 대여됐습니다.\"");
	}

	public void print() {
		System.out.print(bookNo+" 책 제목:"+title+", 작가:"+author+" 대여유무:");
		if(stateCode==1)System.out.println("재고있음");
		else System.out.println("대여중");
	}
	
	public void BookShop(int bookNo) {
		if(bookNo==this.bookNo) {
			rent();
		}
	}
	
}
