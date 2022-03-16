package a18_컬렉션;

import java.util.HashMap;
import java.util.Map;

// 1.요소의 저장 순서를 유지하지 않는다
// 2. 키는 중복을 허용하지 않지만 값의 중복은 허용한다.

public class HashMapTest {

	public static void main(String[] args) {
		//값을 넣기
		Map<String, String> hashMap = new HashMap<String,String>();
		hashMap.put("가", "성찬1");
		hashMap.put("나", "성찬2");
		hashMap.put("다", "성찬3");
		hashMap.put("라", "성찬4");
		hashMap.put("마", "성찬5");
		
		System.out.println(hashMap);
		System.out.println();
		//값 가져오기
		System.out.println(hashMap.get("다"));
		System.out.println(hashMap.containsValue("성찬4"));
		//값 제거하기
		System.out.println(hashMap.remove("라"));
		System.out.println(hashMap);
		System.out.println();
		//값 바꾸기
		System.out.println(hashMap.replace("마", "성찬6"));
		
	}

}
