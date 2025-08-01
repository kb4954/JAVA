import java.util.Scanner;

public class C0722_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		// 90점 이상 A, 80점 이상 B , 70점 이상 C
		// 97점 이상 A+, 93 A-, 87점 이상 B+, 83점B-
		if(score>=90) {
			System.out.println("A-");
		}else if(score>=97) {
			System.out.println("A+");
		}else if(score>=93) {
			System.out.println("A");	
		}else if(score>=80) {
			System.out.println("B-");
		}else if(score>=87) {
			System.out.println("B+");
		}else if(score>=83) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
		
		
		
		
		
		
		
		
//		//양수, 0, 음수
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
//		
//		if(input>0) {
//			System.out.println("양수입니다.");			
//		}else if(input==0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("움수입니다.");
//		}
		
	}

}
