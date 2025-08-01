import java.util.Scanner;

public class C0723_01 {

	public static void main(String[] args) {
		// 숫자입력받아
		Scanner scan = new Scanner(System.in);
		//
		
		System.out.println("[ 덧셈 프로그램 ]");
		System.out.println("1. 21억이하 덧셈");
		System.out.println("2. 21억이상 덧셈");
		System.out.println("-----------------");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt(); // nextDouble()
		
		switch(choice) {
		case 1:
			System.out.println("숫자1 를 입력하세요");
			int input = scan.nextInt();
			System.out.println("숫자2를 입력하세요");
			int input2 = scan.nextInt();
			int add = input+input2;
			System.out.println("합계 : "+add);
			break;
		case 2:
			System.out.println("숫자1를 입력하세요.");
			long l_input = scan.nextLong();
			System.out.println("숫자2를 입력하세요.");
			long l_input2 = scan.nextLong();
			long add2 =l_input+l_input2;
			System.out.println("합계2: "+add2);
			
			
			
			break;
	
		}
		
		
		
		
		
		
		
//		System.out.println("숫자를 입력하세요.");
//		long input = (long) scan.nextInt();
//		System.out.println("숫자2를 입력하세요");
//		long input2 = (long) scan.nextInt();
//		long add = (long) (input+input2);
//		System.out.println("입력숫자 : "+input);
// 		System.out.println("입력숫자2 : "+input2);
// 		System.out.println("합계 : "+add);
//		
		
		
				
	}

}
