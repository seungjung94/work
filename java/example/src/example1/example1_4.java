package example1;

public class example1_4 {
	public static void main(String[] args) {
		String[] weeksa = {"월", "화", "수", "목", "금", "토", "일"};
		String[] weeks = new String[7];
		weeks[0] = "월";
		weeks[1] = "화";
		weeks[2] = "수";
		weeks[3] = "목";
		weeks[4] = "금";
		weeks[5] = "토";
		weeks[6] = "일";
		//String[] weeks = new String[];  에러
		
		System.out.println(weeks[3]);
		for (int i=0; i<weeks.length; i++) {
		    System.out.println(weeks[i]);
		}
		
		try{
			System.out.println(weeks[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열오류");
		}
	}
}


