import java.util.Scanner;

public class StudentManagerSystem{
	public static void main(String[] args){
		welcome();
		
		Admin[] admins=new Admin[5];  //�ֲ������������ڶ���ֲ������ķ����ڲ�ʹ��
		initData(admins);  //���ݳ�ʼ��
		
		operation(admins);
	
		
	}
	public static void initData(Admin[] admins){
		Admin admin=new Admin("admin","admin");
		admins[0]=admin;
	}
	public static void operation(Admin[] admins){
		Scanner s=new Scanner(System.in);
		System.out.print("��ѡ��");
		int operation=s.nextInt();
		
		if (operation==1){       //��¼
			login(admins);
		}else
		if (operation==2){       //�˳�
			System.exit(0);
		}else{
			System.out.println("������������������...");
			operation(admins);     //�ݹ����
		}
	}
	
	public static void login(Admin[] admins){
		System.out.println("��ӭ��½");
		
		Scanner s=new Scanner(System.in);
		System.out.println("�������û�����");
		String username=s.nextLine();
		System.out.println("���������룺");
		String password=s.nextLine();
		
		//�ж��û��������Ƿ���ȷ
		for(int i=0;i<admins.length;i++){
			Admin admin=admins[i];
			
			if(admin==null){
				continue;
			}
			
			if(username.equals(admin.username) && password.equals(admin.password)){
				System.out.println("��ӭ��"+username);
				break;
			}
		}
	}
	
	public static void welcome(){
		System.out.println("----------��ӭ��¼ѧ����Ϣ����ϵͳ----------");
		System.out.println("1.��¼       2.�˳�");
		System.out.println("--------------------------------------------");
	}
	
	
	
	
}
class Admin{
	public String username;  //�û���
	public String password;  //����
	
	public Admin(String username,String password){
		this.username=username;
		this.password=password;
	}
	
	public String getUsername(){             //��ȡ
		return username;
	}
	public void  setUsername(String username){      //�޸�
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