import java.util.Scanner;

public class C0729_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name ="";
		int kor,eng,math,count = 0;
		Stuscore[] stu = new Stuscore[5]; // 배열선언
		int[] a = new int[5]; // int타입 배열 5개 선언
//		String[] name = new String[5];
//		int[] kor = new int[5];
//		int[] eng = new int[5];
//		int[] math = new int[5];
//		
//		int count =0;
		loop:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 프로그램 종료");
			System.out.println("----------------------------------");
			System.out.println("원하는 번호를 입력하세요");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("이름을 입력하세요.>>");
				name = scan.next();
				System.out.println("국어점수를 입력하세요.>>");
				kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요.>>");
				eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요.>>");
				math = scan.nextInt();
				
				// total, avg 모두 저장
				Stuscore s= new Stuscore(name,kor,eng,math); // 객체선언
				count++;
				
				break;
			case 2: 
				System.out.printf("%s 학생 성적이 저장되었습니다. \n",name);
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("----------------------------------");
				for(int i=0;i<count;i++) {
					System.out.printf("정보 : %s,%d,%d,%d,%d,%.2f \n",
							stu[count].name,stu[count].kor,stu[count].eng,stu[count].math,stu[count].total,stu[count].avg);
				}

				
				break;
			case 3:
				break;
			}
			
			
			

		}
		
		
	}

}
