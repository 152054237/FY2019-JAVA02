import java.util.Scanner;

public class StudentManagerSystem{
	public static void main(String[] args){
		welcome();
		
		Admin[] admins=new Admin[5];  //局部变量：作用在定义局部变量的方法内部使用
		initData(admins);  //数据初始化
		
		operation(admins);
	
		
	}
	public static void initData(Admin[] admins){
		Admin admin=new Admin("admin","admin");
		admins[0]=admin;
	}
	public static void operation(Admin[] admins){
		Scanner s=new Scanner(System.in);
		System.out.print("请选择：");
		int operation=s.nextInt();
		
		if (operation==1){       //登录
			login(admins);
		}else
		if (operation==2){       //退出
			System.exit(0);
		}else{
			System.out.println("输入有误，请重新输入...");
			operation(admins);     //递归调用
		}
	}
	
	public static void login(Admin[] admins){
		System.out.println("欢迎登陆");
		
		Scanner s=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username=s.nextLine();
		System.out.println("请输入密码：");
		String password=s.nextLine();
		
		//判断用户名密码是否正确
		for(int i=0;i<admins.length;i++){
			Admin admin=admins[i];
			
			if(admin==null){
				continue;
			}
			
			if(username.equals(admin.username) && password.equals(admin.password)){
				System.out.println("欢迎你"+username);
				break;
			}
		}
	}
	
	public static void welcome(){
		System.out.println("----------欢迎登录学生信息管理系统----------");
		System.out.println("1.登录       2.退出");
		System.out.println("--------------------------------------------");
	}
	
	
	
	
}
class Admin{
	public String username;  //用户名
	public String password;  //密码
	
	public Admin(String username,String password){
		this.username=username;
		this.password=password;
	}
	
	public String getUsername(){             //获取
		return username;
	}
	public void  setUsername(String username){      //修改
		this.username=username;
	}
	public String getPassword(){
		return password;
	}
	public void  setPassword(String password){
		this.password=password;
	}
}
class Student{
	public int id;
	public String name;
	public String sex;
	public int age;
	public String grade;
	public String address;
	public String phone;
	public String email;
	
	public int getID(){             
		return id;
	}
	
}