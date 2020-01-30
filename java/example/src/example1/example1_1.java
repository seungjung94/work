package example1;

public class example1_1 {

	public static void main(String[] args) {
		String a = "hello";
		String b = new String("hello");
		String c = "world";
		String d = "hello";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a==b);
		System.out.println(a==c);		
		System.out.println(a==d);		
	}
}
