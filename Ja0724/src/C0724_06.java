import java.util.Scanner;
public class C0724_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		String[] title = {"국어","영어","수학"};
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> \n",i+1);
			name[i] = scan.next();
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%d번째 %s점수를 입력하세요.>> \n",i+1,title[j]);
				score[i][j] = scan.nextInt();
				// total[i]
			}
		}
		
		// 출력
		// 이름 국어 영어 수학
		// 홍길동 100 100 99
		// 유관순 90 90 91
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println("%d\t",total[i]);
			System.out.println("%d\t",total[i]);
			System.out.println();
		}
		
		int[] num = new int[5];
		for(int i=0;i<num.length;i++) {
			num[i] = 1; //0,1,2,3,4
		}
		
		
		// 5,5배열
		// 1 2 3 4 5
		// 6 7 8 9 10
		// ...
		// 21 22 23 24 25
		
		
//		int[][] score = new int[5][5];
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = 5*i+j+1; //0,1,2,3,4,5,6,7,8,9,10,11,12,13,14
//			}
//		}
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
//		int[] num = new int[5];
//		for(int i=0;i<num.length;i++) {
//			num[i] = i; // 0,1,2,3,4
//		}
		
		
		
//		int[][] score = new int[5][3];
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = 3*i+j; //0,1,2,3,4,5,6,7,8,9,10,11,12,13,14
//			}
//		}
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
//		int[] num = new int[5];
//		for(int i=0;i<num.length;i++) {
//			num[i] = i; // 0,1,2,3,4
//		}
	}
}