import java.util.Scanner;
public class C0721_08 {

	public static void main(String[] args) {
		//print("");
		System.out.println("");
		//input("");
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		//next(),nextLine():문자열
		//nextByte(),nextShort(),nextInt(),nextLong() : 정수형
		//nextFloat,nextDouble(): 실수형
		
		int num = scan.nextInt();
		scan.nextLine();
		System.out.println("입력한 숫자:"+num);
		System.out.println("숫자2를 입력하세요. ");
		String str = scan.nextLine();
		// int 타입으로 변경
		int num2 = Integer.parseInt(str); // 문자열을 정수형으로 변환
		System.out.println("숫자더하기 : "+(num+num2));
		
		
		/*Scanner b = new Scanner("");
		String str = "abc";
		String str2 = new String("abc");
		int a = 100;*/
	}
}
