package example1;

public class example1_3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" world");
		String a = "Hello";
		a += " world";
		System.out.println(a);
		System.out.println(sb.insert(6, "java "));
		System.out.println(sb.substring(0, 4));
	}
}
