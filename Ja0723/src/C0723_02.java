import java.util.Scanner;

public class C0723_02 {

	public static void main(String[] args) {
		// 해당 월을 입력받아 3,4,5,: 봄 6,7,8: 여름 9,10,11: 가을 그 외 겨울
		// if, switch
		Scanner scan = new Scanner(System.in);
		System.out.println("달을 입력하세요 .>> ");
		int month = scan.nextInt();
		if (month==3||month==4||month==5) {
			System.out.println("봄");
		}else if(month==6||month==7||month==8){
			System.out.println("여름");
		}else if(month==9||month==10||month==11) {
			System.err.println("가을");
		}else {
			System.err.println("겨울");
		}
		
		switch(month) {
		case 3: case 4: case 5:{
			System.out.println("봄");
			break;
		}
		case 6: case 7: case 8:{
			System.out.println("여름");
			break;
			
		}
		case 9: case 10: case 11:{
			System.out.println("가을");
			break;
		}
		case 12: case 1: case 2:{
			System.out.println("겨울");
			break;
		}
		
//		default
		}
		
		
		
		
		
//		// 성적을 입력받아, 90점 이상 A, 80점-B, 70점-C,60점-D, 60점 미만 F
//		Scanner scan = new Scanner(System.in);
//		System.out.println("성적을 입력하세요 .>> ");
//		int score = scan.nextInt();
//		
//		// if else if else
//		if (score>=90) {
//			System.out.println("A");
//		}else if(score>=80) {
//			System.out.println("B");
//		}else if(score>=70) {
//			System.out.println("C");
//		}else if(score>=60) {
//			System.out.println("D");
//			
//		}else {
//			System.out.println("F");
//		}
//		
	}

}
