import java.util.Scanner;

public class C0728_05 {

	public static void main(String[] args) {
		//
		// 홍길동 100 100 100 300 100.0
		// 유관순 90 90 90 270 90.0
		// 이순신 80 80 80 240 80.0
		
		// 객체에 대한 배열을 선언
		// 객체를ㄹ 선언해서 위 3개 정보를 입력하고 위 3개를 출력하시오.
		Scanner scan = new Scanner(System.in);
		StuScore[] s = new StuScore[2];
		for(int i=0;i<s.length;i++) {
			s[i] = new StuScore();
			System.out.println("이름을 입력하세요.");
			s[i].name = "홍길동";			
			System.out.println("국어점수를 입력하세요.");
			s[i].kor = 100;
			System.out.println("영어점수를 입력하세요.");
			s[i].eng = 100;
			System.out.println("수학점수를 입력하세요.");
			s[i].math = 100;
			s[i].stuTotal();
			s[i].stuAvg();
			s[i].rank = 1;
			
			
		}
		for(int i=0;i<s.length;i++) {
			System.out.printf("%s,%d,%d,%d,%d,%.2f,%d \n",
					s[0].name,s[0].kor,s[0].eng,s[0].math,s[0].total,s[0].avg,s[0].rank);
		}
		
//		s[1] = new StuScore();
//		s[1].name = "유관순";
//		s[1].kor = 90;
//		s[1].eng = 90;
//		s[1].math = 90;
//		s[1].total = s[1].kor+s[1].eng+s[1].math;
//		s[1].avg = s[1].total/3.0;
//		s[1].rank = 2;
//		System.out.printf("%s,%d,%d,%d,%d,%.2f,%d \n",
//				s[1].name,s[1].kor,s[1].eng,s[1].math,s[1].total,s[1].avg,s[1].rank);
//		
//		s[2] = new StuScore();
//		s[2].name = "이순신";
//		s[2].kor = 80;
//		s[2].eng = 80;
//		s[2].math = 80;
//		s[2].total = s[2].kor+s[2].eng+s[2].math;
//		s[2].avg = s[2].total/3.0;
//		s[2].rank = 3;
//		System.out.printf("%s,%d,%d,%d,%d,%.2f,%d \n",
//				s[2].name,s[2].kor,s[2].eng,s[2].math,s[2].total,s[2].avg,s[2].rank);
//
//(중요)	 변수의 종류   선언위치		생성시기
		//클래스변수   클래스영역	클래스가 메모리에 몰라갈때
		// Static 무조건붙여야댐 : 클래스변수		
		// 무조건 하나만 생성됨.
		// 객체선언 없이 사용한다.
		// 공용으로 씀 같은 클래스의 모든 인스턴스들이 공유하는 변수
		// 인스턴스 생성없이 '클래스이름.클래스변수명'으로 접근
		// 클래스가 로딩될때 생성되고 프로그램이 종료될때 소멸
		
		
		//인스턴스변수  클래스영역	인스턴스 생성시 거의 99퍼센트가 인스턴트 변수
//		// 객체선언 후에 사용함, 각 인스턴스의 개별적인 저장공간, 인스턴스마다 다른값 저장가능
		// 인스턴스 생성 후, '참조변수,인스턴스변수명'으로 접근
		// 인스턴스를 생성할때 생성되고, 참조변수가 없을때 가비지컬렉터에 의해 자동 제거됨
		// 모두 다 개별로 씀
		
		//지역변수	 메서드 영역	변수 선언문 수행시 
		// 메서드 내에 선언되며, 메서드 종료와 함께 소멸
		// 조건문,반복문 블록{} 내에 선언됨.
		
		
		
	}

}
