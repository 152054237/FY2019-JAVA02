package lalala;

public class daxiaoxie {
	public static void main(String[] args) {
		String s="A-Z(65-90) a-z(97-122)";
		int a=0;
		int b=0;
		int c=0;
		for (int i=0;i<s.length();i++) {
			char d=s.charAt(i);
			if (d>='A' && d<='Z') {
				a++;
			}else
			if (d>='a' && d<='z') {
				b++;
			}else {
				c++;
			}	
		}
		System.out.println("��д��ĸ����"+a);
		System.out.println("Сд��ĸ����"+b);
		System.out.println("����ĸ����"+c);
	}
}
