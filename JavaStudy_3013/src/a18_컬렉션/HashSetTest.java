package a18_컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("이성찬");
		strSet.add("이성찬1");
		strSet.add("이성찬2");
		strSet.add("이성찬3");
		//순서가 없다.
		System.out.println(strSet);
		
		strSet.remove("이성찬3");
		System.out.println(strSet);
		
		Iterator<String> ir = strSet.iterator();
		while(ir.hasNext()) { 
			String str = ir.next();
			if(str.equals("이성찬1")) {
				System.out.println(str);
			}
			
		}
	}

}
