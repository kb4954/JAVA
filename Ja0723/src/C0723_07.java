import java.util.Scanner;

public class C0723_07 {

	public static void main(String[] args) {
		//while
		Scanner scan = new Scanner(System.in);
		//입력된 숫자에서 멈춤하는 프로그램을 구현하시오 . 100,59
		
		int i = 0;
		System.out.println("출력하려는 숫자를 입력하시오.");
		int input = scan.nextInt();
		int input2 = scan.nextInt();

		while(i<=100) {
			if (input<i) break;
			
			if(input2==1) {
				if (input2==1) {
					i++;
					continue;
				}	
			}else if(input2==2) {
					if(i%2==0) continue;
				}
			}
			i++;
		}
		
		
		System.out.println("출력한 숫자: "+i);
		System.out.println("1) 짝수 2) 홀수 3) 모두");
		
		
		
		//		// 1~100까지 랜덤숫자를 출력하시오 
//		int rnum = (int)(Math.random()*100+1);
//		//10번을 입력받아 10번이후 종료
//		// 입력 : 5 정답	. 오답: 입력된 숫자가 큽니다. 오답-입력한 숫자가 작습니다.
//		Scanner scan = new Scanner(System.in);
//		for(int i=1;i<=10;i++) {
//			System.out.println("숫자를 입력하세요");
//			int input = scan.nextInt();
//			if(rnum==input) {
//				System.out.printf("정답입니다. 입력한 숫자 : %d , 랜덤숫자 :%d ",input,rnum);
//				break;
//			}else if(rnum>input) {
//				System.out.println("입력한 숫자가 작습니다.랜덤숫자: "+rnum);
//			}else {
//				System.out.println("입력한 숫자가 큽니다. 랜덤숫자: "+rnum);
//			}
//		}
			
				
		
		
		// 구구단 2~9단까지 출력하시오.
//		2 X 1 =2;
//		i
//		int i =2;
//		int j = 1;
//				
//		while(i<=9) {
//			while(j<9) {
//				
//				i++;
//				j++;
//				System.out.printf("[ %d단]",i);
//				System.out.println("%d X %d = %d",i,j,i*j);
//			}
//		}
//		
		
		// while
		//1~100까지 합을 구하시오
		// 500을 넘는 시점의 ㅑ, sum을 출력하시오.
//		int sum = 0;
//		int i = 1;
//		while(i<=100) {
//			sum +=i;
//			i++;
//			if(sum>=500) {
//				System.out.println("500을 넘는 시점 : "+sum);
//				System.out.printf("i : %d , sum: %d ",i,sum);
//				break;
//			}
//				
//		}
		
		
		
		
//		int sum = 0;
//		int i = l;
//		while(i<=10) {
//			sum +=i;
//			i++;
//		}
//		System.out.println("합계: "+sum);
//		
//		System.out.println("----------------------");
//		sum=0;
//		i=1;
//		while(i<=10) {
//			sum+=i;
//			i++;
//			
//		}
		
		
	}

}
