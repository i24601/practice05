package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        for(int i=0;i<friendArray.length;i++) {
        	friendArray[i] = new Friend();
        }
        
        for(int i=0;i<friendArray.length;i++) {
        	System.out.print("이름: ");
        	friendArray[i].setName(sc.nextLine());
        	System.out.print("핸드폰: ");
        	friendArray[i].setHp(sc.nextLine());
        	System.out.print("학교: ");
        	friendArray[i].setSchool(sc.nextLine());
        	System.out.println("------------------------");
        }
        
        for (int i = 0; i < friendArray.length; i++) {
            System.out.println("이름: "+friendArray[i].getName()+" 핸드폰: "+friendArray[i].getHp()+"학교: "+friendArray[i].getSchool());
        }

        sc.close();
    }

}
