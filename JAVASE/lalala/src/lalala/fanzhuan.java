package lalala;

public class fanzhuan {
	public static void mian(String[] args) {
		final String str="To be or not to be";
		final String[] array=str.split(" ");
		for (String s:array) {
			final StringBuilder builder=new StringBuilder();
			System.out.print(builder.append(s).reverse()+" ");
		}
	}
}
