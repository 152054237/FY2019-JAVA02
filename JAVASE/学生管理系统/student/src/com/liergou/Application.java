package com.liergou;	
import com.liergou.pojo.Admin;
import com.liergou.view.UserViewImp;
import com.liergou.pojo.Initalize;
public class Application {
	public static void main(String[] args) {
		UserViewImp app=new UserViewImp();
		app.welcome();
		
		Admin[] admins=new Admin[5];
		Initalize in=new Initalize();
		in.init(admins);
		app.logi(admins);
		
		app.choice();
		
		app.look();
		
	}
	
	
	
}
