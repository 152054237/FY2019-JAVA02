package com.lalala;

import java.util.Scanner;

public class enroll {
	public void login() {
		Scanner a=new Scanner(System.in);
		System.out.println("�������˺ţ�");
		String username=a.nextLine();
		System.out.println("���������룺");
		String password=a.nextLine();
		try {
			UserBiz.login(username,password);
		}catch
	}
	public void register() {
		Scanner b=new Scanner(System.in);
		System.out.println("�������˺ţ�");
		String username=b.nextLine();
		System.out.println("���������룺");
		String password=b.nextLine();
		System.out.println("�����ظ����룺");
		String password=b.nextLine();
		System.out.println("��������ʵ������");
		String name=b.nextLine();
		System.out.println("������������䣺");
		String email=b.nextLine();
		try {
			UserBiz.register(username,password,password,name,email);
		}catch
	}
}
