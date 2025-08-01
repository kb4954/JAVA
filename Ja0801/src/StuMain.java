import java.util.ArrayList;
import java.util.Scanner;

public class StuMain{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList Stuscore  = new ArrayList();
		StuDeck stuDeck = new StuDeck();
//		Stuscore[] s = new Stuscore[10];
		
		while(true) {
			//상단메뉴 출력메소드
			int choice = stuDeck.menu_print();
			switch(choice) {
			case 1:
				// 학생성적입력 메소드
				stuDeck.stu_input(list);
				break;
			case 2:
				// 학생성적출력 메소드
				stuDeck.stu_output(list);
				break;
			case 3:
				break;
			case 4:
				// 누구를 삭제할까요?
				System.out.println();
				System.out.println("[ 학생성적 삭제 ]");
				System.out.println("삭제할 이름을 입력하세요 .");
				String name = scan.next();
				int temp=0;
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().contains(name)) {
						temp=1;
						System.out.println("[ 학생검색 완료 ]");
						System.out.println("[ %s 학생삭제 ] \n",list.get(i));
						System.out.println("1. 삭제");
						System.out.println("2. 취소");
						choice= scan.nextInt();
						switch(choice) {
						case 1:
							System.out.printf("%s 학생을 삭제했습니다. \n",name);
							list.remove(i);
							break;
						}
					
					}
				}
				// 찾는 학생이 없을 경우
				if(temp==0) {
					System.out.println("           [ 학생 검색]      ");
					System.out.println("찾고자 하는 학생이 없습니다. 다시입력하세요! ");
					System.out.println();
				}
			}//switch
		}//while
	}

}
