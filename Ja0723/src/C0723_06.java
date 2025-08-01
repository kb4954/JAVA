import java.util.Scanner;

public class C0723_06 {

	public static void main(String[] args) {
		System.out.printf("[%5d\n",5);
		System.out.printf("[%05d\n",5);
		for(int i=1;i<=100;i++) {
			System.out.printf("%03\n",i);
		}
		
		int a = 99;
		System.out.println("0"+a); //099
		String str = String.format("%03d", a);
		System.out.println();
		
		
		
		//		for(int i=5;i>=1;--i) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
		// 구구단 출력 
//		for(int i=2;i<=9;i++) {
//			
//			System.out.printf("[ %d단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d \n",i,j,i*j);
//				
//			}
//			System.out.println();
//		}
		
		
//		for(int i=0;i<=9;i++) {
//			for (int j=0;j<=9;j++) {
//				for(int k=0;k<=9;k++) {
//					System.out.printf("%d%d%d\n",i,j,k);
//				}
//			}
//		}
		
		// 2개 숫자를 입력받아 3,7 3~7단까지 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자1를 입력해주세요");
//		int input = scan.nextInt();
//		System.out.println("숫자2를 입력해주세요");
//		int input2 = scan.nextInt();
//		for(int i=input;i<=input2;i++) {
//			System.out.printf("[ %단 ] \n");
//			for(int j=input;j<=input2;j++) {
//				System.out.printf("%d X %d = %d \n",input,input2,input*input2);
//				
//			}
//			System.out.println();
//		}
		
		//		// 중첩  for 문
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ] \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d \n",i,j,i*j);
//			}
//			System.out.println();
//		}
	}

}
