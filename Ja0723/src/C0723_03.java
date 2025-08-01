import java.util.Scanner;

public class C0723_03 {

	public static void main(String[] args) {
//		double ran = (int)(Math.random()*45); // 0~44
		double rnum = (int)(Math.random()*10)+1;
		System.out.println("[ 랜덤숫자 맞추기 ]");
		System.out.println("1~10까지 숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		// if문 사용 : 정답, 오답-입력숫자가 더 큽니다. , 오답-입력숫자가 더 작습니다. 
		if(rnum==input) {
			System.out.println("정답입니다.");
		}else if(rnum>input) {
			System.out.println("오답-입력숫자가 더 작습니다.");
		}else {
			System.out.println("오답-입력숫자가 더 큽니다.");
		}
		System.out.println("입력한 숫자 "+input);
		System.out.println("랜덤숫자 "+rnum);
			
		
	}

}
