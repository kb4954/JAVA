
import java.util.Scanner;

public class C0721_09 {
	public static void main(String[] args) {
		System.out.println("");
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.println("입력한 숫자:"+num);
		System.out.println("숫자2를 입력하세요. ");
		String str = scan.nextLine();
		int num2 = Integer.parseInt(str); 
		System.out.println("숫자더하기 : "+(num+num2));
		
		
	}

}
