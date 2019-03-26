package com.lalala;

import java.util.Scanner;

public class enroll {
	public void login() {
		Scanner a=new Scanner(System.in);
		System.out.println("«Î ‰»Î’À∫≈£∫");
		String username=a.nextLine();
		System.out.println("«Î ‰»Î√‹¬Î£∫");
		String password=a.nextLine();
		try {
			UserBiz.login(username,password);
		}catch
	}
	public void register() {
		Scanner b=new Scanner(System.in);
		System.out.println("«Î ‰»Î’À∫≈£∫");
		String username=b.nextLine();
		System.out.println("«Î ‰»Î√‹¬Î£∫");
		String password=b.nextLine();
		System.out.println("«Î ‰÷ÿ∏¥√‹¬Î£∫");
		String password=b.nextLine();
		System.out.println("«Î ‰»Î’Ê µ–’√˚£∫");
		String name=b.nextLine();
		System.out.println("«Î ‰»ÎµÁ◊”” œ‰£∫");
		String email=b.nextLine();
		try {
			UserBiz.register(username,password,password,name,email);
		}catch
	}
}
