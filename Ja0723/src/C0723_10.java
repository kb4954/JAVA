import java.util.Scanner;

public class C0723_10 {

	public static void main(String[] args) {
		String[] name = new String[5];
		int[] kor = new int[5]; //국어점수
		int[] eng = new int[5]; //영어점수
		int[] math = new int[5]; //수학점수
		// 이름 5명을 입력받아,
		// 입력 이름 : 홍길동 유관순 이순신 강감찬 김구
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.printf("%d번째 이름을 입력하세요",i+1);
			name[i] = scan.next();
//			System.out.println(name[i]+" ");
			System.out.printf("%d번째 국어점수를 입력하세요.",i+1);
			kor[i] = scan.nextInt();
			System.out.printf("%d번째 영어점수를 입력하세요.",i+1);
			eng[i] = scan.nextInt();
			System.out.printf("%d번째 수학점수를 입력하세요.",i+1);
			math[i] = scan.nextInt();
			
		}
		
		System.out.println("[ 입력된 이름 ]");
		for(int i=0;i<5;i++) {
			System.out.print(name[i]+"\t");
			
		}
		System.out.println(" ");
		System.out.println("[ 국어점수 ]");
		for(int i=0;i<5;i++) {
			System.out.print(kor[i]+"\t");
			
		}
		System.out.println(" ");
		System.out.println("[ 영어점수 ]");
		for(int i=0;i<5;i++) {
			System.out.print(eng[i]+"\t");
			
		}
		System.out.println(" ");
		System.out.println("[ 수학점수 ]");
		for(int i=0;i<5;i++) {
			System.out.print(math[i]+"\t");
			
		}
		
		
		
	}

}
