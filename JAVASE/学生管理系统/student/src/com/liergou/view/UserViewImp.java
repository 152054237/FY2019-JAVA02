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
		System.out.println("-------------��ӭ��¼ѧ����Ϣ����ϵͳ-------------");
		System.out.println("1.��¼       2.�˳�");
		System.out.println("--------------------------------------------");
	}
	public void choice() {
		System.out.println("********************��ѡ��Ҫ������ѧ����Ϣ**************************");
		System.out.println("     *1.�鿴ѧ����Ϣ 2.���ѧ����Ϣ 3.ɾ��ѧ����Ϣ 4.�޸�ѧ����Ϣ 5.�˳�*");
		System.out.println("***************************************************************");
	}
	public void login(Admin[] admins) {
		System.out.println("��ӭ��¼��");
		Scanner s=new Scanner(System.in);
		System.out.println("�������û�����");
		String username=s.nextLine();
		System.out.println("���������룺");
		String password=s.nextLine();
		for(int i=0;i<admins.length;i++){
			Admin admin=admins[i];
			if(username.equals(admin.username) && password.equals(admin.password)){
				System.out.println("��ӭ�㣺"+username);
				break;
			}else {
				System.out.println("�����������������");
				login(admins);
			}
		}
	}
	public void logi(Admin[] admins) {
		Scanner s=new Scanner(System.in);
		System.out.println("��ѡ��");
		int operation=s.nextInt();
		if (operation==1){       
			login(admins);
		}else
		if (operation==2){       
			System.exit(0);
		}else{
			System.out.println("������������������...");
			logi(admins);
		}
	}
	public void look() {
		Scanner s=new Scanner(System.in);
		System.out.println("��������Ҫ���еĲ�����");
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
		System.out.println("++++++++++++++++++++++++++++++++����ѧ����Ϣ++++++++++++++++++++++++++");
		System.out.println("|ѧ��  |����     |����  |�Ա�  |�꼶   |�绰                  |email           |��ַ                     |");
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
			 System.out.println("**************************���ѧ����Ϣ***********************");
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
		  	 System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼");
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
