import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int count=0,no,kor,eng,math,total = 0;
		double avg =0;

		
//		원래 여기 넣었는데 사이즈가 고정이 된다는 불편함이 있어 더이상 배열을 사용하지 않고 리스트로 할것임
//		Stuscore[] s = new Stuscore[10]; 
		while(true) {
			// 상단메뉴, 출력 메소드
			int choice = StuDeck.menu_print();
			switch(choice) {
			case 1:
				// 성적입력 메소드
				StuDeck.stu_input(list);
				break;
				
			case 2:
				StuDeck.stu_output(list);
				break;

				
				
			}//switch
		}// while
	}

}
