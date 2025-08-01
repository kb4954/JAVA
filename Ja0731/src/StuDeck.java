import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	private int no,kor,eng,math,total;
	private double avg;
	private String name = null; 
	String[] title = {
			"번호","이름","국어","영어","수학","합계","평균"
	};
	private Stuscore s;
	//상단메뉴 출력
	static int menu_print(){
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요");
		int choice = scan.nextInt();
		return choice;

	} // menu 
	void stu_input(ArrayList list) {
		// 이름, 국어, 영어, 수학 입력받기
		System.out.println("1. 성적입력");
		System.out.printf("%d번째 학생 이름을 입력하시오",list.size()+1);
		name = scan.next();
		System.out.println("국어점수를 입력하시오");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하시오");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하시오");
		math = scan.nextInt();
		
//		new Stuscore(name,kor,eng,math); // 생성자 호출 시 갯수확인 
		list.add(new Stuscore(name,kor,eng,math));
		System.out.printf("%s 학생성적이 저장되었습니다. \n",name);
		
		
		System.out.println("[ 저장 정보 ]");
		// 리턴 타입이 object이므로 stuscore로 형변환후 넘겨줘야함
		
		int count;
		s =(Stuscore)list.get(count);
		
		System.out.printf("%d,%s,%d \n",s.getNo(),s.getName(),s.getKor());
		count++;
	}
	//학생성적 출력 
	void stu_output(ArrayList list) {
		System.out.println("[ 학생 성적 출력 ]");
		System.out.printf(""
				+"%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		System.out.println("-------------------------------------");
		for(int i=0;i<list.size();i++) {
			s =(Stuscore)list.get(i); // Object에서 형변환
			System.out.printf(""
					+"%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getkor(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
	}
	
	
}
	
