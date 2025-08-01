import java.util.Scanner;

public class C0722_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String input = scan.next();
		String str1 = "c";
		char ch ='c';
		if(input.equals("c")|| input.equals("C")) {
			System.out.println("프로그램종료");
			
		}else {
			System.out.println("프로그램종료가 안됩니다.");
			
		}
		if(input.equalsIgnoreCase("c")) {
			System.out.println("프로그램종료");
			
		}else {
			System.out.println("프로그램종료가 안됩니다.");
			
		}
	}

}
