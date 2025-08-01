import java.util.Scanner;

public class C0723_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[2];
		int[] kor = new int[2]; //국어점수
		int[] eng = new int[2]; //영어점수
		int[] math = new int[2]; //수학점수
		int[] total = new int[2]; // 합계
		double[] avg = new double[2]; // 평균
		
		for(int i=0;i<name.length;i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math[i] = scan.nextInt();
			total[i] = kor[i]+eng[i]+math[i];
//			System.out.println("합계");
			avg[i]=total[i]/3.0;
			
		}
		
		
		
		for(int i=0;i<name.length;i++) {
			System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}
		
		
		
		
		
	}

}
