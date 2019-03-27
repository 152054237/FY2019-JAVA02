package lalala;

public class zhiding {
	public static void main(String args[]) {
		String s="jin wan ni ma bi si";
		String findString ="si";
		int count = zhiding.countString(s,findString);
		System.out.print("×Ö·û´®¸öÊýÎª£º"+count);
	}

	public static int countString(String s1,String s2) {
		int count=0;
		int findIndex=0;
		int findLen=s2.length();
		findIndex=s1.indexOf(s2);
		while(findIndex !=-1) {
			s1=s1.substring(findIndex+findLen);
			findIndex=s1.indexOf(s2);
			count++;
		}
		return count;
	}
}