package a18_컬렉션;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
	
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		
		System.out.println(intList.size());
		System.out.println(strList.size());
		
		System.out.println("=======================");
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}

		
		for(int num : intList) {
			//intList를 처음부터 끝까지 대입하여 반복
			System.out.println(num);
		}
		
		for(String str : strList) {
			//intList를 처음부터 끝까지 대입하여 반복
			System.out.println(str);
		}
		//Set을 이용한 변경 
		strList.set(2,"q");
		strList.set(3,"q");
		strList.set(4,"q");
		System.out.println();
		for(String str : strList) {
			System.out.println(str);
		}
		
		//삭제 - > 하나씩 사라지며 자동 정렬됨
//		strList.remove(0);
//		System.out.println();
//		System.out.println(strList);
//		
//		strList.remove(0);
//		System.out.println();
//		System.out.println(strList);
//		
//		strList.remove(0);
//		System.out.println();
//		System.out.println(strList);
//		
//		//끝에서부터 지우기
//		strList.remove(strList.size()-1);
//		System.out.println();
//		System.out.println(strList);
//		System.out.println("===================");
//	
//		
//		//반복문 while문을 사용하여 리스트가 비어있지 않으면 계속 반복하여 가장 뒤에 있는 값을 삭제
//		while(!strList.isEmpty()) {
//			strList.remove(0);
//			System.out.println();
//			System.out.println(strList);
//		}
		
		
	
		
		//리스트 q가 존재하면 해당 위치의 값을 삭제
		while(strList.contains("q")) {
			System.out.println(strList.remove("q"));
		}
			System.out.println(strList);
		
		//리스트 다 비워버리기	
		if(!strList.isEmpty()) {
			strList.clear();
		}
		System.out.println(strList);
	}

}
