import java.util.Scanner;

public class C0724_04 {

	public static void main(String[] args) {
		//1~45까지 숫자 6개를 입력 받고
		// 로또 번호 6개를 생성해서 출력하시오 .
		// 입력번호 : 1 45 3 10 5 20
		// 로또번호 : 20 4 9 35 7 21
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		int[] lotto = new int[6];
		int[] num = new int[45];
		int rnum = 0;
		int temp = 0;
		
		
		// 랜덤번호 설정
		for(int i=0;i<45;i++) {
			num[i]=i+1;
		}
		// 랜덤번호섞기
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45); // 0-44
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		//숫자입력
		for(int i=0; i<6;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.(1-45)>>",i+1);
			input[i] = scan.nextInt();
		}
		
		// 출력
		System.out.println("[입력한 숫자]");
		for(int i=0; i<6;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println("\n");
		System.out.println("[ 로또번호 ]");
		
		for(int i=0; i<6;i++) {
			System.out.print(num[i]+" ");
		}
		
		
		
	}

}
