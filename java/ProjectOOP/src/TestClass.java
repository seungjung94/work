class TestClass{
	public static String claVar="original classVar";
	public String insVar="original instanceVar";
	
	public static void classMethod() {
		System.out.println(claVar);
		System.out.println();
//		System.out.println(insVar); //오류
	}
	
	public void instanceMethod() {
		System.out.println(insVar);
		System.out.println();
	}
}