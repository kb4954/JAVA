import java.util.ArrayList;
import java.util.Scanner;

public class C10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		String name = null;
		int kor,eng,math,total;
		double avg;
		int i=0;
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("학생 성적 입력");
			System.out.println("%d번째 학생 이름을 입력하세요");
			name = scan.next();
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			total = kor+eng+math;
			double avg = total/3.0;
			
			
			
			
			break;
			
			
			
			
			
			
			
			
			
			
		}
	}
}
