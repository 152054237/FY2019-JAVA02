package lalala;

public class duicheng {
	public static void main(String[] args) {
		String s=new String("heh    heh");
		int x=0;
		int y=s.length()-1;
		char[] ch=s.toCharArray();
		while(ch[x++]==ch[y--]) {
			if(ch[x]!=ch[y]) {
				System.out.print("²»¶Ô³Æ");
				break;
			}
			if(x>=y) {
				System.out.println("¶Ô³Æ");
				break;
			}
		}
	}
}
