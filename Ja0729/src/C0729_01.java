import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C0729_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 두 수 계산
		int a = 10;
		int b = 5;
		System.out.println("[ 두수계산 프로그램 ]");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("5. 전체 결과값");
		System.out.println("원하는 번호를 입력하세요.>>");
		Cal cal = new Cal();
		
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			cal.add(a,b);
//			System.out.println("결과 : "+result);
			break;
			
		case 2:
			cal.minus(a,b);
//			System.out.println("결과 : "+result);
			break;
			
			
			
		case 3:
			cal.multi(a,b);
			break;
		case 4:
			
			cal.sub(a, b);
			break;
		
		case 5:
			// a,b 배열 num
			// 결과값을 여기에서 출력하시오.
			// 더하기 빼기 곱하기 나누기 결과값을 a,b 배열을 저기에 보냈다가 다시 돌아오게끔 
			// 더하기 : 15
			// 빼기 : 5
			// 곱하기 : 50
			// 나누기 : 2.0
			double[] number = new double[3];
			cal.calProcess(a, b,number);
			System.out.println("더하기 :"+number[0]);
			System.out.println("빼기 :"+number[1]);
			System.out.println("곱하기 :"+number[2]);
			System.out.println("나누기 :"+number[3]);
			break;
		
		}
				
		
		
		
	}

}
