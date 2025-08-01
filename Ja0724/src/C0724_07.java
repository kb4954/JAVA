import java.util.Scanner;

public class C0724_07 {

	public static void main(String[] args) {
		// 이름, 국어,영어,수학 점수를 입력받아 출력하시오.
		// 1. 변수 배열 선언 - name,score,total, avg
		// 2.값입력 - 이름
		// 3. score 값 입력 - 국어,영어, 수학
		// 4. total, avg 값입력
		// 5. 출력
		
		
		// 1. 변수 배열 선언
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		int[] avg = new int[3];
		String[] title = {"국어","영어","수학"};
		
		
		// 2. 값입력
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요 .>>",i+1);
			name[i] = scan.next();
			for(int j=0;score[i].length;j++) {
				System.out.printf("%d번째 %s 점수를 입력하세요 .>>\n",i+1,title[j]);
				score[i][j] = scan.nextInt();
			}
			//출력
		// 
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				score[i][j] = 5*i+j+1;
			}
		}
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.println(score[i]);
			}
		}
			
			
			
			
		}
 		
		
		
		
		
		
		
	}

}
