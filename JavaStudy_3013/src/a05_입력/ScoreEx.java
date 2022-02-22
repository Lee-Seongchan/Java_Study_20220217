package a05_입력;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {

		/**
		 * int score 입력
		 * score 마이너스 점수이거나 100점을 넘으면 X출력
		 * 90점 이상 A
		 * 80점 이상 B
		 * 70점 이상 C
		 * 60점 이상 D
		 * 그 외 	 F
		 * 
		 * 성적을 입력해 주세요 : 85
		 * 학생의 평점은  B 등급 입니다. 
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		String grade = null;
		
		System.out.print("성적을 입력해 주세요 : "  );
		score = sc.nextInt(); 
		
		grade = score > -1 && score < 101 ? 
			score > 89 ? "A" : 
				score > 79 ? "B" : 
					score > 69 ? "C" : 
						score > 59 ? "D" : "F"
					: "오류";  
		
		
		System.out.println("학생의 평점은 " + grade + "등급 입니다.");
		

		
	}

}
