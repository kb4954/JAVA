import java.util.Scanner;

public class C0722_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("숫자를 입력하세요.>>");
		
		// 랜덤숫자 1-100까지 랜덤숫자를 출력하시오.	
		int rnum = (int)(Math.random()*3)+1;
		// 가위 -1. 바위-2, 보-3
		//1-3,2-1,3-2 승리
		//1-1,2-2,3-3 무승부
		//1-2,2-3,3-1 패
		// if문을 사용해서 가위바위보 게임을 완성하시오.
		System.out.println("[가위바위보 게임]");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요");
		int choice = scan.nextInt();
		if(choice==1) {
			my ="가위";
		}else if(rnum==2) {
			my="바위";
		}else {
			my="보";
		}
		
		
		
		
		if(choice-rnum==-2 || choice-rnum==1) {
			System.out.println("승리"+my);
		}else if(choice-rnum==0) {
			System.out.println("무승부"+rnum);
		}else {
		System.out.println("패"+rnum);
		}
		// 승리 무승부, 패 출력하시오
		
		
		
		
		
		
		
		// 0.0<= Math.random < 1
		// 0+1 <= x+1<10+1
		//1 <=X <11
		// 0.8513643175901983
		
//		System.out.println((int)(Math.random()*10));
//		System.out.println(Math.floor(Math.random()*10)/10.0);
		
		
		
		
		
		
		//		boolean power = false;
//		if(power) {
//			power =!power;
//			
//		}else {
//			power = !power;
//		}
		
		
		
		
		
		
		
		//		System.out.println("문자를 입력하세요");
//		String input = scan.next(); // nextLine은  enter키도 문자로 인식해서 입력으로 받아가지고 charAt를 썼을 때 에러가 발생함
//		//String input = "";
//		char ch = ' ';
//		
//		if(input != null && input.equals("")) {
//			char ch = input.charAt(0);
//			
//		}
//		
//		System.out.println("출력 : "+ch);
		
	}

}
