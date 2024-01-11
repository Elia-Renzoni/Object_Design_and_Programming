package iterator;

import java.util.Iterator;

public class User {
	public static void main(String ...args) {
		Integer[] values = new Integer[] {10, 20, 30, 40};
		
		CustomList<Integer> customList = new CustomList<>(values.length, values);
		
		Iterator<Integer> it = customList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
