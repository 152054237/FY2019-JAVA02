package com.liergou.view;
import com.liergou.pojo.*;
import com.liergou.Application;
import java.util.Scanner;
import com.liergou.pojo.Initalize;
import com.liergou.pojo.Student;
public class UserViewImp implements UserView {
	Student[] Student=new Student[9999];
	int number=0;
	public void welcome(){
		System.out.println("-------------欢迎登录学生信息管理系统-------------");
		System.out.println("1.登录       2.退出");
		System.out.println("--------------------------------------------");
	}
	public void choice() {
		System.out.println("********************请选择要操作的学生信息**************************");
		System.out.println("     *1.查看学生信息 2.添加学生信息 3.删除学生信息 4.修改学生信息 5.退出*");
		System.out.println("***************************************************************");
	}
	public void login(Admin[] admins) {
		System.out.println("欢迎登录！");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username=s.nextLine();
		System.out.println("请输入密码：");
		String password=s.nextLine();
		for(int i=0;i<admins.length;i++){
			Admin admin=admins[i];
			if(username.equals(admin.username) && password.equals(admin.password)){
				System.out.println("欢迎你："+username);
				break;
			}else {
				System.out.println("密码错误，请重新输入");
				login(admins);
			}
		}
	}
	public void logi(Admin[] admins) {
		Scanner s=new Scanner(System.in);
		System.out.println("请选择：");
		int operation=s.nextInt();
		if (operation==1){       
			login(admins);
		}else
		if (operation==2){       
			System.exit(0);
		}else{
			System.out.println("输入有误，请重新输入...");
			logi(admins);
		}
	}
	public void look() {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入你要进行的操作：");
		int putin=s.nextInt();
		if (putin==1) {
			show();
		}else
		if (putin==2) {
			add();
		}else
		if (putin==3) {
			delete();
		}else
		if (putin==4) {
			change();
		}else {
			System.exit(0);
		}
	}
	public void show() {
		System.out.println("++++++++++++++++++++++++++++++++所有学生信息++++++++++++++++++++++++++");
		System.out.println("|学号  |姓名     |年龄  |性别  |年级   |电话                  |email           |地址                     |");
		Student[number]=new Student();
		for(int i=0;i<number;i++) {
			System.out.println(Student[i].getId()+"  |"+Student[i].getName()+"  |"+Student[i].getAge()+"  |"+Student[i].getSex()+"  |"+Student[i].getGrade()+"    |"+Student[i].getPhone()+"         |"+Student[i].getEmail()+"           |"+Student[i].getAddress()+"               |");
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		choice();
	}
	public void add() {
		Scanner s=new Scanner(System.in);
		while(true){	
			 if(s.nextInt()==0)break;
			 System.out.println("**************************添加学生信息***********************");
			 Student[number]=new Student();
			 Student[number].setId(s.nextInt());
		  	 Student[number].setName(s.nextLine());
		  	 Student[number].setSex(s.nextLine());
		  	 Student[number].setAge(s.nextInt());
		  	 Student[number].setGrade(s.nextLine());
		  	 Student[number].setAddress(s.nextLine());
		  	 Student[number].setPhone(s.nextLine());
		  	 Student[number].setEmail(s.nextLine());
		  	 number++;
		  	 System.out.println("数据保存成功，系统将自动返回上层目录");
		  	 choice();
		}		
	}
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void change() {
		// TODO Auto-generated method stub
		
	}
}
