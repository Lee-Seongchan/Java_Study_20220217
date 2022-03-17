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
		
		//값 조회하기
		Iterator<String> ir = strSet.iterator();//strSet을 iterator형태로 변환
		while(ir.hasNext()) { //하나씩 꺼내는 작업은 반복 ir.hasNext가 True면 계속 반복
			String str = ir.next(); //꺼내기
			if(str.equals("이성찬1")) {
				System.out.println(str);
			}
			
		}
	}

}
