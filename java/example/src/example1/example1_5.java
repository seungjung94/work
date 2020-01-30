package example1;

import java.util.ArrayList;

public class example1_5 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
        arr.add("138");
        arr.add("129");
        arr.add("142");

        System.out.println(arr.get(1)); 
        System.out.println(arr.size());
        System.out.println(arr.contains("142"));

        System.out.println(arr.remove("129"));
        System.out.println(arr.size());
        System.out.println(arr.remove(0));
	}
}



