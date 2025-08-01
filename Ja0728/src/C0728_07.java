
public class C0728_07 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "HEART";
		c1.number = 7;
		c1.width = 100;
		c1.height = 250;
		Card c2 = new Card();
		c2.kind = "SPADE";
		c2.number =4;
		
		System.out.printf("%s,%d,%d,%d \n",
				c1.kind,c1.number,c1.width,c1.height);
	}
	
	// 메서드 
	// 작업을 수행하기 위한 명령문의 집합
	// 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다.
	// 입력받는 값이 없을 수도 있고 결과를 돌려주지 않을 수도 있다.
	// 메서드 장점과 작성지침
	
	// 리턴 타임  메서드 이름 ( 타입변수명, 타입변수명,...)
	/*int add(int a, int b) {
	 * int resulte = a+b;
	 * return resulte; 호출한 메서드로 결과를 반환한다. 아니면 에러남.
	 * 반환값이 없는 경우 void를 사용함
	 * void power(){
	 * }
	 * 
	 * 
	 * return문
	 * - 메서드가 정상적으로 종료되는 경우
	 * - 메서드의 블럭{}의 끝에 도달했을때
	 * - 메서드의 블럭{}을 수행 도중 return 문을 만났을때
	 * 
	 * return문
	 * 현재 실행중인 메서드를 종료하고 호출한 메서드로 되돌아간다.
	 * 
	 * 
	 * }*/ 
	
}
